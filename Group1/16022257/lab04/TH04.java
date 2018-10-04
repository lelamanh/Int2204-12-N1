/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th04;

/**
 *
 * @author huyhabidien
 */
public class TH04 {

    public static int GTNN(int a[]) {
        int n = 0, max = 100;

        int min = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;

    }

    public static int GTLN(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }

    }

    public static String BMI(float cannang, float chieucao) {
        float x = cannang / (chieucao * chieucao);
        if (x < 18.5) {
            return "thieu can";
        } else if (x >= 18.5 && x <= 24) {
            return "BT";
        } else if (x >= 24 && x < 25) {
            return "thua can";
        } else {
            return "beo phi";
        }
    }

}
