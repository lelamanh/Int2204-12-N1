/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

/**
 *
 * @author Le cong
 */
public class Student {
   // Câu 1 + 3
   private String name;//Tên sinh viên
   private String ID;// mã số sinh viên
   private String group;// lớp học
   private String email; // địa chỉ email
   //câu 4
   public void setName(String name)
   {
       this.name=name;
   }
   public String getName()
   {
       return this.name;
   }
   public void setID(String ID)
   {
       this.ID=ID;
   }
   public String getID()
   {
       return this.ID;
   }
   public void setGroup(String group)
   {
       this.group=group;
   }
   public String getGroup()
   {
       return this.group;
   }
   public void setEmail(String email)
   {
       this.email=email;
   }
   public String getEmail()
   {
       return this.email;
   }
   // câu 5
   public void getInfo()
   {
       System.out.println("Tên :"+ this.name);
       System.out.println("Mã số :"+ this.ID);
       System.out.println("Lớp :"+ this.group);
       System.out.println("Email :"+ this.email);
       
   }
   //câu 7
   public Student()
   {
       this.name="Student";
       this.ID="000";
       this.group="K59CB";
       this.email="uet@vnu.edu.vn";
          
   }
   public Student(String n,String sid,String em)
   {
       this.name=n;
       this.ID=sid;
       this.email=em;
       this.group="K59CB";
   }
   public Student(Student s)
   {
       this.name=s.name;
       this.ID=s.ID;
       this.email=s.email;
       this.group=s.group;
   }
}
