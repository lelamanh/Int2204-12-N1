import org.junit.Test;
import static org.junit.Assert.*;
import java.beans.Transient;

public class TestJunit2 {
    
    //test MAX
    @Test 
    public void testMax() {
        int max = Lab04.Max(66, -88);
        assertEquals(66, max);
    }
    //test MaxArray
    @Test 
    public void testMaxArray() {
        int[] arr = {5,2,3,2,6,83,9,2,0,42,75,100,84,81,99,5,3,1};
        int maxArray = Lab04.MaxArray(arr);
        assertEquals(1001, maxArray);
    }
    @Test 
    public void testBMI() {
        String bmi = Lab04.BMI(80, 1.8);
        assertEquals("Thua can", bmi);
    }
    
}