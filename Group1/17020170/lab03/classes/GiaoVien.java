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
public class GiaoVien {

    private String Name;
    private String Email;
    private String Degree;
    private String Lecturing;
    private String OfficeAddress;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDegree() {
        return Degree;
    }

    public void setDegree(String Degree) {
        this.Degree = Degree;
    }

    public String getLecturing() {
        return Lecturing;
    }

    public void setLecturing(String Lecturing) {
        this.Lecturing = Lecturing;
    }

    public String getOfficeAddress() {
        return OfficeAddress;
    }

    public void setOfficeAddress(String OfficeAddress) {
        this.OfficeAddress = OfficeAddress;
    }

    public GiaoVien(String Name, String Email, String Lecturing) {
        this.Name = Name;
        this.Email = Email;
        this.Lecturing = Lecturing;
    }

    public GiaoVien(String Name, String Email, String Degree, String OfficeAddress) {
        this.Name = Name;
        this.Email = Email;
        this.Degree = Degree;
        this.OfficeAddress = OfficeAddress;
    }

    public void getInfo() {
        System.out.println(Name + " " + " " + Email + " " + OfficeAddress);
    }
    
    
}
