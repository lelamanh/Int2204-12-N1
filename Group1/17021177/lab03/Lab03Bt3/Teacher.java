/*
 *
 * @Class Teacher
 * @Author Phạm Thiên Long
 *
 * */
package Lab03Bt3;

public class Teacher {
    private String name;
    private int age;
    private String sex;
    private String subject;
    private String school;

    /*getter/setter name*/
    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    /*getter/setter sex*/
    public String getSex() {return this.sex;}
    public void setSex(String sex) {this.sex = sex;}

    /*getter/setter age*/
    public int getAge() {return this.age;}
    public void setAge(int age) {this.age = age;}

    /*getter/setter school*/
    public String getSchool() {return this.school;}
    public void setSchool(String school) {this.school = school;}

    /*getter/setter subject*/
    public String getSubject() {return this.subject;}
    public void setSubject(String subject) {this.subject = subject;}
}
