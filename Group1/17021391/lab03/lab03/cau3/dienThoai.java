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
public class dienThoai {
    String brand;
    String color;
    String name;

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public dienThoai(String brand, String color, String name) {
        this.brand = brand;
        this.color = color;
        this.name = name;
    }
    
}
