import org.junit.Test;
import static org.junit.Assert.*;
import java.beans.Transient;

public class TestJUnit2
{
    @Test
    public void testMax()
    {
        int mx = Homework.max(-5, -6);
        assertEquals(-5, mx);
    }

    @Test
    public void testMin()
    {
        int[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int mn = Homework.min(a);
        assertEquals(1, mn);
    }

    @Test
    public void testBMI()
    {
        String bmi = Homework.BMI(70, 1.7);
        assertEquals("Thua can", bmi);
    }

}