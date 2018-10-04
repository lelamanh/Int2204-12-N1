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
public class MINIT {
    
    public MINIT() {
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
     * Test of MIN method, of class MIN.
     */
    @Test
    public void testMIN() {
        System.out.println("MIN");
        
        int[] a = {0,1,2,3,4};
        int expResult = 0;
        int result = MIN.MIN(a);
        assertEquals(expResult, result);
        
        
    }
    @Test
    public void testMIN1() {
        System.out.println("MIN");
        int[] n = {-15,1,2,3,7};
        int expResult = 0;
        int result = MIN.MIN(n);
        assertEquals(expResult, result);
        
    }
     @Test
    public void testMIN2() {
        System.out.println("MIN");
        int[] n = {-15,8,2,3,7};
        int expResult = 0;
        int result = MIN.MIN(n);
        assertEquals(expResult, result);
    } 
    
         @Test
    public  void testMIN3(){
        System.out.println("MIN");
        int[] n = {-15,8,2,3,1};
        int expResult = 0;
        int result = MIN.MIN(n);
        assertEquals(expResult, result);
        
    }
         @Test
    public  void testMIN4(){
        System.out.println("MIN");
        int[] n = {-15,8,5,3,1};
        int expResult = 0;
        int result = MIN.MIN(n);
        assertEquals(expResult, result);
        
    }
}
