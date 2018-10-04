/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author anhco
 */
public class maxintIT {

    public maxintIT() {
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
     * Test of MAX method, of class maxint.
     */
    @Test
    public void testMaxint() {
        System.out.println("maxint");
        int a = 7;
        int b = 8;
        int expResult = 0;
        int result = maxint.maxint(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testMaxint1() {
        System.out.println("maxint");
        int a = 7;
        int b = 8;
        int expResult = 8;
        int result = maxint.maxint(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testMaxint2() {
        System.out.println("maxint");
        int a = 7;
        int b = 5;
        int expResult = 7;
        int result = maxint.maxint(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testMaxint3() {
        System.out.println("maxint");
        int a = 5;
        int b = 8;
        int expResult = 8;
        int result = maxint.maxint(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void testMaxint4() {
        System.out.println("maxint");
        int a = 50;
        int b = 8;
        int expResult = 8;
        int result = maxint.maxint(a, b);
        assertEquals(expResult, result);
    }
}
