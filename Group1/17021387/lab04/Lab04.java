/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

/**
 *
 * @author Administrator
 */
public class Lab04 {

    public static int Int(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int Array(int a[]) {
        int Min = a[0];
        for (int i = 0; i < a.length; i++) {

            if (a[i] < Min) {
                Min = a[i];

            }

        }
        return Min;

    }

    public static String BMI(double weight, double height) {
        double BMI = weight / (height * height);
        if (BMI < 18.5) {
            return "Thiếu cân";
        }
        if (BMI >= 18.5 && BMI <= 22.99) {
            return "Bình thường";
        }
        if (BMI >= 23 && BMI <= 24.99) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}

