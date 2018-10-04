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
public class xeMay {
    String brand;
    String color;
    int cc;

    public xeMay(String brand, String color, int cc) {
        this.brand = brand;
        this.color = color;
        this.cc = cc;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getCc() {
        return cc;
    }
}
