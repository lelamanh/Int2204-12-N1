public class Caculator {
    public static int greaderIn(int a, int b) {
        return (a > b?a:b);
    }

    public static int smallestIn(int[] a) {
        int temp = 0;

        if (a.length == 0) {
            return Integer.MAX_VALUE;
        } else {
             temp = a[0];

            for (int b : a) {
                if (b < temp) {
                    temp = b;
                }
            }
        }
        return temp;
    }

    public static void caculateBMI(float weight, float height) {
        String out;

        if (weight <= 0 || height <= 0) {
            out = "Wrong input !!";
        } else {
            float BMI = weight / (height * height);

            if (BMI < 18.5) {
                out = "Thiếu cân";
            } else if (BMI < 24.99) {
                out = "Bình thường";
            } else if (BMI < 29.99) {
                out = "Thừa cân";
            } else {
                out = "Béo phì";
            }
        }

        System.out.print(out);
    }
}
