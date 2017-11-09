/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author test-1
 */
public class GameoflifeTest {
    
    public GameoflifeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNbCol method, of class Gameoflife.
     */
    @Test
    public void testGetNbCol() {
        System.out.println("getNbCol");
        Gameoflife instance = new Gameoflife();
        int expResult = 0;
        int result = instance.getNbCol();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNbCol method, of class Gameoflife.
     */
    @Test
    public void testSetNbCol() {
        System.out.println("setNbCol");
        int nbCol = 0;
        Gameoflife instance = new Gameoflife();
        instance.setNbCol(nbCol);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNbLigne method, of class Gameoflife.
     */
    @Test
    public void testGetNbLigne() {
        System.out.println("getNbLigne");
        Gameoflife instance = new Gameoflife();
        int expResult = 0;
        int result = instance.getNbLigne();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNbLigne method, of class Gameoflife.
     */
    @Test
    public void testSetNbLigne() {
        System.out.println("setNbLigne");
        int nbLigne = 0;
        Gameoflife instance = new Gameoflife();
        instance.setNbLigne(nbLigne);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class Gameoflife.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        Gameoflife instance = new Gameoflife();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of iterate method, of class Gameoflife.
     */
    @Test
    public void testIterate() {
        System.out.println("iterate");
        Gameoflife instance = new Gameoflife();
        instance.iterate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNbVoisinVivant method, of class Gameoflife.
     */
    @Test
    public void testGetNbVoisinVivant() {
        System.out.println("getNbVoisinVivant");
        System.out.println("isCellVivant");
        
        
    }

    /**
     * Test of calculerNouvelEtat method, of class Gameoflife.
     */
    @Test
    public void testCalculerNouvelEtat() {
        System.out.println("calculerNouvelEtat");
        Gameoflife instance = new Gameoflife();
        assertEquals(0,instance.calculerNouvelEtat(0, 0));
        assertEquals(0,instance.calculerNouvelEtat(0, 1));
        assertEquals(0,instance.calculerNouvelEtat(0, 2));
        assertEquals(0,instance.calculerNouvelEtat(0, 3));
        assertEquals(0,instance.calculerNouvelEtat(0, 4));
        
        assertEquals(0,instance.calculerNouvelEtat(1, 0));
        assertEquals(0,instance.calculerNouvelEtat(1, 1));
        assertEquals(0,instance.calculerNouvelEtat(1, 2));
        assertEquals(0,instance.calculerNouvelEtat(1, 3));
        assertEquals(0,instance.calculerNouvelEtat(1, 4));
        
        assertEquals(0,instance.calculerNouvelEtat(2, 0));
        assertEquals(0,instance.calculerNouvelEtat(2, 1));
        assertEquals(0,instance.calculerNouvelEtat(2, 2));
        assertEquals(0,instance.calculerNouvelEtat(2, 3));
        assertEquals(0,instance.calculerNouvelEtat(2, 4));
        
        assertEquals(0,instance.calculerNouvelEtat(3, 0));
        assertEquals(0,instance.calculerNouvelEtat(3, 1));
        assertEquals(0,instance.calculerNouvelEtat(3, 2));
        assertEquals(0,instance.calculerNouvelEtat(3, 3));
        assertEquals(0,instance.calculerNouvelEtat(3, 4));
    }

    /**
     * Test of setVivant method, of class Gameoflife.
     */
    @Test
    public void testSetVivant() {
        System.out.println("setVivant");
        int ligne = 0;
        int col = 0;
        Gameoflife instance = new Gameoflife();
        instance.setVivant(ligne, col);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCellVivant method, of class Gameoflife.
     */
    @Test
    public void testIsCellVivant() {
        System.out.println("isCellVivant");
        int ligne = 0;
        int col = 0;
        Gameoflife instance = new Gameoflife();
        int expResult = 0;
        int result = instance.isCellVivant(ligne, col);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paint method, of class Gameoflife.
     */
    @Test
    public void testPaint() {
        System.out.println("paint");
        Graphics g = null;
        Gameoflife instance = new Gameoflife();
        instance.paint(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of redraw method, of class Gameoflife.
     */
    @Test
    public void testRedraw() {
        System.out.println("redraw");
        Gameoflife instance = new Gameoflife();
        instance.redraw();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fromFile method, of class Gameoflife.
     */
    @Test
    public void testFromFile() throws Exception {
        System.out.println("fromFile");
        File f = new File("test/simple.txt");
        Gameoflife result = Gameoflife.fromFile(f);
        assertEquals(3, result.getNbCol());
        assertEquals(3, result.getNbLigne());
    }

    /**
     * Test of toFile method, of class Gameoflife.
     */
    @Test
    public void testToFile() throws Exception {
        System.out.println("toFile");
        Gameoflife gof = null;
        File f = null;
        Gameoflife expResult = null;
        Gameoflife result = Gameoflife.toFile(gof, f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }   
}