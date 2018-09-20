import java.util.ArrayList;
import java.util.HashMap;

public class StudentManagement {
    public static final int MAX = 10;
    private Student[] students = new Student[MAX];
    private int numStudents = 0;
    public StudentManagement() {
        numStudents = StudentManagement.MAX;
        // test student by group
        for(int i = 0; i < numStudents; ++i) {
                this.students[i] = new Student();
        }
        
        students[0].setGroup("a");
        students[0].setName("a");
        students[1].setGroup("b");
        students[1].setName("b");
        students[2].setGroup("b");
        students[2].setName("b");
        students[2].setId("a");

        students[4].setGroup("a");
        students[4].setName("a");

    }

    public static void main(String[] agrs) {
        Student student = new Student("minh", "16021053", "CLC", "vanminh020698@gmail.com");
        System.out.println("my name: " + student.getName());
        student.getInfo();

        Student a = new Student("minh", "16021053", "vanminh020698@gmail.com");
        System.out.println("a info: ");
        a.getInfo();
        System.out.println("b info: ");
        Student b = new Student();
        b.getInfo();

        System.out.println("c info: ");
        Student c = new Student(a);
        c.getInfo();


        Student s1 = new Student();
        Student s2 = new Student();
        s1.setGroup("K59CLC");
        s2.setGroup("K59CLC");
        Student s3 = new Student();
        s3.setGroup("K59CB");
        if(Student.sameGroup(s1, s2)) {
            System.out.println("s1 and s2 is same group");
        } else {
            System.out.println("s1 and s2 is not same group");
        }
        
        if(Student.sameGroup(s1, s3)) {
            System.out.println("s1 and s3 is same group");
        } else {
            System.out.println("s1 and s3 is not same group");
        }
        
    }



    public void studentsByGroup() {
        HashMap<String, ArrayList<Student> > groupStudents = new HashMap<>();
        for(int i = 0; i < students.length; ++i) {
            if(groupStudents.get(students[i].getGroup()) == null) {
                groupStudents.put(students[i].getGroup(), new ArrayList<Student>());
                
            } 
            groupStudents.get(students[i].getGroup()).add(students[i]);
        }

        for(String x : groupStudents.keySet()) {
            System.out.println("group " + x + ": ");
            for(Student s : groupStudents.get(x)) {
                System.out.println(s.getName() + ", ");
            }
        }
    }
    /**
     * 
     * @param id
     * @return true if find student equals id else false;
     */
    public boolean removeStudent(String id) {
        for(int i = 0; i < numStudents; ++i) {
            if(students[i].getId().equals(id)) {
                for(int j = i; j < numStudents; ++j) {
                    students[j] = students[j + 1];
                }
                --numStudents;
                return true;
            }
        }
        return false;
    }

    public boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }
}