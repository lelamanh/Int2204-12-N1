/**
 *
 * @author longhoang08
 */

import java.util.Random;
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

    @Test
    public void testMax1()
    {
        System.out.println("Test max function");
        int a = 0;
        int b = 2;
        int expResult = 2;
        int result = Lab04.max(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMax2()
    {
        System.out.println("Test max function");
        int a = 1;
        int b = 2;
        int expResult = 2;
        int result = Lab04.max(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMax3()
    {
        System.out.println("Test max function");
        int a = -1;
        int b = 10;
        int expResult = 10;
        int result = Lab04.max(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMax4()
    {
        System.out.println("Test max function");
        int a = -1;
        int b = -2;
        int expResult = -1;
        int result = Lab04.max(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMax5()
    {
        System.out.println("Test max function");
        int a = 10;
        int b = 10;
        int expResult = 10;
        int result = Lab04.max(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMinElement1()
    {
        System.out.println("Test Min Element function by random number");
        int[] a = new int[10];
        Random random = new Random();
        int expResult = 1000000000;
        for(int i = 0; i < a.length; i++) 
        {
            a[i] = random.nextInt(1000) + 1;
            expResult = Math.min(expResult, a[i]);
        }
        int result = Lab04.minElement(a);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMinElement2()
    {
        System.out.println("Test Min Element function");
        int[] a = new int[] {1, 2, -1, 3, 10};
        int expResult = -1;
        int result = Lab04.minElement(a);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMinElement3()
    {
        System.out.println("Test Min Element function");
        int[] a = new int[] {1, 2, -1, -10, 10131};
        int expResult = -10;
        int result = Lab04.minElement(a);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMinElement4()
    {
        System.out.println("Test Min Element function");
        int[] a = new int[] {12, 21, 100, 35, 10};
        int expResult = 10;
        int result = Lab04.minElement(a);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMinElement5()
    {
        System.out.println("Test Min Element function");
        int[] a = new int[] {12, 12, 13, 13, 12};
        int expResult = 12;
        int result = Lab04.minElement(a);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBMI1()
    {
        System.out.println("Test BMI function");
        String result = Lab04.bodyStatus(Lab04.BMI(63,1.90));
        String expResult = "Thieu can";
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBMI2()
    {
        System.out.println("Test BMI function");
        String result = Lab04.bodyStatus(Lab04.BMI(63,1.77));
        String expResult = "Binh thuong";
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBMI3()
    {
        System.out.println("Test BMI function");
        String result = Lab04.bodyStatus(Lab04.BMI(65,1.65));
        String expResult = "Thua can";
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBMI4()
    {
        System.out.println("Test BMI function");
        String result = Lab04.bodyStatus(Lab04.BMI(70,1.70));
        String expResult = "Thua can";
        assertEquals(expResult, result);
    }
    
    @Test
    public void testBMI5()
    {
        System.out.println("Test BMI function");
        String result = Lab04.bodyStatus(Lab04.BMI(100,1.70));
        String expResult = "Beo phi";
        assertEquals(expResult, result);
    }   
}
