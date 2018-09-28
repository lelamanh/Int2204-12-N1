package neon.com;

public class Car {
    private String name; // Tên xe
    private String BKS; // Biển kiểm soát
    private int prize; // Giá

    //Constructor không tham số lớp Car
    Car() {

    }

    /* Constructor đầy đủ tham số lớp Car */
    Car(String name, String BKS, int prize) {
        this.name = name;
        this.BKS = BKS;
        this.prize = prize;
    }

    /**
     * Hàm khởi tạo biến name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Hàm trả về biến name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Hàm khởi tạo biến BKS
     * @param BKS
     */
    public void setBKS(String BKS) {
        this.BKS = BKS;
    }

    /**
     * Hàm trả về biến BKS
     * @return BKS
     */
    public String getBKS() {
        return BKS;
    }

    /**
     * Hàm khởi tạo biến prize
     * @param prize
     */
    public void setPrize(int prize) {
        this.prize = prize;
    }

    /**
     * Hàm trả về biến prize
     * @return prize
     */
    public int getPrize() {
        return prize;
    }

    /* Hàm còi xe */
    public void horn() {
        System.out.println("Bíp bíp");
    }

}
