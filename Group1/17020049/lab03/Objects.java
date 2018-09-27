import com.sun.xml.internal.bind.v2.runtime.reflect.Accessor.GetterSetterReflection;

//Cat
class Cat {
    private String color;
    private int age;
//setters  
    public void setColor(String c) {
        color = c;
    }
    public void setAge(int a) {
        age = a;
    }
//getters
    public String getColor() {
        return color;
    }
    public int getAge() {
        return age;
    }
} 

//House
class House {
    private int area;
    private String location;
//setters
    public void setArea(int S) {
        area = S;
    }
    public void setLocation(String L) {
        location = L;
    }
//getters
    public int getArea() {
        return area;
    }
    public String getLocation() {
        return location;
    }

//Teacher
class Teacher {
    private String majority;
//setters
    public void setMajority(String m) {
        majority = m;
    }
//getters
    public String getMajority() {
        return majority;
    }
}

//Student
class Student {
    private String grade;
    private String id;
//setters
    public void setGrade(String g) {
        grade = g;
    }
    public void setId(String i) {
        id = i;
    }
//getters
    public String getGrade() {
        return grade;
    }
    public String getId() {
        return id;
    }
}

//Bed
class Bed {
    private int area;
    private String style;
//setter
    public void setArea(int a) {
        area = a;
    }
    public void setStyle(String s) {
        style = s;
    }
//getters
    public int getArea() {
        return area;
    }
    public String getStyle() {
        return style;
    }
}

//Computer
class Computer {
    private String type;
    private String CPU;
//setters
    public void setType(String t) {
        type = t;
    }
    public void setCPU(String c) {
        CPU = c;
    }
//getters
    public String getType() {
        return type;
    }
    public String getCPU() {
        return CPU;
    }
}

//Phone
class Phone {
    private String production;
    private String tag;
//setters
    public void setProduction(String p) {
        production = p;
    }
    public void setTag(String t) {
        tag = t;
    }
//getters
    public String getProduction() {
        return production
    }
    public String getTag() {
        return tag;
    }
}

//Currency
class Currency {
    private String country;
    private String name;
//setters
    public void setCountry(String c) {
        country = c;
    }
    public void setName(String n) {
        name = n;
    }
//getters
    public String getCountry() {
        return country;
    }
    public String getName() {
        return name;
    }
}

//planet
class Planet {
    private String name;
    private String location;
//setters
    public void setName(String n) {
        name = n;
    }
    public void setLocation(String l) {
        location = l;
    }
//getters
    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }
}

//transport
class Transport {
    private String type;
    private int maxSpeed;
//setters
    public void setType(String t) {
        type = t;
    }
    public void setMaxSpped(int s) {
        maxSpeed = s;
    }
//getters
    public String getType() {
        return type;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
}

//main
    public class Objects {
        public static void main(String[] args)
        {
            
        }
    }
}