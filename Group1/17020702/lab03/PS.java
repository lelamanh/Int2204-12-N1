package communityuni.com;
public class PS {
private int tu,mau;

public int getTu() {
	return tu;
}
public void setTu(int tu) {
	this.tu = tu;
}
public int getMau() {
	return mau;
}
public void setMau(int mau) {
	this.mau = mau;
}
// cau a
public PS(int tu, int mau)
{
	this.tu=tu;
	this.mau=mau;
}
//cau b
//tim UCLN cua tu va mau
public int timUCLN(int a, int b)
{
	return (b==0)?a:(timUCLN(b,a%b));
}
// toi gian phan so
public void toiGianPhanSo()
{
	int i=timUCLN(this.getTu(), this.getMau());
	this.setTu(this.getTu()/i);// truyen gia tri toi gian cho tu
	this.setMau(this.getMau()/i);//                       cho mau
}
// cong  phan so
public void congPhanSo(PS ps)
{
	int ts= this.getTu()*ps.getMau()+this.getMau()*ps.getTu();
	int ms= this.getMau()*ps.getMau();
	PS phanSoTong= new PS(ts,ms);
	phanSoTong.toiGianPhanSo();
	System.out.println("Tổng Hai Phân Số ="+ phanSoTong.tu+"/" + phanSoTong.mau);
}
// tru hai phan so
public void truPhanSo(PS ps)
{
	int ts= this.getTu()*ps.getMau()-this.getMau()*ps.getTu();
	int ms= this.getMau()*ps.getMau();
	PS phanSoHieu= new PS(ts,ms);
	phanSoHieu.toiGianPhanSo();
	System.out.println("Hiệu Hai Phân Số ="+ phanSoHieu.tu+"/" + phanSoHieu.mau);
}
//nhan hai phan so
public void nhanPhanSo(PS ps)
{
	int ts = this.getTu() * ps.getTu();
    int ms = this.getMau() * ps.getMau();
    PS phanSoTich = new PS(ts, ms);
    phanSoTich.toiGianPhanSo();
    System.out.println("Tích hai phân số = " + phanSoTich.tu + "/" + phanSoTich.mau);
}
//  chia hai phan so
public void chiaPhanSo(PS ps)
{
	int ts = this.getTu() * ps.getMau();
    int ms = this.getMau() * ps.getTu();
    PS phanSoThuong = new PS(ts, ms);
    phanSoThuong.toiGianPhanSo();
    System.out.println("Thương hai phân số = " + phanSoThuong.tu + "/" + phanSoThuong.mau);
}
public boolean equals(Object obj)
{
	if(obj instanceof PS)
	{
		PS other =(PS) obj;
		return true;
	}
	else return false;
}
}








