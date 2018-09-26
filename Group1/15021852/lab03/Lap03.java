package lap03;

public class Lap03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(UCLN(10, 4));
        System.out.println(Fibonaxi(10));
        PS phanSo1=new PS(7,3);    
        PS phanSo2=new PS(4,9);
        // phuong thuc cong tru nhan chia
        phanSo1.congPhanSo(phanSo2);
        phanSo1.truPhanSo(phanSo2);
        phanSo1.nhanPhanSo(phanSo2);
        phanSo1.chiaPhanSo(phanSo2);
        
    }

    public static int UCLN(int a, int b) {
        if (b == 0) {
            return a;
        }
        return UCLN(b, a % b);
    }

    //bai 1 b: Fibonaxi 
    public static int Fibonaxi(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        if (n > 2) {
            return Fibonaxi(n - 1) + Fibonaxi(n - 2);
        }
        return 0;
    }
}
