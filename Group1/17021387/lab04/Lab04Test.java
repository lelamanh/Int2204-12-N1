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
 * @author Administrator
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
     * Test of Int method, of class Lab04.
     */
    @Test
    public void testInt() {
        System.out.println("Int");
        int a = 8;
        int b = 4;
        int expResult = 8;
        int result = Lab04.Int(a, b);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testInt1() {

        int expResult = 7;
        int result = Lab04.Int(-5, 7);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of Array method, of class Lab04.
     */
    @Test
    public void testInt2() {
        System.out.println("Int");
        int a = 2;
        int b = -3;
        int expResult = 2;
        int result = Lab04.Int(a, b);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testInt3() {
        System.out.println("Int");
        int a = 6;
        int b = -1;
        int expResult = 6;
        int result = Lab04.Int(a, b);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testInt4() {
        System.out.println("Int");
        int a = 0;
        int b = -3;
        int expResult = 0;
        int result = Lab04.Int(a, b);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of BMI method, of class Lab04.
     */
    @Test
    public void testArray() {
        System.out.println("Array");
        int[] a = {1, 2, 3};
        int expResult = 1;
        int result = Lab04.Array(a);
        assertEquals(expResult, result);
    }

    @Test
    public void testArray1() {
        System.out.println("Array");
        int[] a = {-1, -2, -3};
        int expResult = -3;
        int result = Lab04.Array(a);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testArray2() {
        System.out.println("Array");
        int[] a = {6, 2, 9};
        int expResult = 2;
        int result = Lab04.Array(a);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testArray3() {
        System.out.println("Array");
        int[] a = {-5, 1, 0};
        int expResult = -5;
        int result = Lab04.Array(a);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testArray4() {
        System.out.println("Array");
        int[] a = {9, 100, 101};
        int expResult = 9;
        int result = Lab04.Array(a);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testBMI() {
        System.out.println("BMI");
        String expResult = "Thiếu cân";
        String result = Lab04.BMI(42, 1.54);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testBMI1() {
        System.out.println("BMI");
        String expResult = "Thừa cân";
        String result = Lab04.BMI(52, 1.49);
        assertEquals(expResult, result);
        
        
    }

    @Test
    public void testBMI2() {
        System.out.println("BMI");
        String expResult = "Bình thường";
        String result = Lab04.BMI(50, 1.5);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testBMI3() {
        System.out.println("BMI");
        String expResult = "Béo phì";
        String result = Lab04.BMI(60, 1.4);
        assertEquals(expResult, result);
        
    }

    @Test
    public void testBMI4() {

        String expResult = "Thiếu cân";
        String result = Lab04.BMI(24, 1.3);
        assertEquals(expResult, result);
        
    }
}