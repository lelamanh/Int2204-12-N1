package Bai3;

public class Teacher {
    private String name;
    private int age;
    private boolean sex;    // True = Male, False = Female
    private String subject;

    public Teacher() {      // khởi tạo đổi tượng giáo viên với thông tin rỗng
        name = null;
        age = 0;
        sex = true;
        subject = null;
    }

    public Teacher(String name, int age, String subject) {  // khởi tạo giáo viên với thông tin là tham số truyền vào
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }       // lấy tên

    public void setName(String name) {
        this.name = name;
    }       // thay đổi tên

    public int getAge() {
        return age;
    }            // lấy tuổi

    public void setAge(int age) {
        this.age = age;
    }              // đặt lại tuổi

    public boolean isMale() {           // có phải nam hay không ?
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }       // đặt lại giới tính

    public String getSubject() {
        return subject;
    }            // lấy môn học

    public void setSubject(String subject) {
        this.subject = subject;
    }   // đặt lại môn học
}
