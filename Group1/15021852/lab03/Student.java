/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap03;

/**
 *
 * @author pgpip
 */
public class Student {
    String name;
    int age;
    String Address;
    String id;
    String Group;
    String sex;

    public Student(String name, int age, String id, String Group, String sex) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.Group = Group;
        this.sex = sex;
    }// ham khoi tao 
    // cac ham get set tuong ung cho moi thuc tinh
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String Group) {
        this.Group = Group;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    
}
