package communityuni.com.model;

public class book {
private String name;//tên sách
private String author;// tác  giả
private double price;//giá sách
//getter setter
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
//contructor ko có tham số truyền vào
public book()
{
	name="tieng viet lop 1";// tên sách
	author="Bui Hien ";// tác giả
	price= 15000;// gia sách
}
//contructor có tham số truyền vào
public book(String name, String author , double price)
{
	this.author=author;
	this.name=name;
	this.price=price;
}

}
