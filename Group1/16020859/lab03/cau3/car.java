/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author anhco
 */
// ô tô
public class car {
    String hangxe; // hãng xe
    String name; // tên xe 
    String namsanxuat; // năm sản xuất
    String mauxe; // màu xe
    int sochongoi; // số chỗ ngồi trên xe
    int tocdo; // tốc độ KM

    public String getHangxe() {
        return hangxe;
    }

    public void setHangxe(String hangxe) {
        this.hangxe = hangxe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamsanxuat() {
        return namsanxuat;
    }

    public void setNamsanxuat(String namsanxuat) {
        this.namsanxuat = namsanxuat;
    }

    public String getMauxe() {
        return mauxe;
    }

    public void setMauxe(String mauxe) {
        this.mauxe = mauxe;
    }

    public int getSochongoi() {
        return sochongoi;
    }

    public void setSochongoi(int sochongoi) {
        this.sochongoi = sochongoi;
    }

    public int getTocdo() {
        return tocdo;
    }

    public void setTocdo(int tocdo) {
        this.tocdo = tocdo;
    }

    public car(String hangxe, String name, String namsanxuat, String mauxe, int sochongoi, int tocdo) {
        this.hangxe = hangxe;
        this.name = name;
        this.namsanxuat = namsanxuat;
        this.mauxe = mauxe;
        this.sochongoi = sochongoi;
        this.tocdo = tocdo;
    }
    public void chay(int tocdo,int songuoitrenxe) // số người ngồi trên xe và tốc độ chạy
    {
        System.out.println("tốc độ:"+tocdo+",so người ngồi trên xe :"+songuoitrenxe);
    }
}
