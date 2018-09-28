public class GCD {

    public int gcd(int a, int b) {
		if(a>b) {
			if(a%b==0) {
			return b;
			}
			else {
				return gcd(a, a%b);
			}
		}
		else {
			if(b%a==0) {
				return a;
			}
			else {
				return gcd(b%a,a);
			}
		}
    }
    public static void main(String[] args) {
        GCD test = new GCD();
        System.out.println(test.gcd(-15, 5));
    }
} 