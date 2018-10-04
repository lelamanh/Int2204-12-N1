/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt04;

/**
 *
 * @author CCNE
 */
class BT04 {

    /**
     * @param args the command line arguments
     */
    public static int max(int a, int b){
        if(a>=b)
            return a;
        else
            return b;
    }
    public static int max_array(int arr[]){
        int min = arr[0];
		for(int i = 1;i < arr.length;i ++)
			if(arr[i] < min)
				min = arr[i];
		return min;
    }
    public static String BMI(double weight, double high) {
		double bmi = weight/(high*high);
                String bmiStr = "";
		if(bmi < 18.5){
			System.out.println("Thieu can");
                        bmiStr =  "Thieu can";
                }
		else if(bmi >= 18.5 && bmi <= 23){
			System.out.println("Binh thuong");
                        bmiStr =  "Binh thuong";
                        }
		else if(bmi >= 23 && bmi <= 25){
			System.out.println("Thua can");
                        bmiStr =  "Thua can";
                }
		else if(bmi > 25){
			System.out.println("Beo phi");
                        bmiStr =  "Beo phi";
                }
                return bmiStr;
	}
    public static void main(){
        
    }
}
