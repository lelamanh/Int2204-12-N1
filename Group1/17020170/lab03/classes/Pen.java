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
public class Pen {
    private String Type;
    private String inkColor;
    private String Producer;
    private double driverSize;
    //Getter and Setter
    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getInkColor() {
        return inkColor;
    }

    public void setInkColor(String inkColor) {
        this.inkColor = inkColor;
    }

    public String getProducer() {
        return Producer;
    }

    public void setProducer(String Producer) {
        this.Producer = Producer;
    }

    public double getDriverSize() {
        return driverSize;
    }

    public void setDriverSize(double driverSize) {
        this.driverSize = driverSize;
    }
    //Constructor
    public Pen(String Type, String inkColor, String Producer, double driverSize) {
        this.Type = Type;
        this.inkColor = inkColor;
        this.Producer = Producer;
        this.driverSize = driverSize;
    }
    //In thông tin
    public void getInfo() {
        System.out.println(Type + " " + inkColor + " " + driverSize);
    }
    
    
}
