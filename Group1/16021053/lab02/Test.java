public class Test {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.studentsByGroup();
        studentManagement.removeStudent("a");
        studentManagement.studentsByGroup();
    }
}