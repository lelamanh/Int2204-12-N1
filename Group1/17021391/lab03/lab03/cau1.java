

public class cau1 {
	
	public static void main(String[] args) {
		cau1 test = new cau1();
		test.ucln(-7,21);
		test.fibonaci(13);
	}
	
	public void ucln(int x, int y) {	
		if( x * y == 0 ) System.out.println("khong ton tai uoc chung");
		else {
			int a = Math.abs(x);
			int b = Math.abs(y);
			if( a == 1 || b == 1) {
				System.out.println(1);
			}
			else{
				while(a != b) {
					if ( a>b) a-=b;
					else b-=a;
				}
				System.out.println(a);
			}
		}
	}
	
	public void fibonaci(int n) {
		if( n <= 1 ) {
			if ( n == 1) System.out.println(1);
			else if(n==0) System.out.println(0);
		}
		else {
			int f0 = 0, f1 = 1;
			int f2=0;
			int i = 2;
			while(i <=n ) {
				f2 = f0 + f1;
				f0 = f1;
				f1 = f2;
				i++;
			}
			System.out.println(f2);
		}
	}
	
}
