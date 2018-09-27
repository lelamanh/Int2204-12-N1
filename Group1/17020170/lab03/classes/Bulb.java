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

//Bóng đèn
public class Bulb {
    private String type;
    private double power;
    private int voltage;

//Getter/Setter    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    //Phương thức khởi tạo
    public Bulb(String type, double power, int voltage) {
        this.type = type;
        this.power = power;
        this.voltage = voltage;
    }

    public Bulb() {
        type = "type";
        power = 1.5;
        voltage = 220;
    }
    
    
    //In thông tin
    public void getInfo() {
        System.out.println("Bong den " + type + " " + power + " " + voltage);
    }
    
    //Tính điện năng sử dụng
    public double powerUsage (double hours) {
        return power * hours;
    }
    
    //Kiểm tra nguồn có phù hợp
    public boolean isUsable (int supplierVoltage) {
        return voltage == supplierVoltage;
    }
}
