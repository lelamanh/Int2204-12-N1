public class GCD {
    public static int gcd(int a, int b) {
        int aa = Math.abs(a);
        int bb = Math.abs(b);
        while(bb !=0){
            int x = aa%bb;
            aa = bb;
            bb = x;
        }
        return(aa);
    }
    
    public static void main(String[] args){
        int a = 8;
        int b = 12;
        System.out.println(GCD.gcd(a,b));
    }
}
