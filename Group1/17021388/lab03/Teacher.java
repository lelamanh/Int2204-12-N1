
public class Teacher {
    private String name_Teacher ;
    private String class_Teacher;
    private String sex;
    private String business;

// Hàm Khởi Tạo
    public Teacher(String name_Teacher, String class_Teacher, String sex, String business) {
        this.name_Teacher = name_Teacher;
        this.class_Teacher = class_Teacher;
        this.sex = sex;
        this.business = business;
    }
    // Hàm trả về tên
    public String getName_Teacher() {
        return name_Teacher;
    }
    // Hàm Khởi tạo name_Teacher
    public void setName_Teacher(String name_Teacher) {
        this.name_Teacher = name_Teacher;
    }
    // Hàm trả về class
    public String getClass_Teacher() {
        return class_Teacher;
    }
    // Hàm khởi tạo class
    public void setClass_Teacher(String class_Teacher) {
        this.class_Teacher = class_Teacher;
    }
    // Hàm trả về giới tính
    public String getSex() {
        return sex;
    }
     // Hàm khởi tạo giới tính
    public void setSex(String sex) {
        this.sex = sex;
    }
    // Hàm khởi tạo business
    public void setBusiness(String business) {
        this.business = business;
    }
    // Hàm trả về công business
    public String getBusiness() {
        return business;
    }
    // Hàm lấy dữ liệu
    public void getInfo(){
       System.out.println(name_Teacher);
       System.out.println(class_Teacher);
       System.out.println(sex);
       System.out.println(business);
    }

}
