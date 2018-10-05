/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import lab04.java.Lab04Java;
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
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
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
    public void test1(){
        assertEquals(Lab04Java.GTLN(6, 7),7);
    }
    @Test
    public void test2(){
        assertEquals(Lab04Java.GTLN(6, 8),7);
    }
    @Test
    public void test3(){
        assertEquals(Lab04Java.GTLN(-6, -7),7);
    }
    @Test
    public void test4(){
        assertEquals(Lab04Java.GTLN(6, 79),79);
    }
    @Test
    public void test5(){
        assertEquals(Lab04Java.GTLN(60, 7),7);
    }
    @Test
    public void test6(){
        int[] a = {1,5,15,4,36};
        assertEquals(Lab04Java.minValue(a),7);
    }
    @Test
    public void test7(){
        int[] a = {1,5,45,6,132,23};
        assertEquals(Lab04Java.minValue(a),1);
    }
    @Test
    public void test8(){
        int[] a = {12,15,35,486};
        assertEquals(Lab04Java.minValue(a),23);
    }
    @Test
    public void test9(){
        int[] a = {26,3,56};
        assertEquals(Lab04Java.minValue(a),3);
    }
    @Test
    public void test10(){
        int[] a = {12,453,45,4};
        assertEquals(Lab04Java.minvalue(a),4);
    }
    @Test
    public void test11(){
        assertEquals(Lab04Java.BodyMassIndex(1,25),"Thieu can");
    }
    @Test
    public void test12(){
        assertEquals(Lab04Java.BodyMassIndex(1,25),"Thua can");
    }
    @Test
    public void test13(){
        assertEquals(Lab04Java.BodyMassIndex(1,24),"Beo phi");
    }
    @Test
    public void test14(){
        assertEquals(Lab04Java.BodyMassIndex(2,96),"Binh thuong");
    }
    @Test
    public void test15(){
        assertEquals(Lab04Java.BodyMassIndex(1.7,80),"Beo phi");
    }
}
