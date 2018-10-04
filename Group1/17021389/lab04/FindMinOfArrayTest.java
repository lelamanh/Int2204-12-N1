import org.junit.Test;

import junit.framework.Assert;

import static org.junit.Assert.*;

public class FindMinOfArrayTest {

    /*
        five methods to check methods findMinOfArray in class FindMinOfArray
     */


    @Test
    public void findMinOfArray1() {

        try {
            int[] arr1 = {1, 3, 2 - 4, -5};

            assertEquals(-5, FindMinOfArray.findMinOfArray(arr1));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    @Test
    public void findMinOfArray2() {
        try {
            int[] arr2 = {1, -100, 2 - 4, -5, 42};
            assertEquals(-100, FindMinOfArray.findMinOfArray(arr2));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    @Test
    public void findMinOfArray3() {

        try {
            int[] arr3 = {1, 2, 3, 4, 5, 6, -100};
            assertEquals(-100, FindMinOfArray.findMinOfArray(arr3));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    @Test
    public void findMinOfArray4() {


        try {
            int[] arr4 = {1, 10, 2 - 4, -5, 10, 12, 4, 21};
            assertEquals(-5, FindMinOfArray.findMinOfArray(arr4));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    @Test
    public void findMinOfArray5() {


        try {
            int[] arr5 = {1, -9, 2 - 4, -5, 5, 234, 242};
            assertEquals(-9, FindMinOfArray.findMinOfArray(arr5));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}