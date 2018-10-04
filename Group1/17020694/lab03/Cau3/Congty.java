package com.company;

public class Congty {
    ConNguoi giamDoc;
    ConNguoi[] nhanVien;
    String name;
    String email;
    String diaChi;

    public Congty(ConNguoi giamDoc, ConNguoi[] nhanVien, String name, String email, String diaChi) {
        this.giamDoc = giamDoc;
        this.nhanVien = nhanVien;
        this.name = name;
        this.email = email;
        this.diaChi = diaChi;
    }

    public ConNguoi getGiamDoc() {
        return giamDoc;
    }

    public void setGiamDoc(ConNguoi giamDoc) {
        this.giamDoc = giamDoc;
    }

    public ConNguoi[] getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(ConNguoi[] nhanVien) {
        this.nhanVien = nhanVien;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
}
