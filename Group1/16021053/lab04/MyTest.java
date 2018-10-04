

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyTest {
    // test max
    @Test
    public void testUtilsMax1() {
        assertEquals(5, Utils.max(-1000, 5));
    }

    @Test
    public void testUtilsMax2() {
        assertEquals(5, Utils.max(4, 5));

    }
    @Test
    public void testUtilsMax3() {
        assertEquals(Integer.MAX_VALUE, Utils.max(0, Integer.MAX_VALUE));

    }
    @Test
    public void testUtilsMax4() {
        assertEquals(5, Utils.max(Integer.MIN_VALUE, 5));
    }
    @Test
    public void testUtilsMax5() {
        assertEquals(-20, Utils.max(-20, -100));
    }

    // test minArr
    @Test
    public void testMinArr() {
        assertEquals(4,Utils.minArr(new int[]{9, 8, 7, 6, 4}));

    }
    @Test
    public void testMinArr1() {
        assertEquals(Integer.MIN_VALUE,Utils.minArr(new int[]{9, Integer.MIN_VALUE, 7, 6, 4}));
    }
    @Test
    public void testMinArr2() {
        assertEquals(-9,Utils.minArr(new int[]{-9, -8, 7, -6, -4}));
    }
    @Test
    public void testMinArr3() {
        assertEquals(-19,Utils.minArr(new int[]{-19, 18, 7, 6, -4}));

    }
    @Test
    public void testMinArr4() {
        assertEquals(-600,Utils.minArr(new int[]{-109, 8, 7, -600, 400}));
    }

    // test ibm
    @Test
    public void testIBM() {
        assertEquals("Thieu", Utils.IBM(53.0f, 1.7f));

    }
    @Test
    public void testIBM2() {
        assertEquals("Thieu can",Utils.IBM(56.0f, 1.9f));

    }
    @Test
    public void testIBM3() {
        assertEquals("Binh thuong",Utils.IBM(60.0f, 1.7f));
    }
    @Test
    public void testIBM4() {
        assertEquals("Thua can",Utils.IBM(47.04f, 1.4f));
    }
    @Test
    public void testIBM5() {
        assertEquals("Beo phi",Utils.IBM(59.0f, 1.2f));
    }

}
