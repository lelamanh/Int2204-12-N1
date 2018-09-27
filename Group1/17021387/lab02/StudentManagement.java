
package lab02;

import java.util.ArrayList;

public class Student {
    private String name, id, group, email;
public String getName() { 
	return name;
}
public void setName (String n) {
	name = n;
}
public String getId() {
	return id;
}
public void setId (String i) {
	id = i;
}
public String getGroup(){
	return group;
}
public void setGroup (String g) {
	group = g;
}
public String getEmail(){
	return email;
}
public void setEmail (String e) {
	email = e;
}
public void getInfo() {
	System.out.println("Ho ten : " + name);
	System.out.println("MSSV : " + id);
	System.out.println("Lop : " + group);
	System.out.println("Email : " + email);

}
Student() {
	name = "Student" ;
	id = "000" ;
	group = "INT2204" ;
	email = "uet@vnu.edu.vn" ;

}
Student (String n, String sid, String em) {
	name = n ;
	id = sid ;
	email = em ;
	group = "INT22041" ;
}
public Student (Student s) {
	this.name = s.name;
	this.id = s.id;
	this.group = s.group;
	this.email = s.email;
}
}
public class StudentManagement {

    public static void main(String[] args) {
        Student s1 = new Student("A", "B", "C");
        Student s2 = new Student();
        s2.setGroup("INT22041");
        Student s3 = new Student(s2);
        s2.setGroup("INT22042");

        StudentManagement member = new StudentManagement();
        member.sameGroup(s1, s2);
        member.studentsByGroup();
        member.removeStudent("abc");

    }

    public boolean sameGroup(Student s1, Student s2) {
        if (s1.getGroup().equalsIgnoreCase(s2.getGroup())) {
            System.out.println("Hai sv cung lop.");
            return true;
        } else {
            System.out.println("Hai sv khong cung lop.");
            return false;
        }
    }
    ArrayList<Student> a = new ArrayList<>();

    public void studentsByGroup() {
        StudentManagement s = new StudentManagement();
        s.a = this.a;
        for (int i = 0; i < s.a.size(); i++) {
            for (int j = i; j < s.a.size(); j++) {
                System.out.print("Danh sách lớp " + s.a.get(i).getGroup() + ":");
                if (s.a.get(i).getGroup().equals(s.a.get(i).getGroup())) {
                    s.a.get(j).getInfo();
                    s.a.get(j).setGroup("null");
                }
            }

        }
    }


public void removeStudent(String id) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getId().equals(id)) {
                a.remove(i);
            }
        }
    }

}
