/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Minh
 */
public class Shoes {
    private String Brand;
    private boolean Gender;
    private int Size;
    private String Color;

    //Getter and Setter
    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public boolean isGender() {
        return Gender;
    }

    public void setGender(boolean Gender) {
        this.Gender = Gender;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    //Constructor
    public Shoes(String Brand, boolean Gender, int Size, String Color) {
        this.Brand = Brand;
        this.Gender = Gender;
        this.Size = Size;
        this.Color = Color;
    }
    
    //In thông tin
    public void getInfo() {
        System.out.println(Brand + " " +Size + " " + Gender + " " + Color );
    }
}
