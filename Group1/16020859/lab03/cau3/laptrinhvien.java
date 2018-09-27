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
// đối tượng lập trình viên
public class laptrinhvien {
    String name; // tên
    String ngonnguchudao; // Ngôn ngữ chủ đạo dùng trong công việc
    String tuoi; // tuổi
    String congtydanglam; // Tên công ty đang làm
    String mangdanglam; // Mảng đang làm tại công ty

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgonnguchudao() {
        return ngonnguchudao;
    }

    public void setNgonnguchudao(String ngonnguchudao) {
        this.ngonnguchudao = ngonnguchudao;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getCongtydanglam() {
        return congtydanglam;
    }

    public void setCongtydanglam(String congtydanglam) {
        this.congtydanglam = congtydanglam;
    }

    public String getMangdanglam() {
        return mangdanglam;
    }

    public void setMangdanglam(String mangdanglam) {
        this.mangdanglam = mangdanglam;
    }

    public laptrinhvien(String name, String ngonnguchudao, String tuoi, String congtydanglam, String mangdanglam) {
        this.name = name;
        this.ngonnguchudao = ngonnguchudao;
        this.tuoi = tuoi;
        this.congtydanglam = congtydanglam;
        this.mangdanglam = mangdanglam;
    }
    
}
