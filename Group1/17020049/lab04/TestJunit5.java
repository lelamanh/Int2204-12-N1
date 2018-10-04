import org.junit.Test;
import static org.junit.Assert.*;
import java.beans.Transient;
public class TestJunit5 {
    
    //test MAX
    @Test 
    public void testMax() {
        int max = Lab04.Max(5654, 121);
        assertEquals(5654, max);
    }
    //test MaxArray
    @Test 
    public void testMaxArray() {
        int[] arr = {1};
        int maxArray = Lab04.MaxArray(arr);
        assertEquals(1, maxArray);
    }
    @Test 
    public void testBMI() {
        String bmi = Lab04.BMI(20, 1);
        assertEquals("Binh thuong", bmi);
    }
    
}