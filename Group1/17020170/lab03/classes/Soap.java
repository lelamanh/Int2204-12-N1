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
public class Soap {
    private String Scent;
    private String Shape;
    private String Manufacturer;

    //Getter and Setter
    public String getScent() {
        return Scent;
    }

    public void setScent(String Scent) {
        this.Scent = Scent;
    }

    public String getShape() {
        return Shape;
    }

    public void setShape(String Shape) {
        this.Shape = Shape;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    /**
     * 
     * @param Scent
     * @param Shape
     * @param Manufacturer 
     */
    public Soap(String Scent, String Shape, String Manufacturer) {
        this.Scent = Scent;
        this.Shape = Shape;
        this.Manufacturer = Manufacturer;
    }
    
    //In thông tin
    public void getInfo() {
        System.out.println(Manufacturer + " " + Scent);
    }
    
}
