package Bai3;

public class Cat {
    private String species;         // Loài
    private String name;            // Tên
    private boolean isBoy;          // Giới tính
    private int age;                // Tuổi

    public Cat() {}                 // Tạo đối tượng rỗng

    public Cat(String species, String name, boolean isBoy, int age) {       // Tạo đối tượng vói các tham số truyền vào
        this.species = species;
        this.name = name;
        this.isBoy = isBoy;
        this.age = age;
    }

    public String getSpecies() {    // lấy Loài
        return species;
    }

    public void setSpecies(String species) {    // đặt Loài
        this.species = species;
    }

    public String getName() {       // lấy Tên
        return name;
    }

    public void setName(String name) {          // đặt Tên
        this.name = name;
    }

    public boolean isBoy() {        // lấy giới tính
        return isBoy;
    }

    public void setBoy(boolean boy) {   // đặt giới tính
        isBoy = boy;
    }

    public int getAge() {           // lấy Tuổi
        return age;
    }

    public void setAge(int age) {       // đặt Tuổi
        this.age = age;
    }
}
