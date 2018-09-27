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
// laptop
public class laptop {
    String name; // tên
    String hang; // hãng laptop
    String namsx; // năm sản xuất
    String giatien; // giá tiền
    String ram; // ram 
    String HDD; // ổ cứng
    String chip; // chíp

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public String getNamsx() {
        return namsx;
    }

    public void setNamsx(String namsx) {
        this.namsx = namsx;
    }

    public String getGiatien() {
        return giatien;
    }

    public void setGiatien(String giatien) {
        this.giatien = giatien;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public laptop(String name, String hang, String namsx, String giatien, String ram, String HDD, String chip) {
        this.name = name;
        this.hang = hang;
        this.namsx = namsx;
        this.giatien = giatien;
        this.ram = ram;
        this.HDD = HDD;
        this.chip = chip;
    }
    public void getinfo()
    {
        System.out.println(name+','+hang+','+namsx+','+giatien+','+ram+','+HDD+','+chip);
    }
   
}
