public class StudentManager {
    public static void main(String[] args)
    {
        Student s1 = new Student();

        s1.setName("Vu Van Chuc");
        s1.setId("17020615");
        s1.setGroup("INT220412");
        s1.setEmail("17020615@vnu.edu.vn");

        System.out.println(s1.getName());

        s1.getInfo();

        Student s2 = new Student();
        Student s3 = new Student("Nguyen Van A", "17020001", "17020001@vnu.edu.vn");
        Student s4 = new Student(s1);

        StudentManagement group = new StudentManagement();

        System.out.println(group.sameGroup(s2, s3));
        System.out.println(group.sameGroup(s2, s4));

        group.addStudent(s1);
        group.addStudent(s2);
        group.addStudent(s3);
        group.addStudent(s4);

        group.studentsByGroup();
        group.removeStudent("17020615");
        group.studentsByGroup();
    }
}
