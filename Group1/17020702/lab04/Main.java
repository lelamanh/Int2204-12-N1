package demoTuan04;

public class Main {
	//Tìm Giá trị lớn nhất của 2 số nguyên
	public static int findMax(int a,int b){
        return a>b?a:b;
    }
	//Tìm Giá trị nhỏ nhất của 1 mảng
    public static int findMin(int[] arr){
        if(arr.length==0) return 0;
        else {
            int min = arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]<min) min = arr[i];
            }
            return min;
        }
    }
    //Tính Chỉ số BMI
    public static String BMI(double w,double h){
        if(w<=0||h<=0)
            return "Du lieu nhap vao khong dung";
        double bmi = w/(h*h);
        if(bmi<18.5)
            return "Thieu can";
        else if (bmi<=22.99)
            return "Binh thuong";
        else if (bmi<=24.99)
            return "Thua can";
        else return "Beo phi";
    }
}
