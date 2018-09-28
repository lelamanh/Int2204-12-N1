/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3.cau3;

/**
 *
 * @author anhco
 */
// Cây
public class tree {
    String tenloaicay; // tên loài cây
    String maula; // màu lá
    String qua; // có quả hay không
    String tuoi;  // tuổi cây

    public String getTenloaicay() {
        return tenloaicay;
    }

    public void setTenloaicay(String tenloaicay) {
        this.tenloaicay = tenloaicay;
    }

    public String getMaula() {
        return maula;
    }

    public void setMaula(String maula) {
        this.maula = maula;
    }

    public String getQua() {
        return qua;
    }

    public void setQua(String qua) {
        this.qua = qua;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public tree(String tenloaicay, String maula, String qua, String tuoi) {
        this.tenloaicay = tenloaicay;
        this.maula = maula;
        this.qua = qua;
        this.tuoi = tuoi;
    }
    public void getinfo()
    {
        System.out.println(this.getTenloaicay());
        System.out.println(this.getMaula());
        System.out.println(this.getQua());
        System.out.println(this.getTuoi());
    }
}
