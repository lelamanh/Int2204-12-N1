/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Lab03 {

    public int UCLN(int a, int b) {
        if (b == 0) {
            return a;
        }
        return UCLN(b, a % b);
    }

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong a : ");
        int a = sc.nextInt();
        System.out.println("Nhap so nguyen duong b : ");
        int b = sc.nextInt();
		Lab03 m = new Lab03();
        System.out.println("Uoc chung lon nhat cua " + a + " va " + b +
                " la " + m.UCLN(a,b));
        System.out.println("Nhap n : ");
        int n = sc.nextInt();
        System.out.println("Fibonacci cua " + n + " la "
                + m.fibonacci(n));
    }

}