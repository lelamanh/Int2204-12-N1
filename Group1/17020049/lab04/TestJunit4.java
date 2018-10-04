import org.junit.Test;
import static org.junit.Assert.*;
import java.beans.Transient;

public class TestJunit4 {
    
    //test MAX
    @Test 
    public void testMax() {
        int max = Lab04.Max(-19120, -10022);
        assertEquals(-10022, max);
    }
    //test MaxArray
    @Test 
    public void testMaxArray() {
        int[] arr = {56,14,15,7,7,22,23,2,52,62,662,2,2,1,1,1616,1,67,783,22,45,72,4,252,72245,253,63,22,2,0,74,2,23,42,234,15,35,61,11,1};
        int maxArray = Lab04.MaxArray(arr);
        assertEquals(72245, maxArray);
    }
    @Test 
    public void testBMI() {
        String bmi = Lab04.BMI(70, 1.8);
        assertEquals("Binh thuong", bmi);
    }
    
}