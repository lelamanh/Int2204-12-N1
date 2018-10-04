public class Phanso {
    
    private int nume, deno;

    public void simplify(){
        int d = GCD.gcd(nume, deno);
        nume /= d;
        deno /= d;
    }

     //mo ta doi tuong co 2 thuoc tinh
     //khoi tao doi tuong moi co 2 thuoc tinh tren = this
    public Phanso(int nume,int deno) {                                                                                                    
        // this(nume, deno);
        this.nume = nume;
        this.deno = deno;
        this.simplify();
    }
    //Tao thg moi cung gia tri vs thang cu
    // public PS(PS ps) {
    //     this.nume = ps.nume;
    //     this.deno - ps.deno;
    // }
    
    public Phanso cong(Phanso ps2) {
        int x, y;
        x = (nume*ps2.deno + deno*ps2.nume);
        y = (deno*ps2.deno);
        return new Phanso(x, y);
    }

    public Phanso tru(Phanso ps2) {
        return new Phanso(nume*ps2.deno - deno*ps2.nume, deno*ps2.deno);
    }

    public Phanso nhan(Phanso ps2) {
        return new Phanso(nume*ps2.nume, this.deno*ps2.deno);
    }

    public Phanso chia(Phanso ps2) {
        return new Phanso(nume*ps2.deno, deno*ps2.nume);
    }
    
    public boolean equals (Object obj) {
    if(obj instanceof Phanso) {
        PS other = (PS) obj;
        return (nume*other.deno == deno*other.nume);
    }
    return false;
    }

    public void inPs() {
        System.out.println(this.nume + "/" + this.deno);
    }
     
    public static void main(String[] args) {
        Phanso ps1 = new Phanso(123,5);
        Phanso ps2 = new Phanso(77,5);

        Phanso ps3 = ps1.cong(ps2);
        ps3.inPs();
    }
}