/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phanso;

/**
 *
 * @author CCNE
 */
public class PhanSo {
    private int tuSo;
    private int mauSo;
    PhanSo(){
        
    }
    PhanSo(int tuSo, int mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    PhanSo(PhanSo p){
        this.tuSo = p.tuSo;
        this.mauSo = p.mauSo;
    }
    public void setTuso(int n){
        tuSo = n;
    }
    public void setMauso(int n){
        mauSo = n;
    }
    public int getMauso(){
        return mauSo;
    }
    public int getTuso(){
        return tuSo;
    }
    public PhanSo add(PhanSo p){
        PhanSo ps = new PhanSo();
        ps.tuSo = this.tuSo * p.mauSo + this.mauSo * p.tuSo;
        ps.mauSo = this.mauSo * p.mauSo;
        return ps.rutgon();
    }
    public PhanSo sub(PhanSo p){
        PhanSo ps = new PhanSo();
        ps.tuSo = this.tuSo * p.mauSo - this.mauSo * p.tuSo;
        ps.mauSo = this.tuSo * this.mauSo;
        return ps.rutgon();
    }
    public PhanSo multi(PhanSo p){
        PhanSo ps = new PhanSo();
        ps.tuSo = this.tuSo * p.tuSo;
        ps.mauSo = this.mauSo * p.mauSo;
        return ps.rutgon();
    }
    public PhanSo div(PhanSo p){
        PhanSo ps = new PhanSo();
        ps.tuSo = this.tuSo * p.mauSo;
        ps.mauSo = this.mauSo * p.tuSo;
        return ps.rutgon();
    }
    public PhanSo rutgon(){
        int uc = 1;
        for(int i = tuSo ; i >= 1 ; i--){
            if(tuSo % i == 0 && mauSo % i == 0){
                uc = i;
                break;
            }
        }
        tuSo = (tuSo * mauSo)/(uc * Math.abs(mauSo));
        mauSo = Math.abs(mauSo)/uc;
        return this;
    }
    public void print(){
        System.out.println(this.tuSo + "/" + this.mauSo);
    }
    public boolean equals(Object obj){
        if(obj instanceof PhanSo){
            PhanSo other = (PhanSo) obj;
            this.rutgon();
            other.rutgon();
            if(this.tuSo==other.tuSo&&this.mauSo==other.mauSo) 
                return true;
            else 
                return false;
        }
        else 
            return false;
    }
    public static void main(String[] args) {
        PhanSo p = new PhanSo(10,-20);
        p.rutgon();
        
    }
    
}
