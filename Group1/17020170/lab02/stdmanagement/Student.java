/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stdmanagement;

/**
 *
 * @author Minh
 */
public class Student 
{
    private String Name;
    private String SID;
    private String Group;
    private String EM;
    
    public void setName (String n)
    {
        this.Name = n;
    }
    public String getName ()
    {
        return this.Name;
    }
    
    public void setSID (String n)
    {
        this.SID = n;
    }
    public String getSID ()
    {
        return this.SID;
    }
    
    public void setGroup (String n)
    {
        this.Group = n;
    }
    public String getGroup ()
    {
        return this.Group;
    }
    
    public void setEmail (String n)
    {
        this.EM = n;
    }
    public String getEM ()
    {
        return this.EM;
    }
    
            
    public String getInfo ()
    {
        System.out.println("Ho ten: " + this.Name);
        System.out.println("Ma so SV: " + this.SID);
        System.out.println("Lop: " + this.Group);
        System.out.println("Email: " + this.EM);
        return "";
    }
    
    //Cac phuong thuc khoi tao
    //Khoi tao ko tham so
    public Student(){
        this.Name = "Student";
        this.SID = "000";
        this.Group = "K59CB";
        this.EM = "uet@vnu.edu.vn";
    }
    
    //Khoi tao voi tham so
    public Student(String n, String sid, String em)
    {
        this.Name = n;
        this.SID = sid;
        this.EM = em;
        this.Group = "K59CB";
    }
    
    //Khoi tao sao chep
    public Student(Student std)
    {
        this.Name = std.getName();
        this.SID = std.getSID();
        this.Group = std.getGroup();
        this.EM = std.getEM();
    }
    
    
}
