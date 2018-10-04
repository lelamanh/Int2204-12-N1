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
 public class StudentManagement{
	 public boolean sameGroup(Student s1, Student s2){
		 if (s1.getGroup() == s2.getGroup())
		 {   System.out.println("Same Group!");
			 return true;}
	     else {return false;}
	 }
	 public void StudentByGroup(Student a[],Student b[]){
		     b[0] = a[0];
		 for (int i = 1 ; i <= 99; i++){
			 if( a[0].getGroup() == a[i].getGroup()){
				 b[i] = a[i];
			 }
		 }
		     System.out.println("Sinh Vien Group: " + a[0].getGroup());
			 for(int i = 0 ; i <= 99; i++){
			 System.out.println(b[i]);
			 }
			 for (int i = 1 ; i <= 99; i++){
			    if( a[0].getGroup() != a[i].getGroup()){
					a[0] = a[i];
				}
		 }
		 for (int i = 1 ; i <= 99; i++){
			 if( a[0].getGroup() == a[i].getGroup()){
				 b[i] = a[i];
				 System.out.println(b[i]);
	         }
         } 
	 }
	public  static void removeStudent(String id, Student a[]){
		for (int i = 0; i <= a.length; i++){
			if (a[i].getId() == id){
				a[i] = a[i + 1];
			}
		}
	}
    public static void main(String[] args){
     Student Student[] = new Student[99];
	 Student a[] = new Student[99];
	 Nothing b = new Nothing();
	 b.StudentByGroup(Student, a);
	 b.removeStudent("17021388",Student);
	}
 }

