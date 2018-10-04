import junit.framework.TestCase;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestCaculator extends TestCase {
    public void testGreaderIn1() {
        assertEquals(3, Caculator.greaderIn(2, 3));
    }

    public void testGreaderIn2() {
        assertEquals(2, Caculator.greaderIn(2, 2));
    }

    public void testGreaderIn3() {
        assertEquals(10000000, Caculator.greaderIn(0, 10000000));
    }

    public void testGreaderIn4() {
        assertEquals(-1, Caculator.greaderIn(-1, -2));
    }

    public void testGreaderIn5() {
        assertEquals(2, Caculator.greaderIn(2, -1));
    }

    public void testSmallestIn1() {
        int[] arrayTest1 = new int[]{1, 2, 4, 5, 6, 8};
        assertEquals(1, Caculator.smallestIn(arrayTest1));
    }

    public void testSmallestIn2() {
        int[] arrayTest2 = new int[]{9, 5, 3, 1};
        assertEquals(1, Caculator.smallestIn(arrayTest2));
    }


    public void testSmallestIn3() {
        int[] arrayTest3 = new int[]{Integer.MIN_VALUE, 2, 12, 3, 24};
        assertEquals(Integer.MIN_VALUE, Caculator.smallestIn(arrayTest3));
    }


    public void testSmallestIn4() {
        int[] arrayTest4 = new int[]{};
        assertEquals(Integer.MAX_VALUE, Caculator.smallestIn(arrayTest4));
    }


    public void testSmallestIn5() {
        int[] arrayTest5 = new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        assertEquals(Integer.MIN_VALUE, Caculator.smallestIn(arrayTest5));
    }

    public void testCaculateBMI1(){
        final ByteArrayOutputStream printedContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(printedContent));

        Caculator.caculateBMI(10, 2);
        assertEquals("Thiếu cân", printedContent.toString());
        printedContent.reset();
    }

    public void testCaculateBMI2(){
        final ByteArrayOutputStream printedContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(printedContent));

        Caculator.caculateBMI(100, 1);
        assertEquals("Béo phì", printedContent.toString());
        printedContent.reset();
    }

    public void testCaculateBMI3(){
        final ByteArrayOutputStream printedContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(printedContent));

        Caculator.caculateBMI(80, 2);
        assertEquals("Bình thường", printedContent.toString());
        printedContent.reset();
    }

    public void testCaculateBMI4(){
        final ByteArrayOutputStream printedContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(printedContent));

        Caculator.caculateBMI(-10, 3);
        assertEquals("Wrong input !!", printedContent.toString());
        printedContent.reset();
    }

    public void testCaculateBMI5(){
        final ByteArrayOutputStream printedContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(printedContent));

        Caculator.caculateBMI(100, 2);
        assertEquals("Thừa cân", printedContent.toString());
        printedContent.reset();
    }
}
