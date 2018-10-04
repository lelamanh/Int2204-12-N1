import org.junit.Test;
import static org.junit.Assert.*;
import java.beans.Transient;

public class TestJUnit3
{
    @Test
    public void testMax()
    {
        int mx = Homework.max(1, 1);
        assertEquals(2, mx);
    }

    @Test
    public void testMin()
    {
        int[] a = {1, -1};
        int mn = Homework.min(a);
        assertEquals(-1, mn);
    }

    @Test
    public void testBMI()
    {
        String bmi = Homework.BMI(70, 1.75);
        assertEquals("Binh thuong", bmi);
    }

}