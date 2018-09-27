public class Student
{
    private String name;
    private String id;
    private String group;
    private String email;

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    public String getId() {return this.id;}
    public void setId(String id) {this.id = id;}

    public String getGroup() {return this.group;}
    public void setGroup(String group) {this.group = group;}

    public String getEmail() {return this.email;}
    public void setEmail(String email) {this.email = email;}

    public String getInfo()
    {
        System.out.println("Ho ten: " + this.name);
        System.out.println("Mssv: " + this.id);
        System.out.println("Class: " + this.group);
        System.out.println("Email: " + this.email);
        return "";
    }

    public Student()
    {
        this.name = "Student";
        this.id = "000";
        this.group = "INT22041";
        this.email = "uet@vnu.edu.vn";
    }

    public Student(String n, String sid, String em)
    {
        this.name = n;
        this.id = sid;
        this.group = "INT22041";
        this.email = em;
    }

    public Student(Student s)
    {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }
}