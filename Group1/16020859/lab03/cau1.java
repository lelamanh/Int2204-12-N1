/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author anhco
 */
public class cau1 {

    public int UCLN(int a, int b) {
        if (a < 0 && b < 0) {
            return UCLN(-a,-b);
        }
        if (a < 0 || b < 0) {
            if (a < 0) {
               return UCLN(-a,b);
            }
            if (b < 0) {
               return UCLN(a,-b);
            }
        }
        if (a > 0 && b > 0) {
            if (a == b) {
                return a;
            } else if (a > b) {
                return UCLN(a - b, b);
            } else {
                return UCLN(b - a, a);
            }
        }
        return 0;
    }

    public int Fibonaxi(int n) {
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return Fibonaxi(n - 1) + Fibonaxi(n - 2);
        }
    }

    public static void main(String[] args) {
        int a = -15, b = 5;
        cau1 test = new cau1();
        System.out.println("ước chung lớn nhất:" + test.UCLN(a, b));
        System.out.println("Fibonaxi:" + test.Fibonaxi(10));

    }
}
