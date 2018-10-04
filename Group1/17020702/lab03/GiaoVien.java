package communityuni.com.model;

public class GiaoVien {
	private String name;//tên
	private int tuoi;// tuổi
	private String gioiTinh;// gioi tinh
	private String chuyenNganh;// chuyen nganh
// getter setter
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getTuoi() {
	return tuoi;
}
public void setTuoi(int tuoi) {
	this.tuoi = tuoi;
}
public String getGioiTinh() {
	return gioiTinh;
}
public void setGioiTinh(String gioiTinh) {
	this.gioiTinh = gioiTinh;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getChuyenNganh() {
	return chuyenNganh;
}
public void setChuyenNganh(String chuyenNganh) {
	this.chuyenNganh = chuyenNganh;
}
//contructor có tham so truyen vao
public GiaoVien(String name, int tuoi, String gioiTinh,String chuyenNganh)
{
	this.name=name;
	this.tuoi=tuoi;
	this.gioiTinh=gioiTinh;
	this.chuyenNganh=chuyenNganh;
}
//contructor ko có tham so truyen vao
public GiaoVien()
{
	name="Lê Thi Mộng";
	tuoi= 30;
	gioiTinh="Nu";
	chuyenNganh="Toán";
}
}
