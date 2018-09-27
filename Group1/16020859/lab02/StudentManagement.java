/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author Le cong
 *
 *
 */
public class StudentManagement {

    int Max = 100;
    Student[] students = new Student[Max];

    public StudentManagement() {
        for (int i = 0; i < 100; i++) {
            students[i] = new Student();
        }
    }
    //câu 9

    public boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equals(s2.getGroup());
    }

    /**
     *
     */
    @SuppressWarnings("empty-statement")
    public void studentsByGroup() {
        /* int i, j, l = 0;
        String[] string = new String[students.length];
        
        string[0] = students[0].getGroup();
        for (i = 1; i < students.length; i++) {
            int k = 0;
            for (j = 0; j < i; j++) {
                if (false == sameGroup(students[i], students[j])) {
                    k++;
                }
            }
            if (k == i) {
                string[l] = students[i].getGroup();
                l++;
            }
        }
        for (i = 0; i <= l; i++) {
            System.out.println(string[i] + ":");
            for (j = 0; j < students.length; j++) {
                if (string[i] == null ? students[j].getGroup() == null : string[i].equals(students[j].getGroup())) {
                    System.out.print(j + 1 + ":");
                    students[j].getInfo();
                }
            }
        }
         */
        int i = 0, j, k;
        while (i < students.length) {
            int l = 0;
            for (j = 0; j < students.length; j++) {
                System.out.println(students[i].getGroup() + ":");
                if (sameGroup(students[i], students[j])) {
                    students[i].getInfo();
                }
            }
            i++;
            for (k = i - 1; k >= 0; k--) {
                if (sameGroup(students[i], students[k])) {
                    l++;
                }
            }
            if (l != 0) {
                i++;
            }
        }

    }

    public void removeStudent(String id) {
        int i, j, k = 0;
        for (i = 0; i < students.length; i++) {
            if (students[i].getID().equals(id)) {
                break;

            }
        }
        for (j = i; j < students.length; j++) {
            students[j] = students[j + 1];
        }
        students[students.length - 1] = null;

        if (i == students.length) {
            System.out.println("Không có student nào có Id là :" + id);
        }

    }

    public static void main(String[] args) {
        //câu 2
        Student student = new Student();
        //câu 6
        student.setName("Lê Văn Công");
        student.setID("16020859");
        student.setGroup("K61-CD");
        student.setEmail("levancong2505@gmail.com");
        System.out.println("Tên sinh viên:" + student.getName());
        student.getInfo();
        //câu 8
        Student a = new Student();
        a.getInfo();
        Student b = new Student("Nguyễn Văn A", "14052674", "14052674@uetmail.edu.vn");
        b.getInfo();
        Student c = new Student(student);
        c.getInfo();
        //câu 10
        Student d = new Student();
        d.setGroup("K59CLC");
        Student e = new Student();
        e.setGroup("K59CLC");
        StudentManagement k = new StudentManagement();
        k.sameGroup(d, e);
        k.sameGroup(b, e);
        k.studentsByGroup();
        k.removeStudent("16020859");
        student.getInfo();

    }

}
