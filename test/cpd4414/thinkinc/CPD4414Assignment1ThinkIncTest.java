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
public class CPD4414Assignment1ThinkIncTest {
    
    public CPD4414Assignment1ThinkIncTest() {
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
    
    @Test
    public void testEmptyStringShouldReturnEmptyString() {
        int integer = 42;
        String str = "";
        String expResult = "";
        String result = CPD4414Assignment1ThinkInc.stringPower(str, integer);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLessThanOneShouldReturnNull() {
        int integer = -1;
        String str = "";
        String expResult = null;
        String result = CPD4414Assignment1ThinkInc.stringPower(str,integer);
        assertEquals(expResult, result);   
    }
    
    @Test
    public void testStringAndOneShouldReturnString() {
        int integer = 1;
        String str = "Sample";
        String expResult = "Sample";
        String result = CPD4414Assignment1ThinkInc.stringPower(str, integer);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testStringAndTwoShouldReturnStringDoubled() {
        int integer = 2;
        String str = "bob";
        String expResult = "bobbob";
        String result = CPD4414Assignment1ThinkInc.stringPower(str, integer);
        assertEquals(expResult, result);
    }
        
}
