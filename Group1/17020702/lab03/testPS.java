package communityuni.com.test;

import communityuni.com.PS;

public class testPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
PS ps1= new PS(20,3);// tạo phân số có tử =20 và mẫu =3
PS ps2= new PS(4,8);//tạo phân số 2 có tử =4 mẫu =8

// gọi phuong thuc cong tru nhan chia so sánh
ps1.congPhanSo(ps2);
ps1.truPhanSo(ps2);
ps1.chiaPhanSo(ps2);
ps1.nhanPhanSo(ps2);
if (ps1.equals(ps2))
    System.out.println("Bang nhau");
else
    System.out.println("Khong bang nhau");

	}

}
