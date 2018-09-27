//Ham tinh gia tri cua s Fibonacci thu n

public class Fibonacci {
    public int calcFibonacci(int n) {
        if(n<0)
            throw new IllegalArgumentException("n can't be negative");
        else if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else {
            return calcFibonacci(n-1) + calcFibonacci(n-2);
        }  
    }
    public static void main(String[] args) {
        Fibonacci F = new Fibonacci();
        for(int i= 0; i<100; i++)
            System.out.println(F.calcFibonacci(i));

    }
}
   
    