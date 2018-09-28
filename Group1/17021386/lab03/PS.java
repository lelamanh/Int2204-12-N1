package neon;

import java.util.Scanner;

import static java.lang.Math.abs;

public class PS {
    bai1 open_onPS = new bai1();

    private int Tu;
    private  int Mau ;

    public int getTu() {
        return Tu;
    }

    public int getMau() {
        return Mau;
    }

    public void setMau(int mau) {
        this.Mau = mau;
    }
    public void setTu(int tu) {
        this.Tu = tu;
    }
    public PS(){

    }
    public PS(int Tu, int Mau){
        this.Tu= Tu;
        this.Mau = Mau;
    }

    // cong tru nhan chia PS
    public void cong_PS(PS ps1){
        int a= this.Tu*ps1.getMau() + this.Mau*ps1.getTu();
        int b= this.Mau*ps1.getMau();
        int c= open_onPS.UCLN(a,b);
        //System.out.println(a+" "+ b + " "+c);
        System.out.println((a/c)+"/"+(b/c));
    }

    public void tru_PS(PS ps1){
        int a= this.Tu*ps1.getMau() + this.Mau*ps1.getTu();
        int b= this.Mau*ps1.getMau();
        if(a<0){
            int a1 = abs(a);
            int c= open_onPS.UCLN(a1,b);
            System.out.println((a/c)+"/"+(b/c));
        }
        if (a==0){
            System.out.println("0");
        }
        if(a>0){
            int c= open_onPS.UCLN(a,b);
            System.out.println((a/c)+"/"+(b/c));
        }
    }

    // nhan PS
    public void nhan_PS(PS ps1){
        int a = this.Tu*ps1.getTu();
        int b= this.Mau*ps1.getMau();
        int c = open_onPS.UCLN(a,b);
        System.out.println(a/c+"/"+b/c);
    }

    // chia PS
    public void chia_PS(PS ps1){
        int a = this.Tu*ps1.getMau();
        int b= this.Mau*ps1.getTu();
        int c = open_onPS.UCLN(a,b);
        System.out.println(a/c+"/"+b/c);
    }
    // so sanh 2 PS
    public boolean equals(Object obj){
       if(obj instanceof PS){
           PS other = (PS) obj;
           other.tru_PS(this);
           return other.getTu() == 0;
       }
       else{
           return false;
       }
    }



    public static void main(String[] args){

        //test
        /*
        PS imp = new PS(1,2);
        PS ps1 = new PS(5,6);
        System.out.println(imp.equals(ps1));
        */


    }
}
