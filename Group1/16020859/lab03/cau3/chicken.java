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
// đối tượng gà
public class chicken {
    String name; // tên
    String noi; // nòi giống
    String maulong; // màu lông

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNoi() {
        return noi;
    }

    public void setNoi(String noi) {
        this.noi = noi;
    }

    public String getMaulong() {
        return maulong;
    }

    public void setMaulong(String maulong) {
        this.maulong = maulong;
    }

    public chicken(String name, String noi, String maulong) {
        this.name = name;
        this.noi = noi;
        this.maulong = maulong;
    }
    public void sound() // tiếng kêu
    {
         System.out.println("ò ó o");
    }
}
