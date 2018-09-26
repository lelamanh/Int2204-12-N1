
package lap03;

public class GiaoVien {
    String name;
    int age;
    String Address;
    String subject;

    public GiaoVien(String name, int age, String Address, String subject) {
        this.name = name;
        this.age = age;
        this.Address = Address;
        this.subject = subject;
    } // ham khoi tao cho giao vien
        // cac ham get set cho cac thuoc tinh tuong ung
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
}
