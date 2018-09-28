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
// đối tượng chó
public class dog {
    String name; // tên 
    String tuoi; // tuổi
    String maulong; // màu lông

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getMaulong() {
        return maulong;
    }

    public void setMaulong(String maulong) {
        this.maulong = maulong;
    }

    public dog(String name, String tuoi, String maulong) {
        this.name = name;
        this.tuoi = tuoi;
        this.maulong = maulong;
    }
    public void sound() // tiếng kêu
    {
        System.out.println("Gâu gâu!");
    }
}
