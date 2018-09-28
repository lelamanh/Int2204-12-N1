package communityuni.com.model;

public class Tree {
	private String name;// ten
	private double height;//chieu cao
private int year;//tuoi
//getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	public Tree(String name,double height,int year)
	{
		this.name=name;
		this.height=height;
		this.year=year;
	}
	public Tree()
	{
		name="Bo Cong Anh";
		height=0.5;
		year=1;
	}
}
