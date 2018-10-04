import org.junit.Test;
import static org.junit.Assert.*;
import java.beans.Transient;

public class TestJUnit5
{
    @Test
    public void testMax()
    {
        int mx = Homework.max(100, 198 / 2);
        assertEquals(100, mx);
    }

    @Test
    public void testMin()
    {
        int[] a = {12/3, 2*6, 3*4, 6*4, -5*-6, - 6 + 15, 0*100};
        int mn = Homework.min(a);
        assertEquals(0, mn);
    }

    @Test
    public void testBMI()
    {
        String bmi = Homework.BMI(50, 1.75);
        assertEquals("Thieu can", bmi);
    }

}