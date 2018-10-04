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
public class mayViTinh {
    String type; // laptop / desktop
    int ram;
    String cpu;

    public void setType(String type) {
        this.type = type;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getType() {
        return type;
    }

    public int getRam() {
        return ram;
    }

    public String getCpu() {
        return cpu;
    }

    public mayViTinh(String type, int ram, String cpu) {
        this.type = type;
        this.ram = ram;
        this.cpu = cpu;
    }
}
