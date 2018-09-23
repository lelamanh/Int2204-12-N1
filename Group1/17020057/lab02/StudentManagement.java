import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

class StudentManagement
{
    Student[] students = new Student[100];
    public static void main(String[] args) 
    {
        StudentManagement sm = new StudentManagement();
        for(int i = 0; i < 20; i++) 
        {
            String id = String.valueOf(i + 17020000);
            sm.students[i] = new Student("Hoang Bao Long", id, "uet@vnu.edu.vn");
        }
        for(int i = 3; i <= 10; i++) sm.students[i].setGroup("INT22042");
        sm.students[13].setId("17020012");
        sm.removeStudent("17020001");
        sm.removeStudent("17020012");
        sm.removeStudent("17020005");
        sm.studentByGroup();
    }

    public void studentByGroup()
    {
        HashMap <String, Integer> map = new HashMap <String, Integer>();
        ArrayList < ArrayList <Integer> > list = new ArrayList<>();
        int cnt = 0;
        for(int i = 0; i < students.length; i++)
        {
            if (students[i] == null) break;
            if (map.containsKey(students[i].getGroup()))
            {
                int id = map.get(students[i].getGroup());
                list.get(id).add(i);
            }
            else
            {
                list.add(new ArrayList<Integer>());
                list.get(cnt).add(i);
                map.put(students[i].getGroup(), cnt);
                cnt++;
            }
        }
        for(int i = 0; i < cnt; i++)
        {
            System.out.println("Group " + students[list.get(i).get(0)].getGroup() + " co " + list.get(i).size() + " hoc sinh: ");
            for(int x : list.get(i))
                students[x].getInfo();
            System.out.println();
        }
    }
    
    public boolean sameGroup(Student a, Student b)
    {
        return a.getGroup().equals(b.getGroup());
    }

    void removeStudent(String id)
    {
        int numOfStudents = 0;
        ArrayList <Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < students.length; i++)
        {
            if (students[i] == null) 
            {
                numOfStudents = i;
                break;
            }
            if (!students[i].getId().equals(id)) arrayList.add(i);
        }
        int cnt = 0;
        for(int x : arrayList)
            students[cnt++] = new Student(students[x]);
        for(int i = cnt; i < numOfStudents; i++) students[i] = null;
    }
}