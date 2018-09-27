class Student
{
    private String name, id, group, email;

    public Student()
    {
        name = "Student";
        id = "000";
        group = "INT22041";
        email = "uet@vnu.edu.vn";
    }

    public Student(String name, String id, String group, String email)
    {
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }

    public Student(String n, String sid, String em)
    {
        name = n;
        id = sid;
        group = "INT22041";
        email = em;
    }

    public Student(Student s)
    {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getGroup()
    {
        return group;
    }

    public void setGroup(String group)
    {
        this.group = group;
    }

    public String getId()
    {
        return this.id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public void getInfo()
    {
        if (this == null) return;
        System.out.println("Ho va ten: " + name);
        System.out.println("Ma so sinh vien: " + id);
        System.out.println("Lop hoc: " + group);
        System.out.println("Email: " + email);
        System.out.println();
    }
}