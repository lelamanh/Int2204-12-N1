//Đồng hồ
public class clock {
	 private String name, id; //Tên, id
	 private boolean status; //Trạng thái còn hay ko
	 private double price; //Giá
	 public clock(String name, String id, boolean status, double price) {
	 	this.setName(name);
		this.setId(id);
		this.setStatus(status);
		this.setPrice(price);
	 }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	 
}
