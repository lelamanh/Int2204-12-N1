

public class phanSo {
	int tuSo, mauSo;

	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}

	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}

	public int getTuSo() {
		return tuSo;
	}

	public int getMauSo() {
		return mauSo;
	}
	public phanSo() {
		
	}

	public phanSo(int tuSo, int mauSo) {
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}
	
	public phanSo chuanHoa() {
		 if (this.tuSo == 0 ) return new phanSo(0, 1);
		 else {
			 // tim ucln cua tu so va mau so
			 int a = Math.abs(this.tuSo);
			 int b = Math.abs(this.mauSo);
			 while( a != b ) {
				 if ( a> b) a -= b;
				 else b -= a;
			 }
			 int ucln = a;
			 
			// chuan hoa, chia tu, mau cho ucln
			if( this.tuSo * this.mauSo > 0) {
				if(this.tuSo > 0) { // tu va mau deu duong
					this.tuSo /= ucln;
					this.mauSo /= ucln;
				}
				else {// tu va mau deu am
					this.tuSo = Math.abs(this.tuSo / ucln);
					this.mauSo = Math.abs(this.mauSo / ucln);
				}
			}
			else {
				if ( this.tuSo >0 ) { // tu so duong, mau so am
					this.tuSo = - this.tuSo / ucln;
					this.mauSo = - this.mauSo / ucln;
					
				}
				else { // tu so am, mau so duong
					this.tuSo /= ucln;
					this.mauSo /= ucln;
				}
			}
		 }
		 return this;
	}
	
	public phanSo cong(phanSo ps) {
		phanSo tong = new phanSo();
		tong.setTuSo(this.tuSo * ps.getMauSo() + this.mauSo * ps.getTuSo() );
		tong.setMauSo( this.mauSo * ps.getMauSo() );
		tong.chuanHoa();
		return tong;
	}
	public phanSo tru(phanSo ps) {
		phanSo hieu = new phanSo();
		ps.setTuSo(- ps.getTuSo());
		hieu = this.cong(ps);
		hieu.chuanHoa();
		return hieu;
	}
	public phanSo nhan(phanSo ps) {
		phanSo tich = new phanSo();
		tich.setTuSo(this.tuSo * ps.getTuSo());
		tich.setMauSo(this.mauSo * ps.getMauSo() );
		tich.chuanHoa();
		return tich;
	}
	public phanSo chia(phanSo ps) {
		phanSo thuong = new phanSo();
		phanSo temp = new phanSo(ps.getMauSo(), ps.getTuSo());
		thuong = this.nhan(temp);
		thuong.chuanHoa();
		return thuong;
	}
	
	public boolean equals(Object obj) {
		if( obj instanceof phanSo){
			phanSo other = (phanSo) obj;
			phanSo temp = other.tru(this);
			return temp.getTuSo() == 0;
		}
		else return false;
	}
	
	public void print() {
		if( this.tuSo % this.mauSo == 0 ) {
			System.out.println(this.tuSo / this.mauSo);
		}
		else {
		System.out.println(this.getTuSo() + "/" + this.getMauSo());
		}
	}
	public static void main(String[] args) {
		phanSo ps1 = new phanSo(1,2);
		phanSo ps2 = new phanSo(1,2);
		phanSo ps3 = new phanSo();
		ps3 = ps1.cong(ps2);
		ps3.print();
		System.out.println(ps1.equals(ps3));
	}
	
}