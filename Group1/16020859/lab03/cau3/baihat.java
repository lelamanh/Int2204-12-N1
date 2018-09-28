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
// bài hát
public class baihat {
    String name; // tên bài hát
    String tencasi; // tên ca sĩ
    String tentacgia; // tên tác giả
    String namsanxuat; // năm sản xuất
    String soluotxem; // số lượt xem

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTencasi() {
        return tencasi;
    }

    public void setTencasi(String tencasi) {
        this.tencasi = tencasi;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public String getNamsanxuat() {
        return namsanxuat;
    }

    public void setNamsanxuat(String namsanxuat) {
        this.namsanxuat = namsanxuat;
    }

    public String getSoluotxem() {
        return soluotxem;
    }

    public void setSoluotxem(String soluotxem) {
        this.soluotxem = soluotxem;
    }

    public baihat(String name, String tencasi, String tentacgia, String namsanxuat, String soluotxem) {
        this.name = name;
        this.tencasi = tencasi;
        this.tentacgia = tentacgia;
        this.namsanxuat = namsanxuat;
        this.soluotxem = soluotxem;
    }
    
    public void getinfo()
    {
        System.out.println(name+','+tencasi+','+tentacgia+','+namsanxuat+','+soluotxem);
    }
}
