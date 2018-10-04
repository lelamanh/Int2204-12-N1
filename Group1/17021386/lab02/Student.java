package neon;

public class Student {
    // bai 1 + 3
    private String name;
    private String id;
    private String group;
    private String email;

    // bai 4
    public void setName(String _name){
        name = _name;
    }
    public String getName(){
        return name;
    }
    public void setId(String _id){
        id = _id;
    }
    public String getId(){
        return id;
    }
    public void setGroup(String _group){
        group = _group;
    }
    public String getGroup(){
        return group;
    }
    public void setEmail(String _email){
        email = _email;
    }
    public String getEmail(){
        return email;
    }

    // bai 5
    public void getInfo(){
        System.out.println(getName());
        System.out.println(getId());
        System.out.println(getGroup());
        System.out.println(getEmail());
    }

    // bai 7
    public void Student(){
        name = "Student";
        id = "000";
        group = "K59CB";
        email = "uet@vnu.edu.vn";
    }

    public void Student(String n, String sid, String em){
        name = n;
        id = sid;
        email = em;
        group = "K59CB";
    }
    public void Student(Student s){
        name = s.name ;
        id = s.id;
        group = s.group;
        email = s.email;
    }


}
