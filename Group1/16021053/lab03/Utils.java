public class Utils {
    public static int GCD(int a, int b)
    {
        if(a < b)
        {
            int t = a; a = b; b = t;
        }
        int r = 1;
        while(b > 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}