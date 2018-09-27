package Lab03_03.DoVat;

public class SanPham {
    String ten;
    String id;
    KichThuoc size;
    double khoiLuong;
    String mainUse;
    int chan = 0;
    public String getMainUse() {
        return mainUse;
    }

    public void setMainUse(String mainUse) {
        this.mainUse = mainUse;
    }


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
        return mainUse;
    }

    public void setUse(String mainUse) {
        this.mainUse = mainUse;
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

    public int getChan() {
        return chan;
    }

    public void setChan(int chan) {
        this.chan = chan;
    }

    //    public void setOther(Other other){
//        this.other = other;
//    }
//    public Other getOther(){
//        return this.other;
//    }

}
