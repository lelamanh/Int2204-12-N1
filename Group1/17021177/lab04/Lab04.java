public class Lab04 {
    public static int compareInt(int a, int b) {
        return Math.max(a, b);
    }

    public static int minElementArray(int[] array) {
        int temp = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] <= temp)
                temp = array[i];
        }
        return temp;
    }

    public static String BMI (double weight, double height) {
        double BMIOriginal = weight / (height*height);
        double BMI = Math.round(BMIOriginal * 100) / 100;
        if (BMI < 18.50)
            return "Thiếu cân";
        else if (BMI >= 18.50 && BMI <= 22.99)
            return "Bình thường";
        else if (BMI >= 23 && BMI <= 24.99)
            return "Thừa cân";
        return "Béo phì";
    }
}
