class Student{
	private String name;
    private String id;
    private String group;
    private String email;	
	public Student(){
		name = "Student";
		id = "000";
		group = "K59CB";
		email = "uet@vnu.edu.vn";
	}
	public Student(String n, String sid, String em){
		group = "K59CLC";
		this.name = n; 
		this.id = sid;
		this.email = em;
	}
	public Student(Student s){
		this.name = s.name;
		this.id = s.id;
		this.group = s.group;
		this.email = s.email;
	}
	public void setInfo(String name, String id, String group, String email){
		this.name = name;
		this.id = id;
		this.group = group;
		this.email = email;
	}
    public String getName(){
		return name;
	}
	public String getId(){
	    return id;}
	public String getGroup(){
	    return group;}
	public String getEmail(){
        return email;}
	public void getInfo(){
		System.out.println(name);
		System.out.println(id);
		System.out.println(group);
		System.out.println(email);
	}
 }