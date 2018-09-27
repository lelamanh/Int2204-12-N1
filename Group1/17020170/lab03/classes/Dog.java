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
public class Dog {
    private String Name;
    private String Type;
    private String furColor;
    private int Age;
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public Dog(String Name, String Type, String furColor) {
        this.Name = Name;
        this.Type = Type;
        this.furColor = furColor;
    }
    
    public void getInfo() {
        System.out.println(Name + " " + Type + " " + furColor);
    } 
    
    public void bark()
    {
        System.out.println("Gau!! Gau!!!");
    }
    
}
