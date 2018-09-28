//Tai nghe
public class headPhone {
	private String name, origin; //Tên, nơi SX
	private double price; //Giá 
	public headPhone(String name, String origin, double price) {
		this.setName(name);
		this.setOrigin(origin);
		this.setPrice(price);
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
}
