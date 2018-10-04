import java.util.Scanner;

public class Cau1 {
    public static int UCLN(int a, int b) { //Thuật toán Euclid
        if (b == 0) return a;
        return UCLN(b, a % b);
    }
    
    public static int fibonacci(int n) { //Hàm tìm số fibonacci tại vị trí thứ n
    	if (n == 0) return 0;
    	else if ((n == 1) || (n == 2)) {
               return 1;
        } else {
               int arr[] = new int[n];
               arr[0] = 1;
               arr[1] = 1;
               for (int i = 2; i < arr.length; i++) {
                     arr[i] = arr[i - 1] + arr[i - 2];
               }
               return arr[n-1];
        }
    }
    
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Nhập vào a: ");
    	int a = input.nextInt();
    	System.out.print("Nhập vào b: ");
    	int b = input.nextInt();
    	System.out.println("Ước chung lớn nhất của a và b là: " + UCLN(a, b));
    	
    	System.out.print("Nhập vào n: ");
    	int n = input.nextInt();
    	System.out.print("Fibonacci tại n bằng: " + fibonacci(n));
    	input.close();
    }
     
}
