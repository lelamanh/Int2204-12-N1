package communityuni.com;

import java.util.Scanner;
//ham tim uoc chung lon nhat cua 2 so
public class equals {
	public  int ucln(int a,  int b)
	{
		return (b==0)?a:(ucln(b,a%b));
	}
	
	//Ham tinh day so fibonaxi
	public  int F(int n)
	{
		if(n==0) return 0;
		else if(n==1) return 1;
		return F(n-1)+F(n-2);
	}
public static void main(String[] args) {
	equals d= new equals();
Scanner scan = new Scanner(System.in);
//Cau a Bai 1
System.out.println("Nhap vao hai so:");
int a= scan.nextInt();
int b= scan.nextInt();
System.out.println("Ước chung lớn nhất của 2 số "+a+" và "+b+" là: "+d.ucln(a,b));
	//Câu b Bai 1
System.out.println("Nhap so nguyen n can tinh: ");
int n= scan.nextInt();
System.out.println("Ket qua la "+ d.F(n));
scan.close();
}
}
