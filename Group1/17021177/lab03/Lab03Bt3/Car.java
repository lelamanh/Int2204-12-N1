/*
*
* @Class Car
* @Author Phạm Thiên Long
*
* */
package Lab03Bt3;

import java.util.Date;

public class Car {
    private String name;
    private String brand;
    private String color;
    private Date dateOfManufacture;

    /*getter/setter name*/
    public String getName() {return this.name;}
    public void getName(String name) {this.name = name;}

    /*getter/setter brand*/
    public String getBrand() {return this.brand;}
    public void setBrand(String brand) {this.brand = brand;}

    /*getter/setter color*/
    public String getColor() {return this.color;}
    public void setColor(String color) {this.color = color;}

    /*getter/setter Date Of Manufacture*/
    public Date setDateOfManufacture() {return this.dateOfManufacture;}
    public void setDateOfManufacture(Date dateOfManufacture) {this.dateOfManufacture = dateOfManufacture;}
}
