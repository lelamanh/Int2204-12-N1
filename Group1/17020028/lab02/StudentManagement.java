public class StudentManagement
{
    Student[] student = new Student[100];
    int numberOfStudent = 0;

    public void addStudent(Student student)
    {
        this.student[numberOfStudent++] = student;
    }

    public boolean sameGroup(Student s1, Student s2)
    {
        return s1.getGroup().equals(s2.getGroup());
    }

    public void studentsByGroup()
    {
        String[] group = new String[100];
        int numberOfGroup = 0;
        int member[][] = new int[100][100];

        for(int i = 0; i < numberOfStudent; ++i)
        {
            int pos = -1;
            for(int j = 0; j < numberOfGroup; ++j)
                if (group[j].equals(student[i].getGroup()))
                {
                    pos = j;
                    break;
                }
            if (pos == -1)
            {
                pos = numberOfGroup;
                group[numberOfGroup++] = student[i].getGroup();
            }
            member[pos][++member[pos][0]] = i;
        }
        for(int i = 0; i < numberOfGroup; ++i)
        {
            System.out.println(group[i] + " - " + member[i][0] + " member(s):");
            for(int j = 1; j <= member[i][0]; ++j)
                System.out.println(student[member[i][j]].getName());
            System.out.println();
        }
    }

    public void removeStudent(String id)
    {
        for(int i = 0; i < numberOfStudent; ++i)
            while (i < numberOfStudent && student[i].getId().equals(id))
            {
                student[i] = new Student(student[numberOfStudent-1]);
                numberOfStudent--;
            }
    }

    public static void main(String[] args)
    {
        // Test Only
        StudentManagement management = new StudentManagement();
        management.addStudent(new Student("A", "001", "Group 0", "a@gmail.com"));
        management.addStudent(new Student("B", "002", "Group 2", "b@gmail.com"));
        management.addStudent(new Student("C", "003", "Group 1", "c@gmail.com"));
        management.addStudent(new Student("D", "004", "Group 1", "d@gmail.com"));
        management.addStudent(new Student("E", "005", "Group 0", "e@gmail.com"));
        management.addStudent(new Student("F", "003", "Group 2", "f@gmail.com"));

        management.studentsByGroup();

        management.removeStudent("003");
        for(int i = 0; i < management.numberOfStudent; ++i)
            management.student[i].getInfo();
    }
    
}