import java.util.ArrayList;

public class StudentManagement {
	public ArrayList<Student> students = new ArrayList<Student>(100);
	
	public void studentsByGroup() {
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).getInfo());
		}
	}
	
	public void removeStudent (String id) {
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).id == id) students.remove(i); 
		}
	}
	
	public static boolean sameGroup (Student s1, Student s2) {
		if (s1.group == s2.group) return true;
		else return false;
	}

	public static void main(String[] args) {
		Student stu1 = new Student("Duong Hoai Nam", "17020907", "namduong3699@gmail.com");
		Student stu2 = new Student();
		System.out.println(stu1.getName());
		System.out.println(stu1.getInfo());
		System.out.println(stu2.getInfo());
		Student stu3 = new Student();
		stu3.setGroup("INT22042");
		if (sameGroup(stu1, stu3)) System.out.println("Hai sinh viên cùng lớp");
		else System.out.println("Hai sinh viên khác lớp");
	}

}
