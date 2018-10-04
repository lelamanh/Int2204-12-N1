package lab4;

import java.util.Arrays;

/**
 *
 * @author anhco
 */

public class MIN {
    public static int MIN(int a[]) {
        Arrays.sort(a);
        return a[0];
    }
}
