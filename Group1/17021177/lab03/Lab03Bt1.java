/*
*
* @Class GCD & Fibonacci
* @Author Phạm Thiên Long
*
* */
import java.util.Scanner;

public class Lab03Bt1
{
    private int temp = 0;

    private int MaxFibonacci;  //Decision how many Fibonacci number showed

    public int getMaxFibonacci() {return this.MaxFibonacci;}
    public void setMaxFibonacci(int i) {this.MaxFibonacci = i;}

    public static void main(String[] args)
    {
        Lab03Bt1 newMathProgram = new Lab03Bt1();
        Scanner sc = new Scanner(System.in);

        /*Nhap so thu 1*/
        System.out.print("Nhap so thu 1: ");
        int a = sc.nextInt();
        System.out.println();

        /*Nhap so thu 2*/
        System.out.print("Nhap so thu 2: ");
        int b = sc.nextInt();
        System.out.println();

        /*Nhap n de ra f(n)*/
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        System.out.println();

        System.out.println(newMathProgram.USCLN(a, b));
        newMathProgram.Fibonacci(n);
    }

    /*
    * function find GCD
    * */
    public int USCLN(int a, int b) {
        if (b == 0)
            return a;
        else
        {
            return USCLN(b, a % b);
        }
    }

    /*
    * function print Fibonacci number
    * */
    public void Fibonacci(int n)
    {
        int[] FibonacciArray = new int[n];
        FibonacciArray[0] = 0;
        FibonacciArray[1] = 1;
        for (int i = 2; i < n; i++)
        {
            FibonacciArray[i] = FibonacciArray[i - 1] + FibonacciArray[i - 2];
        }
        System.out.println(FibonacciArray[n - 1]);
    }
}
