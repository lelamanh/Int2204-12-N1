public class Lab04 {
    public static int Max(int a, int b) {
        if(a>b) 
            return a;
        else 
            return b;
    }
    public static int MaxArray(int[] arr) {
        if(arr==null) {
            throw new IllegalArgumentException();
        }
        int max = arr[0];
        for(int i=0;i<arr.length;i++) {
            if(max<arr[i])  
                max = arr[i];
        }
        return max;
    }
    public static String BMI(double weight, double height) {
        double bmi = weight/(height*height);
        if(bmi<18.5) 
            return "Thieu can";
        else if(bmi>=18.5&&bmi<23)
            return "Binh thuong";
        else if(bmi>=23&&bmi<25) 
            return "Thua can";
        else 
            return "Beo phi";
    }
    public static void main() {
        
    }
}