public class Lab04{
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
    public static void BodyMassIndex(double h, double w){
        double bmi = w/(h*h);
        System.out.println(bmi);
        if(bmi < 18.5) System.out.println("Thieu can");
        else if(18.5 <= bmi && bmi <= 22.99) System.out.println("Binh thuong");
            else if(bmi > 25) System.out.println("Beo phi");
                else System.out.println("Thua can");
    }
    public static void main(String[] args){
        System.out.println(GTLN(12,43));
        //Lab04.BodyMassIndex(2.1, 75);
        int[] a = {1,2,3,4};
        System.out.println(Lab04.minValue(a));
    }
}