//Giáo viên
public class teacher {
	private String name, id, address; //Tên, id, địa chỉ
	private int phoneNumber; //Số đt
	public teacher(String name, String id, String address, int phoneNumber) {
		this.setName(name);
		this.setId(id);
		this.setAddress(address);
		this.setPhoneNumber(phoneNumber);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
