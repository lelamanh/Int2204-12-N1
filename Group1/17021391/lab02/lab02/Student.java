package tuan2;

public class Student {
	private
		String name;
		String id;
		String email;
		String group;
	public
		String getName() {return name;}
		String getID (){return id;}
		String getGroup (){return group;}
		String getEmail (){return email;}
		void setName( String name){this.name = name;}
		void setId( String id){this.id = id;}
		void setGroup( String group){this.group = group;}
		void setEmail( String email){this.email = email;}
		
		void getInfo ()
		{
			String inFo = "Name :" + name;
			inFo += "\nId : " + id;
			inFo += "\nGroup : " + group;
			inFo += "\nEmail : " + email + "\n";
			System.out.println(inFo);
		}
		
		public Student() {
			name = "Student";
			id = "000";
			group ="INT2204";
			email = "uet@vnu.edu.vn";
		}
		public Student(String n, String sid, String em) {
			name = n;
			id = sid;
			group ="INT2204";
			email = em;
		}
		public Student (Student st)
		{
			name = st.name;
			id = st.id;
			group = st.group;
			email = st.email;
		}
	
}
