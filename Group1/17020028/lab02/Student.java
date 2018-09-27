public class Student
{
    private String name, id, group, email;

    Student()
    {
        name    = "Student";
        id      = "000";
        group   = "INT2204_1";
        email   = "uet@uet.edu.vn";
    }

    Student(String name, String id, String email)
    {
        this.name   = name;
        this.id     = id;
        this.group  = "INT2204_1";
        this.email  = email;
    }

    Student(String name, String id, String group, String email)
    {
        this.name   = name;
        this.id     = id;
        this.group  = group;
        this.email  = email;
    }

    Student(Student student)
    {
        name    = student.name;
        id      = student.id;
        group   = student.group;
        email   = student.email;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String _name)
    {
        name = _name;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String _id)
    {
        id = _id;
    }

    public String getGroup()
    {
        return group;
    }

    public void setGroup(String _group)
    {
        group = _group;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String _email)
    {
        email = _email;
    }

    public void getInfo()
    {
        System.out.println("Name:   " + name);
        System.out.println("Id:     " + id);
        System.out.println("Group:  " + group);
        System.out.println("Email:  " + email);
        System.out.println();
    }

}