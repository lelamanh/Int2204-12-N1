/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bt04;
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
public class BT04Test {
    @Test
    public void testMax_1(){
        int a = 3;
        int b = 5;
        int result = BT04.max(a, b);
        assertEquals(5, result);
    }
    @Test
    public void testMax_2(){
        int a = 10;
        int b = 20;
        int result = BT04.max(a, b);
        assertEquals(20, result);
    }
    @Test
    public void testMax_3(){
        int a = 11;
        int b = 24;
        int result = BT04.max(a, b);
        assertEquals(24, result);
    }
    @Test
    public void testMax_4(){
        int a = 100;
        int b = 20;
        int result = BT04.max(a, b);
        assertEquals(100, result);
    }
    @Test
    public void testMax_5(){
        int a = 43;
        int b = 32;
        int result = BT04.max(a, b);
        assertEquals(43, result);
    }
    
    
    @Test
    public void testMinArray_1(){
        int A[] = {2 , 6 , 5 , 4 , 3};
        int result = BT04.max_array(A);
        assertEquals(2, result);
    }
    @Test
    public void testMinArray_2(){
        int A[] = {22 , 16 , 45 , 24 , 52};
        int result = BT04.max_array(A);
        assertEquals(16, result);
    }
    @Test
    public void testMinArray_3(){
        int A[] = {12 , 68 , 15 , 34 , 22};
        int result = BT04.max_array(A);
        assertEquals(12, result);
    }
    @Test
    public void testMinArray_4(){
        int A[] = {345 , 1236 , 4535 , 1324 , 4322};
        int result = BT04.max_array(A);
        assertEquals(345, result);
    }
    @Test
    public void testMinArray_5(){
        int A[] = {223 , 126 , 435 , 214 ,342};
        int result = BT04.max_array(A);
        assertEquals(126, result);
    }
    
    @Test
    public void testBMI_1(){
        double weigh = 56;
        double heigh = 1.7;
        String result = BT04.BMI(weigh, heigh);
        assertEquals("Binh thuong", result);
    }
    @Test
    public void testBMI_2(){
        double weigh = 68;
        double heigh = 1.5;
        String result = BT04.BMI(weigh, heigh);
        assertEquals("Beo phi", result);
    }

    @Test
    public void testBMI_3(){
        double weigh = 46;
        double heigh = 1.8;
        String result = BT04.BMI(weigh, heigh);
        assertEquals("Thieu can", result);
    }
    @Test
    public void testBMI_4(){
        double weigh = 80;
        double heigh = 1.9;
        String result = BT04.BMI(weigh, heigh);
        assertEquals("Binh thuong", result);
    }
    @Test
    public void testBMI_5(){
        double weigh = 67;
        double heigh = 1.7;
        String result = BT04.BMI(weigh, heigh);
        assertEquals("Thua can", result);
    }
}
