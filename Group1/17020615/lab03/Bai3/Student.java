package Bai3;

public class Student {
    private String Name;    // tên học sinh
    private String _class;  // lớp
    private String school;  // trường

    public Student() {      // tạo học sinh mới không có thông tin
    }

    public Student(String name, String _class, String school) {     // tạo sinh viên với thông tin là tham số truyền vào
        Name = name;
        this._class = _class;
        this.school = school;
    }

    public String getName() {       // lấy tên học sinh
        return Name;
    }

    public void setName(String name) {      // đặt tên học sinh
        Name = name;
    }

    public String get_class() {     // lấy tên lớp học
        return _class;
    }

    public void set_class(String _class) {  // đặt lại lớp học
        this._class = _class;
    }

    public String getSchool() {     // lấy tên trường
        return school;
    }

    public void setSchool(String school) {  // thay đổi trường
        this.school = school;
    }
}
