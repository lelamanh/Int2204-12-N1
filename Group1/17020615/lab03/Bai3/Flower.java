package Bai3;

public class Flower {
    private String species;         // loài hoa
    private String color;           // màu sắc

    public Flower() {               // đối tượng hoa không có thông tin
    }

    public Flower(String species, String color) {       // đối tượng hoa có thông tin là tham số truyền vào
        this.species = species;
        this.color = color;
    }

    public String getSpecies() {          // lấy tên loài
        return species;
    }

    public void setSpecies(String species) {    // đặt lại loài
        this.species = species;
    }

    public String getColor() {              // lấy màu
        return color;
    }

    public void setColor(String color) {        // thay dổi màu sắc
        this.color = color;
    }
}
