import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class maxIntTest {
    @Test
    public void compareIntTest1() {
        assertEquals(5, Lab04.compareInt(4,5));
    }

    @Test
    public void compareIntTest2() {
        assertEquals(2, Lab04.compareInt(2,1));
    }

    @Test
    public void compareIntTest3() {
        assertEquals(9, Lab04.compareInt(4,9));
    }

    @Test
    public void compareIntTest4() {
        assertEquals(3, Lab04.compareInt(1,3));
    }

    @Test
    public void compareIntTest5() {
        assertEquals(7, Lab04.compareInt(4,7));
    }
}
