package Bai3;

public class Tree {
    private String species;     // loài ?
    private int age;            // tuổi ?

    public Tree() {             // tạo một đối tượng cây với thông tin rỗng
    }

    public Tree(String species, int age) {  // tạo đối tượng cây với thông tin là tham số truyền vào
        this.species = species;
        this.age = age;
    }

    public String getSpecies() {        // lấy loài
        return species;
    }

    public void setSpecies(String species) {    // đặt lại loài cây
        this.species = species;
    }

    public int getAge() {               // lấy tuổi
        return age;
    }

    public void setAge(int age) {       // dặt lại tuổi
        this.age = age;
    }
}
