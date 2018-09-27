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

// đối tượng giáo viên 
class teacher{
    String name; //tên
    String tuoi; // tuổi
    String chunhiemlop; // chủ nhiệm lớp 
    String msgv; //Mã số giáo viên
    String monhoc; // dạy môn học gì 

    public String getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(String monhoc) {
        this.monhoc = monhoc;
    }
// get tên
    public String getName() {
        return name;
    }
// set tên
    public void setName(String name) {
        this.name = name;
    }
// get tuoi
    public String getTuoi() {
        return tuoi;
    }
// set tuoi
    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }
//get chủ nhiệm lớp
    public String getChunhiemlop() {
        return chunhiemlop;
    }
// set chủ nhiệm lớp
    public void setChunhiemlop(String chunhiemlop) {
        this.chunhiemlop = chunhiemlop;
    }
// get mã số giáo viên
    public String getMsgv() {
        return msgv;
    }
// set mã số giáo viên
    public void setMsgv(String msgv) {
        this.msgv = msgv;
    }
// khởi tạo giáo viên 
    public teacher(String name, String tuoi, String chunhiemlop, String msgv, String monhoc) {
        this.name = name;
        this.tuoi = tuoi;
        this.chunhiemlop = chunhiemlop;
        this.msgv = msgv;
        this.monhoc=monhoc;
    }
    
}

