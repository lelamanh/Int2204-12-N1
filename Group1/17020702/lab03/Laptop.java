package communityuni.com.model;

public class Laptop {
private String hangLaptop;
private String color;//mau
private String resolution;//do phan giai
private String heDieuHanh;
public String getHangLaptop() {
	return hangLaptop;
}
public void setHangLaptop(String hangLaptop) {
	this.hangLaptop = hangLaptop;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getResolution() {
	return resolution;
}
public void setResolution(String resolution) {
	this.resolution = resolution;
}
public String getHeDieuHanh() {
	return heDieuHanh;
}
public void setHeDieuHanh(String heDieuHanh) {
	this.heDieuHanh = heDieuHanh;
}
public Laptop()
{
	hangLaptop="acer";
	color="while";
	resolution="15.6ing";
	heDieuHanh="win10";
}
public Laptop(String hangLaptop, String color, String resolution, String heDieuHanh)
{
	this.hangLaptop=hangLaptop;
	this.color=color;
	this.resolution=resolution;
	this.heDieuHanh=heDieuHanh;
}
}
