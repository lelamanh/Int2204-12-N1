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
// sách 
public class book {
    String tensach;// tên sách
    String tacgia; // tên tác giả
    String namxuatban; // năm xuất bản
    String nhaxuatban; // nhà xuất bản
    String chude; // chủ đề của sách

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getNamxuatban() {
        return namxuatban;
    }

    public void setNamxuatban(String namxuatban) {
        this.namxuatban = namxuatban;
    }

    public String getNhaxuatban() {
        return nhaxuatban;
    }

    public void setNhaxuatban(String nhaxuatban) {
        this.nhaxuatban = nhaxuatban;
    }

    public String getChude() {
        return chude;
    }

    public void setChude(String chude) {
        this.chude = chude;
    }

    public book(String tensach, String tacgia, String namxuatban, String nhaxuatban, String chude) {
        this.tensach = tensach;
        this.tacgia = tacgia;
        this.namxuatban = namxuatban;
        this.nhaxuatban = nhaxuatban;
        this.chude = chude;
    }
    public void getinfo()
    {
        System.out.printf(tensach+','+tacgia+','+namxuatban+','+nhaxuatban+','+chude);
    }
}
