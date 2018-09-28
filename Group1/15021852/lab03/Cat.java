
package lap03;

public class Cat {
        String name;
        String type;
        String sex;
        String color;

    public Cat(String name, String type, String sex, String color) {
        this.name = name;
        this.type = type;
        this.sex = sex;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
        
}
