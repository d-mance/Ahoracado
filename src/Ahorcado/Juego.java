/**
 * Main game application
 * @author daniel mancera
 * @version 1.0
 */

package Ahorcado;

import java.util.Random;

/**
 *
 * @author dmance
 */
public class Juego {

    private final String[] paraules = {"ATOM", "MOLECULA", "BIO", "PERL"};
    private int count;
    private int encerts;
    private String paraula;
    char lletres[];
    
    /**
     * A constructor for the game
     */
    public Juego() {

    }
    /**
     * A method for start a game, it start counters and select a random word
     */
    public void startGame() {
        count = 0;
        encerts = 0;
        Random rnd = new Random();
        int endevina = (int) (rnd.nextDouble() * paraules.length);
        paraula = paraules[endevina];
        lletres = new char[paraula.length()];
        for (int i = 0; i < paraula.length(); i++) {
            lletres[i] = '_';
        }
    }
    /**
     * A method for set the word (for test purposes)
     * @param palabra the word
     */
    public void setPalabra(String palabra)
    {
        this.paraula=palabra;
    }
    /**
     * A method returningn the lenght of the word
     * @return an int with the lenght
     */
    public int paraulaLenght() {
        return paraula.length();
    }
    /**
     * A string returning the selected word
     * @return a string
     */
    public String getParaula() {
        return paraula;
    }
    /**
     * A method for validate the user input, it also update the counters
     * @param c a char
     * @return true if ok false if not
     */
    public boolean checkLetter(char c) {
        
                
        if (paraula.indexOf(c) == -1) {
            count++;
            return false;
        } else {
            for (int i = 0; i < lletres.length; i++) {
                if (paraula.charAt(i) == c) {

                    lletres[i] = c;

                    encerts += 1;
                }
            }
            return true;
        }
    }
    /**
     * A method returning the chars correct
     * @return an int
     */
    public int getEncerts()
    {
        return encerts;
    }
    /**
     * a method returning the fails
     * @return an int
     */
    public int getCount() {
        return count;
    }
    /**
     * A method returning true or false if game is won or lost
     * @return true or false
     */
    public boolean gameOver() {
        if (count == 10 || encerts == paraula.length()) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * A method returning if the game is won
     * @return true or false
     */
    public boolean gameWon() {
        if (encerts == paraula.length()) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * A method returning the char array
     * @return a char array
     */
    public char[] getPanel() {
        return lletres;
    }
    /**
     * A method returning a string with the panel
     * @return a string
     */
    public String getPanela() {
        String panel = "";
        for (int i = 0; i < lletres.length; i++) {
            panel = panel + lletres[i];

        }
        return panel;
    }

}
