import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement
{
    public static ArrayList<Student> myClass = new ArrayList<Student>();
    
    public static void main(String[] args)
    {
        StudentManagement sm = new StudentManagement();
        
        Student student1 = new Student();
        myClass.add(student1);
        student1.setName("Long");
        student1.setId("17021177");
        student1.setGroup("INT22042"); 
        student1.setEmail("17021177@vnu.edu.vn");
        System.out.println(student1.getName());
        System.out.println(student1.getInfo());

        Student student2 = new Student("Thai Khac Nguyen", "17021170", "17021170@vnu.edu.vn");
        myClass.add(student2);
        Student student3 = new Student(student2);
        myClass.add(student3);

        System.out.println(student2.getInfo());
        System.out.println(student3.getInfo());
        
        sm.sameGroup (student1, student2);
        sm.studentByGroup();
        
        /*Input the ID needed to remove*/
        System.out.println("Choose the student you want to remove, use the Student ID: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sm.removeStudent(input);
        
        /*Print the new Student list after use removeStudent*/
        for (int i = 0; i < myClass.size(); i++)
        {
            System.out.println(myClass.get(i).getInfo());
        }
    }

    /*Check the same Group*/
    public boolean sameGroup (Student s1, Student s2)
    {
        return s1.getGroup().equals(s2.getGroup());
    }

    /*Print student with same group*/
    public void studentByGroup() 
    {
        System.out.println("Here is all group we have. Let choose the group you want to see student, input Numerical Order from keyboard");
        
        /*Created Name of Group list*/
        ArrayList<String> nameGroup = new ArrayList<String>();
        for (int i = 0; i < myClass.size(); i++)
        {
            if (!nameGroup.contains(myClass.get(i).getGroup()))
            {    
                nameGroup.add(myClass.get(i).getGroup());
            }
        }
        
        /*Printed all name of group with numerical order*/
        for (int i = 0; i < nameGroup.size(); i++)
        {
            System.out.println((i + 1) + ". " + nameGroup.get(i));  //print e.g: "1. INT2204121"
        }
        
        /*Users can choose what group they want to see (use numerical order)*/
        Scanner sc = new Scanner(System.in);  
        int j = sc.nextInt();
        
        /*Following custom numerical order from user, check and print student have the same group with chosen group*/
        for (int i = 0; i < myClass.size(); i++)
        {
            if (nameGroup.get(j - 1).equals(myClass.get(i).getGroup()))
            {
                System.out.println(myClass.get(i).getInfo());
            }
        }
    }
    
    /*Remove student use ID*/
    public void removeStudent(String id)
    {
        for (int i = 0; i < myClass.size(); i++)
        {
            if (myClass.get(i).getId().equals(id));
            {
                myClass.remove(i);
            }
        }
    }
}