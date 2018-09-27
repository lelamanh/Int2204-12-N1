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
public class Laptop {
    private String Manufacturer;
    private String Model;
    private String CPU_model;
    private int CPU_Frequency;
    private int RAM_Capacity;
    private int RAM_bus;
    private String GPU_model;
    private double size;
    private String Resolution;
    private int BatteryCapacity;

    //Getter and Setter
    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getCPU_model() {
        return CPU_model;
    }

    public void setCPU_model(String CPU_model) {
        this.CPU_model = CPU_model;
    }

    public int getCPU_Frequency() {
        return CPU_Frequency;
    }

    public void setCPU_Frequency(int CPU_Frequency) {
        this.CPU_Frequency = CPU_Frequency;
    }

    public int getRAM_Capacity() {
        return RAM_Capacity;
    }

    public void setRAM_Capacity(int RAM_Capacity) {
        this.RAM_Capacity = RAM_Capacity;
    }

    public int getRAM_bus() {
        return RAM_bus;
    }

    public void setRAM_bus(int RAM_bus) {
        this.RAM_bus = RAM_bus;
    }

    public String getGPU_model() {
        return GPU_model;
    }

    public void setGPU_model(String GPU_model) {
        this.GPU_model = GPU_model;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getResolution() {
        return Resolution;
    }

    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }

    public int getBatteryCapacity() {
        return BatteryCapacity;
    }

    public void setBatteryCapacity(int BatteryCapacity) {
        this.BatteryCapacity = BatteryCapacity;
    }

    //Constructor
    public Laptop(String Manufacturer, String Model) {
        this.Manufacturer = Manufacturer;
        this.Model = Model;
    }
    
    //In thông tin 
    public void getInfo() {
        System.out.println(Manufacturer + " " + Model);
        System.out.println(CPU_model + " " + CPU_Frequency);
        System.out.println(GPU_model);
        System.out.println(RAM_Capacity + " " + RAM_bus);
    }
}
