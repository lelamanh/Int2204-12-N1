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
// đối tượng mèo
public class cat {
    String name; // tên mèo
    String thucanyeuthich; // thức ăn yêu thích
    String maulong; // màu lông

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThucanyeuthich() {
        return thucanyeuthich;
    }

    public void setThucanyeuthich(String thucanyeuthich) {
        this.thucanyeuthich = thucanyeuthich;
    }

    public String getMaulong() {
        return maulong;
    }

    public void setMaulong(String maulong) {
        this.maulong = maulong;
    }

    public cat(String name, String thucanyeuthich, String maulong) {
        this.name = name;
        this.thucanyeuthich = thucanyeuthich;
        this.maulong = maulong;
    }
    public void sound()
    {
        System.out.println("meo meo");
    }
}
