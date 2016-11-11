/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Ahorcado.Juego;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author dmance
 */

public class testJuego {
    
    public testJuego() {
    }
    static Juego game;
    @BeforeClass
    public static void beforeClass()
    {
        game = new Juego();
        game.startGame();
        game.setPalabra("MALDICION");
    }
    @Test
    public void checkLetterFalse()
    {
        
        char c='u';
        assertFalse(game.checkLetter(c));
    }
    @Test
    public void checkLetterTrue()
    {
        char c='M';
        assertTrue(game.checkLetter(c));
    }
    
    
}
