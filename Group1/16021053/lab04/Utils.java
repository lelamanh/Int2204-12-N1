
import java.lang.*;
public class Utils{

    public static int max(int a, int b) {
        return (a > b) ? a: b;
    }

    public static int minArr(int[] a) {
        int minValue;
        if(a.length > 0) {
            minValue = a[0];
            for(int i = 1; i < a.length; ++i) {
                if(minValue > a[i]) {
                    minValue = a[i];
                }
            }
        } else {
            throw new Error("array length must >= 1");
        }
        return minValue;
    }

    public static String IBM(float weight, float height) {
        if(weight <= 0 || height <= 0) {
            throw new Error("weight and height must > 0");
        }

        float bim = weight / (height*height);


        if(Float.compare(bim, 18.5f) < 0) {
            return "Thieu can";
        } else if(Float.compare(bim, 18.5f) >= 0  && Float.compare(bim, 23.0f) < 0) {
           return "Binh thuong";
        } else if(Float.compare(bim, 23.0f) >= 0 && Float.compare(bim, 24.99f) <= 0) {
            return "Thua can";
        } else if(Float.compare(bim, 25f) > 0) {
            return "Beo phi";
        }

        return "";
    }
}