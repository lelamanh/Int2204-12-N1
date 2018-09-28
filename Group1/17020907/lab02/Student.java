
public class Student {
	private
		String name;
		String id;
		String group;
		String email;
	public 
		Student() {
			name = "Student";
			id = "000";
			group = "INT22041";
			email = "uet@vnu.edu.vn";
		}
		Student(String name, String id, String email) {
			this.name = name;
			this.id = id;
			this.group = "INT22041";
			this.email = email;
		}
		Student(Student s) {
			name = s.name;
			id = s.id;
			group = s.group;
			email = s.email;
		}
		void setName (String name) {this.name = name;}
		void setId (String id) {this.id = id;}
		void setGroup (String group) {this.group = group;}
		void setEmail(String email) {this.email = email;}
		String getName() {return name;}
		String getId() {return id;}
		String getGroup() {return group;}
		String getEmail() {return email;}
		String getInfo() {
			return this.getName() + " " + this.getId() + " " + this.getGroup() + " " + this.getEmail();
		}
		
}
