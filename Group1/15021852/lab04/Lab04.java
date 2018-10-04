/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

/**
 *
 * @author pgpip
 */
public class Lab04 {

    public static void main(String[] args) {

    }

    public static int Max(int a, int b) { // min cua 2 so
        if (a > b) {
            return a;
        }
        return b;
    }

    public static int MinArr(int arr[]) { // tim so nho nhat cua 1 mang
//            for(int i = 0 ; i< 100; i++){
//                 Random rd = new Random();
//                 arr[i] = rd.nextInt(1000);
//            }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min >= arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static String BMI(int weight, int hight) { // tinh bmi
        int bmi;
            bmi = (weight * 10000) / (hight * hight);
            if (bmi < 18.5) {
                return "Thieu can";
            } else if (bmi > 18.5 && bmi < 23) {
                return "Binh thuong";
            } else if (bmi > 23 && bmi < 25) {
                return "Thua can";
            } else {
                return "Beo phi";
            }
        }

    }
