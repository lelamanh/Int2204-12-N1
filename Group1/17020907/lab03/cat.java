//Mèo
public class cat {
	private String name, sex, color; //Tên, giới tính, màu
	private byte age; //Tuổi
	public cat(String name, String sex, String color, byte age) {
		this.setName(name);
		this.setSex(sex);
		this.setColor(color);
		this.setAge(age);
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
