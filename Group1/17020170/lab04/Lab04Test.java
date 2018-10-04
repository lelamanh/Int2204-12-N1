/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Minh
 */
public class Lab04Test {
    
    public Lab04Test() {
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
     * Test of findMax method, of class Lab04.
     */
    @Test
    public void testFindMax() {
        System.out.println("findMax");
        int a = 10;
        int b = 20;
        int expResult = 20;
        int result = Lab04.findMax(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testFindMax2() {
        System.out.println("findMax");
        int a = 15;
        int b = 99;
        int expResult = 99;
        int result = Lab04.findMax(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testFindMax3() {
        System.out.println("findMax");
        int a = 10;
        int b = 0;
        int expResult = 10;
        int result = Lab04.findMax(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testFindMax4() {
        System.out.println("findMax");
        int a = 10;
        int b = 20;
        int expResult = 20;
        int result = Lab04.findMax(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    @Test
    public void testFindMax5() {
        System.out.println("findMax");
        int a = 10;
        int b = 20;
        int expResult = 20;
        int result = Lab04.findMax(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of findMinArray method, of class Lab04.
     */
    @Test
    public void testFindMinArray() {
        System.out.println("findMinArray");
        int[] array = {1, 2, 3, 4, 6};
        int expResult = 1;
        int result = Lab04.findMinArray(array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testFindMinArray2() {
        System.out.println("findMinArray");
        int[] array = {-99, 2, 3, 4, 6};
        int expResult = -99;
        int result = Lab04.findMinArray(array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testFindMinArray3() {
        System.out.println("findMinArray");
        int[] array = {1, 2, -3, 4, 6};
        int expResult = -3;
        int result = Lab04.findMinArray(array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testFindMinArray4() {
        System.out.println("findMinArray");
        int[] array = {10, 2, 3, 4, 6};
        int expResult = 2;
        int result = Lab04.findMinArray(array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testFindMinArray5() {
        System.out.println("findMinArray");
        int[] array = {1, 2, 3, 4, 6, -9};
        int expResult = -9;
        int result = Lab04.findMinArray(array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of BMI method, of class Lab04.
     */
    @Test
    public void testBMI() {
        System.out.println("BMI");
        double weigh = 90.0;
        double height = 1.7;
        String expResult = "Beo phi";
        String result = Lab04.BMI(weigh, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBMI2() {
        System.out.println("BMI");
        double weigh = 90.0;
        double height = 1.7;
        String expResult = "Beo phi";
        String result = Lab04.BMI(weigh, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBMI3() {
        System.out.println("BMI");
        double weigh = 70.0;
        double height = 1.7;
        String expResult = "Thua can";
        String result = Lab04.BMI(weigh, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBMI4() {
        System.out.println("BMI");
        double weigh = 60.0;
        double height = 1.7;
        String expResult = "Binh thuong";
        String result = Lab04.BMI(weigh, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testBMI5() {
        System.out.println("BMI");
        double weigh = 40.0;
        double height = 1.7;
        String expResult = "Thieu can";
        String result = Lab04.BMI(weigh, height);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Lab04.
     */
    
}
