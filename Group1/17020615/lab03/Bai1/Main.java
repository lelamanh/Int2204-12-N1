package Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Caculator c = new Caculator();
        Scanner sc = new Scanner(System.in);

        int temp1, temp2;

        temp1 = sc.nextInt();
        temp2 = sc.nextInt();

        System.out.println(c.getGCDOf(temp1, temp2));

        temp1 = sc.nextInt();

        System.out.println(c.getFibonacciNumberAt(temp1));
    }
}
