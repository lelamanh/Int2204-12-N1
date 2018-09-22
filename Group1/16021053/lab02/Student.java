import java.util.Properties;

/**
 * @author Minh Ta Van
 * @since 9/4/2018
 */

public class Student {
    private String name, id, group, email;

    public Student() {name = "Student"; id = "000"; group = "K59CB"; email="uet@vnu.edu.vn";}
    public Student(String n, String id, String g, String email) {
        name = n; this.id = id; group = g; this.email = email;
    }
    public Student(String n, String id, String email) {
        name = n; this.id = id; group = "K59CB"; this.email = email;
    }
    public Student(Student s) {name = s.name; id = s.id; group = s.group; email = s.email;}

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {return name;}
    public String getId() {return id;}
    public String getGroup() {return group;}
    public String getEmail() {return email;}

    public String getInfo() {
        String x = "name: " + name + ", id: " + id + ", group: " + group + ", email: " + email;
        System.out.println(x);
        return x;
    }



}