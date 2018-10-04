package communityuni.com.model;

public class Cat {

	private String name;//ten
	private double weight;//can nang
	private int age;// tuoi
	//getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//contructor ko co tham so truyen vao
	public Cat()
	{
		name="Meo";
		weight= 3.5;
		age= 3;
	}
	// contructor co tham so truyen vao
	public Cat(String name, double weight,int age)
	{
		this.name=name;
		this.weight=weight;
		this.age=age;
	}
}
