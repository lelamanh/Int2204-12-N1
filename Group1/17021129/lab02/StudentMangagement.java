class Student 
{
	private String Name;
	private String Id;
	private String Group;
	private String Email;
	public Student()
	{
		Name = "Student";
		Id= "000";
		Group ="INT22041";
		Email ="uet@vnu.edu.vn";
	}
	public Student(String n, String sid, String em)
	{
		Name = n;
		Id= sid;
		Email = em;
		Group = "INT22041";
	}
	public Student(Student s)
	{
		Name = s.getName();
		Id = s.getId();
		Email = s.getEmail();
		Group = s.getGroup();
	}
	public void setName(String Name)
	{
		this.Name = Name;
	}
	public String getName()
	{
		return Name;
	}
	public void setId(String Id)
	{
		this.Id = Id;
	}
	public String getId()
	{
		return Id;
	}
	public void setGroup(String Group)
	{
		this.Group = Group;
	}
	public String getGroup()
	{
		return Group;
	}
	public void setEmail(String Email)
	{
		this.Email = Email;
	}
	public String getEmail()
	{
		return Email;
	}
	public String getInfo()
	{
		String info = Name + " " + Id +" "+Group +" "+ Email;
		return info;
	}
}

public class StudentMangagement
{
	Student[] list;
	int index = 0 ;
	public boolean sameGroup(Student s1, Student  s2 )
	{
		if (s1.getGroup()== s2.getGroup())
			return true;
		return false;
	}	
	public void setList()
	{
		list = new Student[100];
	}
	public void addStudent(Student s)
	{
		list[index]= s;
		index++;
	}
	public void sortList()
	{
		Student temp;
		for (int i=0;i< index-1  ;i++ )
		{
			for(int j= i+1; j < index ; j++)
			{
				if (list[i].getGroup().compareTo(list[j].getGroup()) < 0 && list[i].getGroup().compareTo(list[j].getGroup())!= 0)
				{
					temp = list[i];
					list[i]= list[j];
					list[j]= temp;
				}
			}
		}
	}
	public void studentsByGroup()
	{
		System.out.print(list[0].getGroup()+ " " + list[0].getName()+ " ");
		for(int i= 1;i<  index ; i++)
		{
			if (list[i].getGroup().compareTo(list[i-1].getGroup())== 0) 
			{
				System.out.print(list[i].getName()+" ");
			}
			else
			{
				System.out.println();
				System.out.print(list[i].getGroup()+ " " + list[i].getName()+ " ") ;;
			}
		}
	}
	public void removeStudent(String id)
	{
		int j= 0; 
		for(int i= 0; i< index; i++)
		{
			if (list[i].getId().compareTo(id)!= 0)
			{
				list[j]= list[i];
				j++;
			}
		}
		for(int i= j; i< index; i++)
		{
				list[i]= null;
		}
		index = j;
	}

	public static void main(String[] args) 
	{
		StudentMangagement m = new StudentMangagement();
		Student ST1 = new Student("viet", "111", "33");
		Student ST2 = new Student("dai", "112", "33");
		Student  ST3 = new Student("tran", "113","44");
		ST3.setGroup("INT22042");
		if ( m.sameGroup(ST1,ST3)== true) System.out.println("CungLop");
		else System.out.println("Khong cung lop");
		m.setList();
		m.addStudent(ST1);
		m.addStudent(ST3);
		m.addStudent(ST2);
		m.sortList();
		m.studentsByGroup();
		m.removeStudent("111");
	}
}