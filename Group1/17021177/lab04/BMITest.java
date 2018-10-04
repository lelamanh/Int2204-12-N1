import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BMITest {
    @Test
    public void BMITest1() {
        assertEquals("Thừa cân", Lab04.BMI(66, 1.69));
    }

    @Test
    public void BMITest2() {
        assertEquals("Thiếu cân", Lab04.BMI(50, 1.67));
    }

    @Test
    public void BMITest3() {
        assertEquals("Béo phì", Lab04.BMI(80, 1.75));
    }

    @Test
    public void BMITest4() {
        assertEquals("Bình thường", Lab04.BMI(76, 1.90));
    }

    @Test
    public void BMITest5() {
        assertEquals("Béo phì", Lab04.BMI(72, 1.66));
    }
}
