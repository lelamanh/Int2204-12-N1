package tuan2;


public class StudentManagement {
	Student[] st = new Student[100];
	int soSv;
	
	public int getSoSv() {
		return soSv;
	}
	public void setSoSv(int soSv) {
		this.soSv = soSv;
	}
	
	public boolean samegroup(Student s1, Student s2)
	{
		return s1.getGroup().equals(s2.getGroup());
	}
	
	public static void main(String[] args) {
		// kiem tra constructor
		Student st1 = new Student();
		Student st2 = new Student("HovaTen","123456789","9874@gmail.com");
		st1.getInfo();
		st2.getInfo();
		Student st3 = new Student(st2);
		st3.getInfo();
		
		
		
		StudentManagement stList = new StudentManagement();
		stList.setSoSv(6); // set soSv = 6 , max = 100
		for( int i = 0 ; i< stList.getSoSv(); i++)
		{
			stList.st[i] = new Student("student"+i, "id"+i, "email"+i);
		}
		stList.st[0].setGroup("001");
		stList.st[1].setGroup("002");
		stList.st[2].setGroup("001");
		stList.st[3].setGroup("003");
		stList.st[4].setGroup("002");
		stList.st[5].setGroup("003");
		stList.st[2].setId("id3");
		
		// kiem tra phuong thuc samegroup
		if ( stList.samegroup(stList.st[0], stList.st[1])) System.out.println("cung nhom");
		else System.out.println("khac nhom");
		
		
		stList.studentByGroup();
		
		
		//stList.removeStudent("id3");
		
	}
	
	public void studentByGroup()
	{
		// sap xep 
		for ( int i = 0 ; i < this.soSv - 1 ; i++)
		{
			// 1 2 3 1 2 3 4 2 
			int k = i;
			for ( int j = i+1 ;j < this.soSv; j++ )
			{
				if( samegroup(st[i], st[j]) ) 
				{
					k++;
					Student temp = st[j];
					st[j] = st[k];
					st[k] = temp;
				}
			}
		}
		
		// in
		for ( int i= 0; i < this.soSv; i++)
		{
			st[i].getInfo();
		}
	}
	public void removeStudent(String id)
	{
	
		while (st[this.soSv-1].getID().equals(id) ) this.soSv--; // id nam cuoi mang

		for ( int i = 0; i< this.soSv; i++)
		{
			while ( st[i].getID().equals(id))
			{
				for ( int j = i ; j < this.soSv-1; j++)
				{
					st[j]= st[j+1];
				}
				this.soSv--;
			}
		}
		
		for ( int i = 0 ; i<this.soSv; i++)
		{
			st[i].getInfo();			
		}
		
		
		
	}
}
