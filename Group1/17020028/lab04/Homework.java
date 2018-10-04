public class Homework
{
    public static int max(int a, int b)
    {
        return a > b ? a : b;
    }

    public static int min(int[] a)
    {
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; ++i)
            res = Math.min(res, a[i]);
        return res;
    }

    public static String BMI(double weight, double height)
    {
        double bmi = weight / height / height;
        if (bmi < 18.5) return "Thieu can";
        else
        if (bmi < 23) return "Binh thuong";
        else 
        if (bmi < 25) return "Thua can";
        else return "Beo phi";
    }
    
}