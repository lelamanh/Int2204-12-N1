/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CCNE
 */
public class Tuan4Test {
    
    public Tuan4Test() {
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
     * Test of main method, of class Tuan4.
     */
   
    public void testMain() {
		
    }

    /**
     * Test of max2num method, of class Tuan4.
     */
    @Test
    public void testMax2num_1() {
        System.out.println("max2num");
        int x = 0;
        int y = 0;
        int expResult = 0;
        int result = Tuan4.max2num(x, y);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMax2num_2() {
        System.out.println("max2num");
        int x = 3;
        int y = 1;
        int expResult = 3;
        int result = Tuan4.max2num(x, y);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMax2num_3() {
        System.out.println("max2num");
        int x = -1;
        int y = 0;
        int expResult = 0;
        int result = Tuan4.max2num(x, y);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMax2num_4() {
        System.out.println("max2num");
        int x = -3;
        int y = -7;
        int expResult = -3;
        int result = Tuan4.max2num(x, y);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMax2num_5() {
        System.out.println("max2num");
        int x = 6;
        int y = 10;
        int expResult = 10;
        int result = Tuan4.max2num(x, y);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of minArray method, of class Tuan4.
     */
    @Test
    public void testMinArray_1() {
        System.out.println("minArray");
        int[] a = {1,2,3,5,2,21,4,3};
        int expResult = 1;
        int result = Tuan4.minArray(a);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMinArray_2() {
        System.out.println("minArray");
        int[] a = {1,2,3,5,2,21,4,3,0};
        int expResult = 0;
        int result = Tuan4.minArray(a);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMinArray_3() {
        System.out.println("minArray");
        int[] a = {1,2,3,5,2,21,4,-5};
        int expResult = -5;
        int result = Tuan4.minArray(a);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMinArray_4() {
        System.out.println("minArray");
        int[] a = {1,-2,3,-5,2,-21,4,3};
        int expResult = -21;
        int result = Tuan4.minArray(a);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testMinArray_5() {
        System.out.println("minArray");
        int[] a = {1,1,1,1};

        int expResult = 1;
        int result = Tuan4.minArray(a);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of BMI method, of class Tuan4.
     */
    @Test
    public void testBMI_1() {
        System.out.println("BMI");
        double h = 1.9;
        double w = 100;
        String expResult = "beo phi";
        String result = Tuan4.BMI(h, w);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testBMI_2() {
        System.out.println("BMI");
        double h = 1.77;
        double w = 65;
        String expResult = "binh thuong";
        String result = Tuan4.BMI(h, w);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testBMI_3() {
        System.out.println("BMI");
        double h = 1.66;
        double w = 40;
        String expResult = "thieu can";
        String result = Tuan4.BMI(h, w);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testBMI_4() {
        System.out.println("BMI");
        double h = 1.66;
        double w = 66;
        String expResult = "thua can";
        String result = Tuan4.BMI(h, w);
        assertEquals(expResult, result);
        
    }
    @Test
    public void testBMI_5() {
        System.out.println("BMI");
        double h = 1.55;
        double w = 40;
        String expResult = "thieu can";
        String result = Tuan4.BMI(h, w);
        assertEquals(expResult, result);
        
    }
    
}
