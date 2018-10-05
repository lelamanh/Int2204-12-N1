/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04.java;

/**
 *
 * @author CCNE
 */
public class Lab04Java {

    public static int GTLN(int a, int b)
    {
        if (a > b) return a;
        return b;
    }  
    public static int minValue(int[] a){
        int min = a[0];
        for(int i = 1; i < a.length; i++){
            if (a[i] < min) min = a[i];
        }
        return min;
    }  
    public static String BodyMassIndex(double h, double w){
        double bmi = w/(h*h);
        System.out.println(bmi);
        if(bmi < 18.5) return "Thieu can";
        else if(18.5 <= bmi && bmi <= 22.99) return "Binh thuong";
            else if(bmi > 25) return "Beo phi";
                else return "Thua can";
    }
  
    
}
