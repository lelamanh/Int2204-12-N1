package lab032;

import java.util.Scanner;

class PS {

    /**
     * @param args the command line arguments
     */
    private int TS, MS;

    PS(int TS, int MS) {
        this.TS = TS;
        this.MS = MS;
    }

    public int getTu() {
        return TS;
    }

    public void setTu(int TS) {
        this.TS = TS;
    }

    public int getMau() {
        return MS;
    }

    public void setMau(int MS) {
        this.MS = MS;
    }

    public int UCLN(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return UCLN(b, a % b);
        }
    }

    public void toiGianPS() {
        int i = UCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);

    }

    public void inPS(PS ps) {
        ps.toiGianPS();
        if (ps.TS * ps.MS < 0) {
            System.out.println(-ps.TS + " / " + -ps.MS);
        } else {
            System.out.println(ps.TS + " / " + ps.MS);
        }
    }

    public void congPS(PS ps) {
        int a = this.getTu() * ps.getMau() + ps.getTu() * this.getMau();
        int b = ps.getMau() * this.getMau();
        PS PStong = new PS(a, b);
        System.out.println("Cong : ");
        PStong.inPS(ps);

    }

    public void truPS(PS ps) {
        int a = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int b = ps.getMau() * this.getMau();
        PS PShieu = new PS(a, b);

        System.out.println("Tru : ");
        PShieu.inPS(ps);

    }

    public void nhanPS(PS ps) {
        int a = this.getTu() * ps.getTu();
        int b = this.getMau() * ps.getMau();
        PS PSnhan = new PS(a, b);
        System.out.println("Nhan : ");
        PSnhan.inPS(ps);
    }

    public void chiaPS(PS ps) {
        int a = this.getTu() * ps.getMau();
        int b = this.getMau() * ps.getTu();
        PS PSchia = new PS(a, b);
        System.out.println("Chia : ");
        PSchia.inPS(ps);
    }

    public boolean equals(Object obj) {
        if (obj instanceof PS) {
            PS ps = (PS) obj;
            if (TS == ((PS) ps).TS && MS == ((PS) ps).MS)
                return true;
            else 
                return false;
        } 
        else 
            return false;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan so : ");
        int tu1 = sc.nextInt();
        int mau1 = sc.nextInt();
        int tu2 = sc.nextInt();
        int mau2 = sc.nextInt();
        PS ps1 = new PS(tu1, mau1);
        PS ps2 = new PS(tu2, mau2);
        if (ps1.MS == 0 || ps2.MS == 0) {
            System.out.println("Error");
        } else {

            ps1.congPS(ps2);
            ps1.truPS(ps2);
            ps1.nhanPS(ps2);
            ps1.chiaPS(ps2);
            ps1.equals(ps2);
            ps1.equals(123);

        }
    }
}

