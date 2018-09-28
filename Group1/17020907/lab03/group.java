
public class group {
	private String name, id; //Tên, id
	private int students; //Số lượng sv
	public group(String name, String id, int students) {
		this.setName(name);
		this.setId(id);
		this.setStudents(students);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudents() {
		return students;
	}
	public void setStudents(int students) {
		this.students = students;
	}
	
	
}
