package lab4;

public class Main {
	public static int max(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

	public static int minArr(int arr[]) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		return min;
	}

	public static String BMI(double canNang, double chieuCao) {
		double BMI = (double) canNang / Math.pow(chieuCao, 2);
		String result = "";
		if (chieuCao <= 0 || canNang <= 0) return "";
		if (BMI < 18.5)
			result = "Thiếu cân";
		else if (BMI < 22)
			result = "Bình thường";
		else if (BMI < 25)
			result = "Thừa cân";
		else if (BMI >= 25)
			result = "Béo phì";
		return result;
	}

	public static void main(String[] args) {

		max(12, 11);
		int[] arr = { 9, 5, 1, 3, 7 };

		System.out.println(max(12, 11));
		System.out.println(minArr(arr));
		System.out.println(BMI(65, 1.7));
	}
}
