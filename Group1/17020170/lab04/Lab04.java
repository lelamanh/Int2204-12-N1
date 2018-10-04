
package lab04;

/**
 *
 * @author Minh
 */
public class Lab04 {

    static int findMax(int a, int b)
    {
        if (a > b) {return a;}
        else return b;        
    }
    
    static int findMinArray(int[] array)
    {
        int min = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if(array[i] < min) { min = array[i]; }
        }
        return min;
    }
    
    static String BMI(double weigh, double height)
    {
        String s1 = "Thieu can";
        String s2 = "Binh thuong";
        String s3 = "Thua can";
        String s4 = "Beo phi";
        String s5 = "Tham so khong hop le";
        if (weigh < 0.0 || height < 0.0) return s5;
        double BMI = weigh / (height * height);
        if(BMI < 18.5)  {return s1;}
        else if (BMI < 23) {return s2;}
        else if (BMI <= 25) {return s3;}
        else {return s4;}
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(findMinArray(a));
    }
    
}
