package neon.com;

public class Teacher {
    private String name_Teacher ;
    private String class_Teacher;
    private String sex;
    private String business;

    public Teacher() {
    }

    public Teacher(String name_Teacher, String class_Teacher, String sex, String business) {
        this.name_Teacher = name_Teacher;
        this.class_Teacher = class_Teacher;
        this.sex = sex;
        this.business = business;
    }

    public String getName_Teacher() {
        return name_Teacher;
    }

    public void setName_Teacher(String name_Teacher) {
        this.name_Teacher = name_Teacher;
    }

    public String getClass_Teacher() {
        return class_Teacher;
    }

    public void setClass_Teacher(String class_Teacher) {
        this.class_Teacher = class_Teacher;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }
}
