//Sách
public class book {
	private String name, content; //Tên, nội dung
	private double price; //Giá
	public book(String name, String content, double price) {
		this.setName(name);
		this.setContent(content);
		this.setPrice(price);
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
