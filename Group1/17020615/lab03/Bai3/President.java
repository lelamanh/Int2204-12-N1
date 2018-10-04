package Bai3;

public class President {
    private String name;        // tên tổng thống
    private int age;            // tuổi ?
    private boolean isMale;     // là nam hay nữ ?
    private int beginProrogue;  // năm bắt đầu tại vị
    private int prorogueYears;  // số năm tại vị

    public President() {}       // tạo dối tượng tổng thống không có thông tin

    public President(String name, int age, boolean isMale, int beginProrogue, int prorogueYears) {      // tạo đối tượng tổng thống với thông tin là tham số truyền vào
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.beginProrogue = beginProrogue;
        this.prorogueYears = prorogueYears;
    }

    public String getName() {       //lấy tên tổng thống
        return name;
    }

    public void setName(String name) {      // đặt lại tên
        this.name = name;
    }

    public int getAge() {           // lấy tuổi
        return age;
    }

    public void setAge(int age) {   // đặt tuổi
        this.age = age;
    }

    public boolean isMale() {       // là nam ?
        return isMale;
    }

    public void setMale(boolean male) { // đặt lại giới tính
        isMale = male;
    }

    public int getBeginProrogue() {     // lấy năm bắt đầu
        return beginProrogue;
    }

    public void setBeginProrogue(int beginProrogue) {   // đặt lại năm bắt đầu
        this.beginProrogue = beginProrogue;
    }

    public int getProrogueYears() {     //
        return prorogueYears;
    }

    public void setProrogueYears(int prorogueYears) {
        this.prorogueYears = prorogueYears;
    }
}
