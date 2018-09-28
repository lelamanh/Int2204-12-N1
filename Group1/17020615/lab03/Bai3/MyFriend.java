package Bai3;

public class MyFriend {
    private String name;    // tên bạn
    private int age;        // tuổi của bạn
    private boolean sex;    // bạn là nam hay nữ

    public MyFriend() {     // tạo đối tượng bạn ko có thông tin
    }

    public MyFriend(String name, int age, boolean sex) {      // tạo đối tượng bạn với thông tin là tham số truyền vào
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {           // lấy tên bạn
        return name;
    }

    public void setName(String name) {      // thay đổi tên bạn
        this.name = name;
    }

    public int getAge() {               // lấy tuổi của bạn
        return age;
    }

    public void setAge(int age) {       // thay đổi tuổi bạn
        this.age = age;
    }

    public boolean isMale() {           // bạn là nam ?
        return sex;
    }

    public void setSex(boolean sex) {   // thay đổi giới tính
        this.sex = sex;
    }
}
