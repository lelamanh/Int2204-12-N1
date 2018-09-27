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
public class MotorBike {
    private String EngineID;
    private String ChassisID;
    private int cylinderCapacity;
    private String Manufacturer;
    private String Brand;

    //Getter and Setter
    public String getEngineID() {
        return EngineID;
    }

    public void setEngineID(String EngineID) {
        this.EngineID = EngineID;
    }

    public String getChassisID() {
        return ChassisID;
    }

    public void setChassisID(String ChassisID) {
        this.ChassisID = ChassisID;
    }

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    //Constructor
    public MotorBike(String EngineID, String ChassisID, int cylinderCapacity, String Manufacturer, String Brand) {
        this.EngineID = EngineID;
        this.ChassisID = ChassisID;
        this.cylinderCapacity = cylinderCapacity;
        this.Manufacturer = Manufacturer;
        this.Brand = Brand;
    }

    //In thông tin
    public void getInfo() {
        System.out.println(Manufacturer + " " + Brand + " " + cylinderCapacity + "cc");
    }
}
