package communityuni.com.model;

public class bike {
private String color;  // màu của xe
private String name_bike ; // hãng xe

//getter setter
public String getColor() {
	return color;  

}
public String getName_bike() {
	return name_bike;
}

public void setName_bike(String name_bike) {
	this.name_bike = name_bike;
}

public void setColor(String color) {
	this.color = color;
}
//Constructor không có tham số 
public bike()
{
	color="blue";
	name_bike="super_Bike";
}
//contructor kieu tham số truyền vào
public bike(String color, String name_bike)
{
	this.color=color;;
	this.name_bike=name_bike;
}
}
