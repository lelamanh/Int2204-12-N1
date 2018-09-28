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
public class Desk {
    private String Material;
    private String surfaceShape;
    private double surfaceArea;
    
    //Các phương thức get/set
    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public String getSurfaceShape() {
        return surfaceShape;
    }

    public void setSurfaceShape(String surfaceShape) {
        this.surfaceShape = surfaceShape;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }
    
    //Phương thức khởi tạo
    public Desk(String Material, String surfaceShape, double surfaceArea) {
        this.Material = Material;
        this.surfaceShape = surfaceShape;
        this.surfaceArea = surfaceArea;
    }
    
    //Phương thức in thông tin
    public void getInfo(){
        System.out.println("Chat lieu: " + Material);
        System.out.println("Hinh dang: " + surfaceShape);
        System.out.println("Dien tich: " + surfaceArea + "m2");
    }
    
}
