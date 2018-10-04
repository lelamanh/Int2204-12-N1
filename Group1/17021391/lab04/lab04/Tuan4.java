


public class Tuan4 {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static int max2num( int x, int y){
        if( x > y ) return x;
        else return y;
    }
    public static int minArray(int[] a, int n){
        int min = a[0];
        for ( int i = 1; i < a.length; i++){
            if( a[i] < min ) min = a[i];
        }
        return min;
    }
    public static String BMI(double h, double w){
        double bmi = w /(h*h);
        if( bmi < 18.5) return "thieu can";
        else if( bmi < 23.0) return "binh thuong";
        else if( bmi <25.0) return "thua can";
        else   return "beo phi";
    }
    
}
