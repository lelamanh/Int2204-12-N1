
public class Car {
    private String name; // Tên xe
    private String BKS; // Biển kiểm soát
    private int prize; // Giá

    // Constructor đầy đủ tham số lớp Car
    Car(String name, String BKS, int prize) {
        this.name = name;
        this.BKS = BKS;
        this.prize = prize;
    }


     // Hàm khởi tạo biến name

    public void setName(String name) {
        this.name = name;
    }


    // Hàm trả về biến name

    public String getName() {
        return name;
    }


     // Hàm khởi tạo biến BKS

    public void setBKS(String BKS) {
        this.BKS = BKS;
    }


     // Hàm trả về biến BKS

    public String getBKS() {
        return BKS;
    }

     // Hàm khởi tạo biến prize

    public void setPrize(int prize) {
        this.prize = prize;
    }
     // Hàm trả về biến prize
    public int getPrize() {
        return prize;
    }

    // Ham trả về thông tin
    public void getInfo(){
        System.out.println(name);
        System.out.println(BKS);
        System.out.println(prize);
    }
    }

}
