/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th04;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author huyhabidien
 */
public class TH04Test {
    
    public TH04Test() {
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
     * Test of GTLN method, of class TH04.
     */
    @Test
    public void testGTLN() {
        System.out.println("GTLN");
        int a = 5;
        int b = 0;
        int expResult = 5;
        int result = TH04.GTLN(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of BMI method, of class TH04.
     */
    @Test
    public void testBMI() {
        System.out.println("BMI");
        float cannang = 40.0F;
        float chieucao = 1.50F;
        assertEquals(TH04.BMI( cannang, chieucao),  "thieu can");
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of GTNN method, of class TH04.
     */
    @Test
    public void testGTNN() {
        System.out.println("GTNN");
        int[] a = {1,2,4};
        int expResult = 1;
        int result = TH04.GTNN(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    @Test
    public void testGTLN1() {
        System.out.println("GTLN");
        int a = 57;
        int b = 0;
        int expResult = 57;
        int result = TH04.GTLN(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of BMI method, of class TH04.
     */
    @Test
    public void testBMI1() {
        System.out.println("BMI");
        float cannang = 48.0F;
        float chieucao = 1.50F;
        assertEquals(TH04.BMI( cannang, chieucao),  "BT");
         
    }

    /**
     * Test of GTNN method, of class TH04.
     */
    @Test
    public void testGTNN1() {
        System.out.println("GTNN");
        int[] a = {8,15,-4,9,0};
        int expResult = 8;
        int result = TH04.GTNN(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    @Test
    public void testGTLN2() {
        System.out.println("GTLN");
        int a = 7;
        int b = 15;
        int expResult = 15;
        int result = TH04.GTLN(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of BMI method, of class TH04.
     */
    @Test
    public void testBMI2() {
        System.out.println("BMI");
        float cannang = 85.0F;
        float chieucao = 1.69F;
        assertEquals(TH04.BMI( cannang, chieucao),  "beo phi");
        
    }

    /**
     * Test of GTNN method, of class TH04.
     */
    @Test
    public void testGTNN2() {
        System.out.println("GTNN");
        int[] a = {-1,2,-4,8,0};
        int expResult = -1;
        int result = TH04.GTNN(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    @Test
    public void testGTLN3() {
        System.out.println("GTLN");
        int a = 5;
        int b = 10;
        int expResult = 10;
        int result = TH04.GTLN(a, b);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of BMI method, of class TH04.
     */
    @Test
    public void testBMI3() {
        System.out.println("BMI");
        float cannang = 40.0F;
        float chieucao = 1.70F;
        assertEquals(TH04.BMI( cannang, chieucao),  "thieu can");
      
    }

    /**
     * Test of GTNN method, of class TH04.
     */
    @Test
    public void testGTNN3() {
        System.out.println("GTNN");
        int[] a = {10,20,4,5,0};
        int expResult = 10;
        int result = TH04.GTNN(a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    @Test
    public void testGTLN4() {
        System.out.println("GTLN");
        int a = -10;
        int b = 0;
        int expResult = 0;
        int result = TH04.GTLN(a, b);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of BMI method, of class TH04.
     */
    @Test
    public void testBMI4() {
        System.out.println("BMI");
        float cannang = 55.0F;
        float chieucao = 1.55F;
        assertEquals(TH04.BMI( cannang, chieucao),  "BT");
        
    }

    /**
     * Test of GTNN method, of class TH04.
     */
    @Test
    public void testGTNN4() {
        System.out.println("GTNN");
        int[] a = {10,2};
        int expResult = 10;
        int result = TH04.GTNN(a);
        assertEquals(expResult, result);
       
    }
}
