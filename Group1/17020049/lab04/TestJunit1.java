import org.junit.Test;
import static org.junit.Assert.*;
import java.beans.Transient;

public class TestJunit1 {
    
    //test MAX
    @Test 
    public void testMax() {
        int max = Lab04.Max(3, 4);
        assertEquals(4, max);
    }
    //test MaxArray
    @Test 
    public void testMaxArray() {
        int[] arr = {1,2,3,2,6,43,6,2,0,42,75};
        int maxArray = Lab04.MaxArray(arr);
        assertEquals(75, maxArray);
    }
    //test BMI
    @Test 
    public void testBMI() {
        String bmi = Lab04.BMI(40, 1.5);
        assertEquals("Thieu can", bmi);
    }
    
}