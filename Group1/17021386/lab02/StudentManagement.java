package neon;

import java.util.Scanner;

public class StudentManagement {

    // bai 11
    Student[] SV = new Student[100];

    public static void main(String[] args) {
        // bai 2
        Student sv = new Student();

        // bai 6
        Student me = new Student();
        me.setName("Ngo Duy Dat");
        me.setId("170213xx");
        me.setGroup("K62");
        me.setEmail("NDD@gmail.com");
        System.out.println("ten cua toi : " + me.getName());
        me.getInfo();

        // bai 8
        System.out.println("sv1 la : ");
        Student sv1 = new Student();
        sv1.Student();
        sv1.getInfo();

        System.out.println("sv2 la : ");
        Student sv2 = new Student();
        sv2.Student("Duy", "170213xx", "duy@gmail.com");
        sv2.getInfo();

        System.out.println("sv3 la : ");
        Student sv3 = new Student();
        sv3.Student(me);
        sv3.getInfo();

        // bai 10
        // sv1 - K59CB
        Student sv4 = new Student();
        sv4.setGroup("K59CLC");
        Student sv5 = new Student();
        sv5.setGroup("K59CLC");
        if (sameGroup(sv1, sv4) == true) {
            System.out.println("sv1 & sv4 cung lop");
        } else {
            System.out.println("sv1 & sv4 khong cung lop");
        }

    }

    // bai 9
    public static   boolean sameGroup(Student s1, Student s2) {
        return s1.getGroup().equalsIgnoreCase(s2.getGroup());
    }

    // bai 12
    public  void studentByGroup() {
        System.out.print(SV[0].getGroup()+ " " + SV[0].getName()+ " ");
        for(int i= 1;i< SV.length ; i++)
        {
            if (SV[i].getGroup().compareTo(SV[i-1].getGroup())== 0)
            {
                System.out.print(SV[i].getName()+" ");
            }
            else
            {
                System.out.println();
                System.out.print(SV[i].getGroup()+ " " + SV[i].getName()+ " ") ;;
            }
        }


    }

    // bai 13
    public boolean  removeStudent(String id) {
        int l = SV.length;
        int i;
        for (i = 0; i < SV.length; i++) {
            if (SV[i].getId().equalsIgnoreCase("id"))
            {
                break;
            }
        }
        if (i == SV.length)
            return false;
        for (int j = i; j < SV.length - 1; j++) //cập nhật lại mảng
        {
            SV[j] = SV[j + 1];
        }
        l--;
        return true;
    }

}




