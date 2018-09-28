package neon;

import java.util.Scanner;

import static java.lang.Math.abs;

public class bai1 {
    private int so1;
    private  int so2;

    public int getSo1() {
        return so1;
    }

    public void setSo1(int so1) {
        this.so1 = so1;
    }

    public int getSo2() {
        return so2;
    }

    public void setSo2(int so2) {
        this.so2 = so2;
    }

    // y a
     public int UCLN(int a, int b) {
         int a1 = abs(a);
         int b1 = abs(b);
         if (a1 == b1) {
             return a1;
         } else {
             while (a1 != b1) {
                 if (a1 > b1) {
                     a1 = a1 - b1;
                 } else {
                     b1 = b1 - a1;
                 }
             }
             return a1;

         }
     }


    // y b
    public int ham_Fibonaxi(int n){
         int mang[] = new int[n+1];

         mang[0]=0;
         mang[1]=1;
         int i =0;

         for(i=2;i<=n;i++){
             mang[i]=mang[i-1]+mang[i-2];
             mang[i]=mang[i];
             mang[i-1]=mang[i-1];

         }
         return mang[n];
    }

    public static void main(String[] args ){
        bai1 a= new bai1();
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1= sc.nextInt();
        System.out.println(a.UCLN(a1,b1));

        bai1 ham = new bai1();
        int so_of_ham = sc.nextInt();
        System.out.println(ham.ham_Fibonaxi(so_of_ham));



    }
}
