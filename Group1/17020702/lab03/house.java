package communityuni.com.model;

public class house {

	private String address,color, rooms;// dia chi mau so phong
//getter setter
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRooms() {
		return rooms;
	}

	public void setRooms(String rooms) {
		this.rooms = rooms;
	}
	
	public house()
	{
		address="Nam Dinh";
		color="blue";
		rooms= "four";
	}
	public house(String address, String color, String rooms)
	{
		this.address=address;
		this.color=color;
		this.rooms=rooms;
	}
}
