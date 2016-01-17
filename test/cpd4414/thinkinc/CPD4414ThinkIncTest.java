/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.thinkinc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author brad
 */
public class CPD4414ThinkIncTest {
    
    public CPD4414ThinkIncTest() {
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
     * Test of main method, of class CPD4414ThinkInc.
     */


    /**
     * Test of stringPower method, of class CPD4414ThinkInc.
     */
    @Test
    public void testStringPower() {
        System.out.println("stringPower");
        String str = "";
        int integer = 0;
        String expResult = "";
        String result = CPD4414ThinkInc.stringPower(str, integer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testEmptyStringShouldReturnEmptyString() {
        int integer = 42;
        String str = "";
        String expResult = "";
        String result = CPD4414ThinkInc.stringPower(str, integer);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLessThanOneShouldReturnNull() {
        int integer = -1;
        String str = "";
        String expResult = null;
        String result = CPD4414ThinkInc.stringPower(str,integer);
        assertEquals(expResult, result);   
    }
    
    @Test
    public void testStringAndOneShouldReturnString() {
        int integer = 1;
        String str = "Sample";
        String expResult = "Sample";
        String result = CPD4414ThinkInc.stringPower(str, integer);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testStringAndTwoShouldReturnStringDoubled() {
        int integer = 2;
        String str = "bob";
        String expResult = "bobbob";
        String result = CPD4414ThinkInc.stringPower(str, integer);
        assertEquals(expResult, result);
    }
        
}
