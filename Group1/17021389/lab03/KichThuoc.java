package Lab03_03.DoVat;

public class KichThuoc {
    double dai;
    double rong;
    double cao;
    double r;
    final double PI = 3.149;

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public double getCao() {
        return cao;
    }

    public void setCao(double cao) {
        this.cao = cao;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public KichThuoc(double a, double b, double c){
        setDai(a);
        setRong(b);
        setCao(c);
    }
    public KichThuoc(double r){
        setR(r);
    }




}
