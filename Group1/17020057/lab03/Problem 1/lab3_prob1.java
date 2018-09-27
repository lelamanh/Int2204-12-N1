public class lab3_prob1
{
    public static void main(String[] args) 
    {
        lab3_prob1 slover = new lab3_prob1();
        System.out.println(slover.gcd(-15, 5));
        System.out.println(slover.gcd(0, 5));
        System.out.println(slover.gcd(6, 15));
        System.out.println(slover.F(5));
        System.out.println(slover.F(4));
        System.out.println(slover.F(7));
    }

    // caculate GCD(a, b)
    private int gcd(int a, int b)
    {
        /* 
        Euclid's algorithm:
        a >= b
        r = a % b
        GCD(a, b) = GCD(b, r) if r > 0;
        GCD(a, b) = b if r = 0;
        */
        if (b == 0 || a == 0) return Math.abs(a + b);
        return gcd(b, a % b); 
    }

    // caculate n-th Fibonacci number
    private int F(int n)
    {
        if (n == 0) return 0; // F(0) = 0 
        if (n == 1) return 1; // F(1) = 1
        return F(n - 1) + F(n-2); // F(n) = F(n-1) + F(n-2) if n > 1
    }

}