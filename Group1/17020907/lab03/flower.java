//Hoa
public class flower {
	private String name, color; //Tên, màu sắc
	private double high, weight; //Chiều cao, nặng
	public flower(String name, String color, double high, double weight) {
		super();
		this.setName(name);
		this.setColor(color);
		this.setHigh(high);
		this.setWeight(weight);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHigh() {
		return high;
	}
	public void setHigh(double high) {
		this.high = high;
	}
	
}
