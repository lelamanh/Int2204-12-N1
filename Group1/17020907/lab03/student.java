
public class student {
	private String name, MSSV, birthday; //Tên, MSSV, ngày sinh
	public student(String name, String mSSV, String birthday) {
		super();
		this.name = name;
		MSSV = mSSV;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMSSV() {
		return MSSV;
	}

	public void setMSSV(String mSSV) {
		MSSV = mSSV;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
}
