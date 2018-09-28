public class StudentManagement {
	//e l�m th�m b�i n�y v?i s? tr? gi�p c?a b?n
	public void studentsByGroup(){
        String[] group = new String[100];  // ten group, group = trang
		
		int numberOfGroup = 0;
		
		int member[][] = new int[100][100];
		
		Student[] student = new Student[100];
		int numberOfStudent = 0;
        for(int i=0; i<numberOfStudent; i++){
            int count = -1; // count = vi tri group thu bao nhieu
            for(int j=0; j<numberOfGroup; j++)
                if(group[j].equals(student[i].getGroup())){     // chu y cach viet equal
                    count = j;
                    break;
                }
            if(count==-1){
                numberOfGroup++;
                group[numberOfGroup-1] = student[i].getGroup();
                count = numberOfGroup-1;
            } 
            member[count][0]++;			//� n�y ch? s? lu?ng ngu?i trong group
            member[count][member[count][0]] = i;
        }    

        for(int j=0; j<numberOfGroup; j++){
            System.out.println(group[j] + " - " + member[j][0] + ": ");
            for(int i=1; i<=member[j][0]; i++)
                System.out.println(student[member[j][i]].getName());
        }
	}

	public boolean sameGroup(Student s1,Student s2){
		if(s1.getGroup.equals(s2.getGroup)) System.out.println("True");
		else System.out.println("False");
	}

	public static void main(String[] args){
		StudentManagement SM = new StudentManagement();
		//Student stu1 = new Student();
		//Student stu2 = new Student();
		//Student stu3 = new Student();
		// stu1.setName("Dat");
		// stu1.getName();
		// stu1.setInfo("Nguyen Thanh Dat","17021184","K62-CAC","nomenoparty99@gmail.com");
		// stu1.getInfo();
		// Student stu0 = new Student();
		// Student stu00 = new Student("A","001","A001@vnu.edu.vn");
		// Student stu000 = new Student(stu00);

		Student a1 = new Student();
		a1.setGroup("INT22041");
		Student a2 = new Student();
		a2.setGroup("INT22041");
		Student a3 = new Student();
		a3.setGroup("INT22042");

		
		SM.studentsByGroup();
	}
}
