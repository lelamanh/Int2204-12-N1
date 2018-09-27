/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author CCNE
 */
public class Baitap {
    public int ucln(int a, int b){
        if(b==0) return a;
        else {
            return ucln(b, a%b);
        }
    }
    public int fibonaci(int n){
        if(n == 0) return 0;
        else if(n == 1 ) return 1;
        else return fibonaci(n-1) + fibonaci(n-2);
    }
    
    public static void main(String[] args) {
        Baitap bt = new Baitap();
        int a = 15, b = 10;
        System.out.println(bt.ucln(a,b));
        System.out.println(bt.fibonaci(3));
    }
    
}
