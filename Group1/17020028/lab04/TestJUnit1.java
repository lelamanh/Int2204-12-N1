import org.junit.Test;
import static org.junit.Assert.*;
import java.beans.Transient;

public class TestJUnit1
{
    @Test
    public void testMax()
    {
        int mx = Homework.max(5, 6);
        assertEquals(6, mx);
    }

    @Test
    public void testMin()
    {
        int[] a = {5, 3, 2, 1, 7, 9, 8};
        int mn = Homework.min(a);
        assertEquals(1, mn);
    }

    @Test
    public void testBMI()
    {
        String bmi = Homework.BMI(70, 1.7);
        assertEquals("Binh thuong", bmi);
    }

}