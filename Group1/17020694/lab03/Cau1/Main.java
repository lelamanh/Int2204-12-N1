package com.company;

public class Main {
    //return ước chung lớn nhất của hai số a,b
    public int ucln(int a, int b){
        a= (a<0) ? -a : a;
        b= (b<0) ? -b : b;
        while (a!=b){
            if (a>b)
            {
                a-=b;
            }
            else
            {
                b-=a;
            }
        }
        return a;
    }
    //return số thứ n thuộc dãy fibonacci
    public int fib(int n)
    {
        if (n==0 || n==1)
        {
            return 1;
        }
        return (fib(n-1) + fib(n-2));
    }

    public static void main(String[] args) {
	Main test = new Main();
        System.out.println(test.ucln(-5, 15));
        System.out.println(test.fib(24));
    }
}
