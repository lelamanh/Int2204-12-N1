package lab04;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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

    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Lab04.main(args);

    }

    @Test
    public void testMax1() {
        int expResult1 = 10;
        int result1 = Lab04.Max(10, 0);
        assertEquals(expResult1, result1);
    }

    @Test
    public void testMax2() {
        int expResult2 = 100;
        int result2 = Lab04.Max(10, 100);
        assertEquals(expResult2, result2);
    }

    @Test
    public void testMax3() {
        int expResult3 = 150;
        int result3 = Lab04.Max(150, 10);
        assertEquals(expResult3, result3);
    }

    @Test
    public void testMax4() {
        int expResult4 = 10;
        int result4 = Lab04.Max(10, 3);
        assertEquals(expResult4, result4);
    }

    @Test
    public void testMax5() {
        int expResult5 = 10;
        int result5 = Lab04.Max(10, 2);
        assertEquals(expResult5, result5);
    }

    @Test
    public void testMinArr1() {
        int[] arr1 = {0, 2, 35, 5, 5};
        int expResult = 0;
        int result = Lab04.MinArr(arr1);
        assertEquals(expResult, result);

    }

    @Test
    public void testMinArr2() {
        int[] arr2 = {100, 15, 20, 25, 26};
        int expResult = 15;
        int result = Lab04.MinArr(arr2);
        assertEquals(expResult, result);

    }

    @Test
    public void testMinArr3() {
        int[] arr3 = {5, 100, 5255, 26, 1, 215, 35, 9, 100};
        int expResult = 1;
        int result = Lab04.MinArr(arr3);
        assertEquals(expResult, result);
    }

    @Test
    public void testMinArr4() {
        int[] arr4 = {10, 15, 20};
        int expResult = 10;
        int result = Lab04.MinArr(arr4);
        assertEquals(expResult, result);

    }

    @Test
    public void testMinArr5() {
        int[] arr5 = {10, 15};
        int expResult = 10;
        int result = Lab04.MinArr(arr5);
        assertEquals(expResult, result);

    }

    @Test
    public void testBMI1() {
        int weight = 70;
        int hight = 150;
        String expResult = "Beo phi";
        String result;
        result = Lab04.BMI(weight, hight);
        assertEquals(expResult, result);
    }

    @Test
    public void testBMI2() {
        int weight = 50;
        int hight = 150;
        String expResult = "Binh thuong";
        String result;
        result = Lab04.BMI(weight, hight);
        assertEquals(expResult, result);
    }

    @Test
    public void testBMI3() {
        int weight = 30;
        int hight = 150;
        String expResult = "Thieu can";
        String result;
        result = Lab04.BMI(weight, hight);
        assertEquals(expResult, result);
    }

    @Test
    public void testBMI4() {
        int weight = 100;
        int hight = 150;
        String expResult = "Beo phi";
        String result;
        result = Lab04.BMI(weight, hight);
        assertEquals(expResult, result);
    }

    @Test
    public void testBMI5() {
        int weight = 80;
        int hight = 200;
        String expResult = "Binh thuong";
        String result;
        result = Lab04.BMI(weight, hight);
        assertEquals(expResult, result);

    }
}
