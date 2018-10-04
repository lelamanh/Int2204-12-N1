/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMI;

import lab4.BMI;
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
public class BMIIT {
    
    public BMIIT() {
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
    public void testBMI() {
        System.out.println("BMI");
        assertEquals("Bình thường",BMI.kiemtra(65f,1.8f));
    }
     @Test
    public void testBMI1() {
        System.out.println("BMI");
        assertEquals("Béo phì",BMI.kiemtra(65f,1.75f));
    }
     @Test
    public void testBMI2() {
        System.out.println("BMI");
        assertEquals("Béo phì",BMI.kiemtra(65f,1.2f));
    }
      @Test
    public void testBMI3() {
        System.out.println("BMI");
        assertEquals("Thiếu cân",BMI.kiemtra(40f,1.8f));
    }
       @Test
    public void testBMI4() {
        System.out.println("BMI");
        assertEquals("Bình thường",BMI.kiemtra(60f,1.7f));
    }
}
