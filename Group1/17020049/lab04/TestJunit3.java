import org.junit.Test;
import static org.junit.Assert.*;
import java.beans.Transient;

public class TestJunit3 {
    
    //test MAX
    @Test 
    public void testMax() {
        int max = Lab04.Max(91233, 99191);
        assertEquals(99191, max);
    }
    //test MaxArray
    @Test 
    public void testMaxArray() {
        int[] arr = {5,15,6,2,7,2,6,2,2,7,2,1,7,8,11,46,64,72,88,222,2727,92,10,151,14,3,31,15,1,1,51,51,1,1,6,16,1,15,16,1,155,16,1,1,61};
        int maxArray = Lab04.MaxArray(arr);
        assertEquals(2727, maxArray);
    }
    @Test 
    public void testBMI() {
        String bmi = Lab04.BMI(80, 1.6);
        assertEquals("Beo phi", bmi);
    }
    
}