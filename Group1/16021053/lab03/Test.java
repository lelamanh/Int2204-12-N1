import java.util.Scanner;

public class Test {
    
    public int GCD(int a, int b)
    {
        a = Math.abs(a);
        b = Math.abs(b);
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

    public int Fibonaxi(int n)
    {
        if(n < 0)
        {
            throw new Error("invalid value");
        }
        if(n == 0)
        {
            return 0;
        }
        if(n == 1) {return 1;}
        return Fibonaxi(n-1) + Fibonaxi(n -2);

    }
    public static void main(String[] agrs) {
        Test t = new Test();
        Scanner userInput = new Scanner(System.in);

        
        // test GCD
        int a = userInput.nextInt();
        int b = userInput.nextInt();
        System.out.println("UCLN " + t.GCD(a, b));
    

     
        // test fibonaci
        int n = userInput.nextInt();
        System.out.println("The " + n + "th is " + t.Fibonaxi(n));
        userInput.close();

        // test fraction
        Fraction fa = new Fraction(-2, 3);
        Fraction fb = new Fraction(2, -3);
        boolean isEqual = fa.equals(fb);
        System.out.println(fa.toString() + (isEqual ? " " : " doesnot ") + "equal" + fb.toString());
        System.out.println("Sum of " + fa.toString() +  "and " + fb.toString() + " is " + fa.add(fb).toString());
        System.out.println(fa.toString() +  " - " + fb.toString() + " is " + fa.subtract(fb).toString());
        System.out.println(fa.toString() +  " * " + fb.toString() + " is " + fa.multiply(fb).toString());
        System.out.println(fa.toString() +  " / " + fb.toString() + " is " + fa.divide(fb).toString());



        // test cat
        Cat c = new Cat("tom", 2);
        c.Act();
        
    }
}