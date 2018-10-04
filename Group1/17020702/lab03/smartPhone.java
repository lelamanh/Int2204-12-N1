package communityuni.com.model;

public class smartPhone {
	private String name;
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
private String color;
private String hangSanXuat;
private int Gia;
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getHangSanXuat() {
	return hangSanXuat;
}
public void setHangSanXuat(String hangSanXuat) {
	this.hangSanXuat = hangSanXuat;
}
public int getGia() {
	return Gia;
}
public void setGia(int gia) {
	Gia = gia;
}
public smartPhone(String color ,String hangSanXuat,int Gia,String name)
{
	this.name=name;
	this.color=color;
	this.hangSanXuat=hangSanXuat;
	this.Gia=Gia;
}
public smartPhone()
{
	name="samsungj7";
	color="black";
	hangSanXuat="samsung";
	Gia= 3000000;
	
}
}
