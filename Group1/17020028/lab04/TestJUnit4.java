import org.junit.Test;
import static org.junit.Assert.*;
import java.beans.Transient;

public class TestJUnit4
{
    @Test
    public void testMax()
    {
        int mx = Homework.max(100, -100);
        assertEquals(100, mx);
    }

    @Test
    public void testMin()
    {
        int[] a = {-1, -2, -3, -4, -5, -6, -7};
        int mn = Homework.min(a);
        assertEquals(-7, mn);
    }

    @Test
    public void testBMI()
    {
        String bmi = Homework.BMI(70, 1.75);
        assertEquals("Binh thuong", bmi);
    }

}