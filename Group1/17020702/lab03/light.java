package communityuni.com.model;

public class light {

	boolean trang_thai;
    String loai;
    int cong_suat;
    //getter setter
	public boolean isTrang_thai() {
		return trang_thai;
	}
	public void setTrang_thai(boolean trang_thai) {
		this.trang_thai = trang_thai;
	}
	public String getLoai() {
		return loai;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
	public int getCong_suat() {
		return cong_suat;
	}
	public void setCong_suat(int cong_suat) {
		this.cong_suat = cong_suat;
	}
	//contructor co tham so truyen vao
	public light(boolean trang_thai, String loai,int cong_suat)
	{
		this.trang_thai=trang_thai;
		this.loai=loai;
		this.cong_suat=cong_suat;
	}
	//contructor ko co tham so truyen vao
	public light()
	{
		loai="leg";
		cong_suat=200;
	}
}
