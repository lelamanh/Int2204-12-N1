/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau3;

/**
 *
 * @author CCNE
 */
public class sach {
    int soTrang;
    String tenSach;

    public int getSoTrang() {
        return soTrang;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public sach(int soTrang, String tenSach) {
        this.soTrang = soTrang;
        this.tenSach = tenSach;
    }
    
}
