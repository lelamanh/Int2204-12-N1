public class Student {
	private String name;
	private String id;
	private String group;
	private String email;

	Student() {
		this.name = "Student";
		this.id = "000";
		this.group = "INT22041";
		this.email = "uet@vnu.edu.vn";
	}

	Student(String n, String sid,String em) {
		this.name = n;
		this.id = sid;
		this.email = em;
		this.group = "uet@vnu.edu.vn";
 	}
	Student(Student s){
		this.name = s.name;
		this.id = s.id;
		this.group = s.group;
		this.email = s.email;
	}
	public String getName() {
		return this.name;
	}
	void setName(String s) {
		this.name = s;
	}

	String getID() {
		return this.id;
	}
	void setID(String s){
		this.id = s;
	}

	String getGroup() {
		return this.group;
	}
	public void setGroup(String s){
		this.group = s;
	}

	String getEmail() {
		return this.email;
	}
	void setEmail(String s){
		this.email = s;
	}

	void setInfo(String a,String b,String c,String d){
		this.name = a;
		this.id = b;
		this.group = c;
		this.email = d;
	}

	void getInfo(){
		System.out.println(this.name);
		System.out.println(this.id);
		System.out.println(this.group);
		System.out.println(this.email);
	}
	
}