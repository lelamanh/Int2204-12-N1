public class GreatestCommonDivisor
{
    public static int gcd(int a, int b)
    {
        int x = Math.abs(a), y = Math.abs(b), r;
        while (y != 0)
        {
            r = x % y;
            x = y;
            y = r;
        }
        return x;
    }

    public static void main(String[] args)
    {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.print(GreatestCommonDivisor.gcd(a, b));
    }
}