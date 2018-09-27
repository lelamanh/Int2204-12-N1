package Lab03_03;

public class SanPham {
    String ten;
    String id;
    KichThuoc size;
    double khoiLuong;
    String use;
    Other other;
    String nhaSanXuat;
    String loSo;
    String ngaySanXuat;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String type;

    public String getLoSo() {
        return loSo;
    }

    public void setLoSo(String loSo) {
        this.loSo = loSo;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public KichThuoc getSize() {
        return size;
    }

    public void setSize(KichThuoc size) {
        this.size = size;
    }

    public double getKhoiLuong() {
        return khoiLuong;
    }

    public void setKhoiLuong(double khoiLuong) {
        this.khoiLuong = khoiLuong;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public Other getOther() {
        return other;
    }

    public void setOther(Other other) {
        this.other = other;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public void setKichThuoc(KichThuoc temp){
        this.size = temp;
    }
    public KichThuoc getKichThuoc(){
        return this.size;
    }

//    public void setOther(Other other){
//        this.other = other;
//    }
//    public Other getOther(){
//        return this.other;
//    }

}
