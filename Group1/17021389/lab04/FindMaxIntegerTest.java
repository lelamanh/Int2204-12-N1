import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaxIntegerTest {

    /*
        five methods to check methods findMaxInteger in class FindMaxInteger
     */

    @Test
    public void findMaxInteger1() {
        try {

            assertEquals(10, FindMaxInteger.findMaxInteger(10 , Integer.MIN_VALUE));

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void findMaxInteger2() {
        try {
            assertEquals(13, FindMaxInteger.findMaxInteger(-12, 13));

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void findMaxInteger3() {
        try {
            assertEquals(0, FindMaxInteger.findMaxInteger(0, -8));

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void findMaxInteger4() {
        try {
            assertEquals(0, FindMaxInteger.findMaxInteger(0, -1));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void findMaxInteger5() {
        try {
            assertEquals(Integer.MAX_VALUE, FindMaxInteger.findMaxInteger(Integer.MAX_VALUE,
                    Integer.MIN_VALUE));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}