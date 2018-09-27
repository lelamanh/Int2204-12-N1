public class Fibonacci
{
    private static int[] f = new int[100];

    public static int fibonacci(int i)
    {
        if (f[i] > 0) return f[i];
        return f[i] = ((i < 2) ? i : fibonacci(i-1) + fibonacci(i-2));
    }

    public static void main(String[] args)
    {
        int i = Integer.parseInt(args[0]);
        System.out.print(Fibonacci.fibonacci(i));
    }
}