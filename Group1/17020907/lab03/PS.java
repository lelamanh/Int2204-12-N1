
public class PS {
	private double tu, mau;
	PS(double tu, double mau) { //Constructor
		this.tu = tu;
		this.mau = mau;
	}
	//Các hàm getter, setter
	void setTu(double tu) {this.tu = tu;}
	void setMau(double mau) {this.mau = mau;}
	double getTu() {return tu;}
	double getMau() {return mau;}
	
	public PS cong(PS ps) {
		tu = tu*ps.mau + mau*ps.tu;
		mau = mau*ps.mau;
		return this;
	}
	public PS tru(PS ps) {
		tu = tu*ps.mau - mau*ps.tu;
		mau = mau*ps.mau;
		return this;
	}
	public PS nhan(PS ps) {
		tu *= ps.tu;
		mau *= ps.mau;
		return this;
	}
	public PS chia(PS ps) {
		tu *= ps.mau;
		mau *= ps.tu;
		return this;
	}
	public boolean equals(Object obj) { //So sánh 2 phân số bằng cách nhân chéo
		if (obj instanceof PS) {
			PS ps = (PS) obj;
			if (tu*ps.mau == mau*ps.tu) return true;
			else return false;
		} else return false;	
	}
}
