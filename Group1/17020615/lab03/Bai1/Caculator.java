package Bai1;

public class Caculator {
    public Caculator() {}
    
    public int getGCDOf(int a, int b)
    {
        if (a == 0 || b == 0)
            return Math.abs(a + b);
        else return getGCDOf(b, a % b);
    }

    public long getFibonacciNumberAt(int n)
    {
        long i = 0;
        long j = 1;
        long k = 0;
        
        for (int l = 2; l <= n; l++)
        {
            k = i + j;
            i = j;
            j = k;
        }
        
        return k;
    }
}
