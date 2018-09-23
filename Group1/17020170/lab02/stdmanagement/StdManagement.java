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
public class StdManagement 
{    
    Student[] students = new Student[5];
    
    public boolean sameGroup (Student std1, Student std2)
    {     
        return std2.getGroup().equals(std1.getGroup());
    }
    
    // Sap xep cac sinh vien co cung Group dung lien ke nhau tren danh sach
    void SortByGroup ()
    {
        for (int i = 0; i < students.length; i++)
        {                       
            for (int j = i + 1; j < students.length; j++)
            {
                if( sameGroup(students[i],students[j]) )
                {
                    i = i + 1;
                    if ( j > i )
                    {
                        Student temp;
                        temp = new Student(students[i]);
                        students[i] = students[j];
                        students[j] = temp;
                    } 
                }
            }
        }
    }
    
    
    void studentsByGroup ()
    {
        SortByGroup();
        for (int i = 0; i < students.length; i ++)
        {
            students[i].getInfo();            
        }
    }
    
    void removeStudent (String id)
    {
        Student[] temp = new Student[5];
        for (int i = 0; i < temp.length; i++)
        {
            temp[i] = new Student();
        }
        for (int i = 0; i < students.length; i++)
        {
            if (students[i].getSID().equals(id))
            {
            } else {
                temp[i] = students[i];
            }
        }
        students = temp;
        SortByGroup();
    }
    /**
     * @param args the command line arguments
     */
      
    
    public static void main(String[] args) 
    {
        // TODO code application logic here
        StdManagement sm = new StdManagement();
        
        
    }

    
}
