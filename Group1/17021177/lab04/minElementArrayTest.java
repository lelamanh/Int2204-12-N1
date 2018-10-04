import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class minElementArrayTest {
    @Test
    public void minElementArrayTest1() {
        int[] arr1 = {1, 2, 4, 5, 6};
        assertEquals(1, Lab04.minElementArray(arr1));
    }

    @Test
    public void maxElementArrayTest2() {
        int[] arr2 = {5, 3, 1, 5, 1};
        assertEquals(1, Lab04.minElementArray(arr2));
    }

    @Test
    public void maxElementArrayTest3() {
        int[] arr3 = {1, 4, 2, 9, 0};
        assertEquals(0, Lab04.minElementArray(arr3));
    }

    @Test
    public void maxElementArrayTest4() {
        int[] arr4 = {2, 6, 8, 9, 1};
        assertEquals(1, Lab04.minElementArray(arr4));
    }

    @Test
    public void maxElementArrayTest5() {
        int[] arr5 = {2, 3, 5, 1, 7};
        assertEquals(1, Lab04.minElementArray(arr5));
    }
}
