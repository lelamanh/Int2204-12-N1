/**
 *
 * @author longhoang08
 */

package lab04;

import java.util.Random;

public class Lab04
{
    // return max(a, b)
    public static int max(int a, int b)
    {
        return (a > b) ? a : b;
    }

    // return min element of an array
    public static int minElement(int[] a)
    {
        if (a == null) 
        {
            throw new IllegalAccessError("There aren't any element in this array!!!");
        }
        int result = a[0];
        for(int i = 1; i < a.length; i++) result = Math.min(result, a[i]);
        return result;
    }
    
    // return BMI round to 2 decimal places
    public static double BMI(double weight, double height)
    {
        double bmi = (weight / (height * height));
        bmi = ((double)Math.round(bmi * 100)) / 100;
        return bmi;
    }

    // return body status
    public static String bodyStatus(double bmi)
    {
        if (bmi < 18.5) return "Thieu can";
        if (bmi < 23) return "Binh thuong";
        if (bmi < 25) return "Thua can";
        return "Beo phi";
    }
    
    public static void main(String[] args) 
    {
        // test max function
        System.out.println(max(3, 15));
        System.out.println(max(15, 3));
        System.out.println(max(15, 15));
        
        // init an random array
        int[] a = new int[5];
        Random random = new Random();
        for(int i = 0; i < a.length; i++) a[i] = random.nextInt(1000) + 1;
        for(int i = 0; i < a.length; i++) System.out.print(a[i] + " ");
        System.out.println();

        // test minElement function
        System.out.println("Min element: " + minElement(a));

        // test BMI
        double bmi = BMI(63, 1.77);
        System.out.println(bodyStatus(bmi));
        bmi = BMI(70, 1.80);
        System.out.println(bodyStatus(bmi));
    }
}