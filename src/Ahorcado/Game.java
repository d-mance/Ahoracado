/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahorcado;

import java.util.Scanner;

/**
 *
 * @author dmance
 */
public class Game {

    public static void main(String[] args) {
    //setting up the variables for run the app
    Scanner lector = new Scanner (System.in);
    Juego game = new Juego();
    String resposta,llegit="";
    boolean valid;
    char c;
    
    do{
        //game start
        game.startGame();
        System.out.println("La paraula que has d'encertar té "+game.paraulaLenght()+" lletres");
        
        do
        {
            valid=false;
            do{
                System.out.println ("Si us plau, Escriu una lletra valida");
                llegit=lector.nextLine().toUpperCase();
                if(llegit.matches("[ABCDEFGHIJKLMNÑOPQRSTUVWXYZ ]")) valid=true;
              }while(valid == false || llegit.isEmpty() || llegit==null);
                
            c=llegit.toUpperCase().charAt(0);   
            
            if(!game.checkLetter(c))
            {
                System.out.println("Aquesta lletra no es troba dins de la paraula. Ara et queden "+ (10-game.getCount()) + " intents");
                if(game.gameOver()) System.out.println("Has esgotat tots els intents");
            }else
            {                
                System.out.println("panel "+game.getPanela());
                System.out.println("Molt bé!!! Torna a intentar-ho");
                
                if(game.gameWon()){
                      System.out.println("Has acabat encertant la paraula. Felicitats!!!!");                      
                  }
            }   
        }while(!game.gameOver());
        
        System.out.println("Vols continuar?(S/N)");
        resposta=lector.nextLine().toUpperCase();
    }while(resposta.equals("S"));
}
}
