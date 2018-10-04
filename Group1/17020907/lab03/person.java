
public class person {
	private String name, birthDay, address; //Tên, ngày sinh, địa chỉ
	private String phoneNumber;
	public person(String name, String birthDay, String address, String phoneNumber) {
		super();
		this.name = name;
		this.birthDay = birthDay;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthday) {
		this.birthDay = birthday;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
