public class StudentManagement {
    private Student[] s;
    private Student[] sortedList;
    private int numStudents;
    private final int maxStudents = 100;

    public StudentManagement()
    {
        s = new Student[maxStudents];
        sortedList = new Student[maxStudents];
        numStudents = 0;
    }

    public void addStudent(Student m)
    {
        if (numStudents >= 100)
        {
            System.out.println("Group is full !");
        }
        else
        {
            s[numStudents] = new Student(m);

            int tempIndex = 0;

            while (tempIndex < numStudents && sortedList[tempIndex].getGroup().compareTo(m.getGroup()) <= 0)
            {
                tempIndex++;
            }

            for (int i = numStudents; i > tempIndex; i--)
            {
                sortedList[i] = sortedList[i - 1];
            }

            sortedList[tempIndex] = new Student(m);

            numStudents++;
        }
    }

    public void removeStudent(String id)
    {
        if (numStudents <= 0)
        {
            System.out.println("Group don't have any student !");
        }
        else
        {
            int newSize = 0;

            for (int i = 0; i < numStudents; i++)
            {
                if (!(s[i].getId().equals(id)))
                {
                    s[newSize] = s[i];
                    newSize++;
                }
            }

            for (int i = newSize; i < numStudents; i++)
            {
                s[i] = null;
            }

            int tempIndex = 0;
            int removeSize = numStudents - newSize;

            while (!sortedList[tempIndex].getId().equals(id))
            {
                tempIndex++;
            }

            for (int i = tempIndex; i < newSize; i++)
            {
                sortedList[i] = sortedList[i + removeSize];
            }

            for (int i = newSize; i < numStudents; i++)
            {
                sortedList[i] = null;
            }

            numStudents = newSize;
        }
    }

    public boolean sameGroup(Student s1, Student s2)
    {
        return (s1.getGroup().equals(s2.getGroup()));
    }

    public void studentsByGroup()
    {
        String temp = "";

        for (int i = 0; i < numStudents; i++)
        {
            if(!(temp.equals(sortedList[i].getGroup())))
            {
                System.out.println('\n' + sortedList[i].getGroup());
                System.out.println(sortedList[i].getName());

                temp = sortedList[i].getGroup();
            }
            else
            {
                System.out.println(sortedList[i].getName());
            }

        }
    }
}
