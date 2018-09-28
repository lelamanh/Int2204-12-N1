package neon.com;

public class Sneaker {
    private String name; // Tên giày
    private String producer; // Nhà sản xuất
    private String own; // Chủ giày
    private int prize; //Giá

    /* Constructor không tham số lớp Sneakers */
    Sneakers() {

    }

    /* Constructor đầy đủ tham số lớp Sneakers */
    Sneakers(String name, String producer, String own, int prize) {
        this.name = name;
        this.producer = producer;
        this.own = own;
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
     * Hàm khởi tạo biến producer
     * @param producer
     */
    public void setProducer(String producer) {
        this.producer = producer;
    }

    /**
     * Hàm trả về biến producer
     * @return producer
     */
    public String getProducer() {
        return producer;
    }

    /**
     * Hàm khởi tạo biến own
     * @param own
     */
    public void setOwn(String own) {
        this.own = own;
    }

    /**
     * Hàm trả về biến own
     * @return own
     */
    public String getOwn() {
        return own;
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

    /* In ra thông tin giày*/
    public void getInfo() {
        System.out.println("Tên giày: " + name);
        System.out.println("Nhà sản xuất: " + producer);
        System.out.println("Chủ giày: " + own);
        System.out.println("Giá: " + prize);
    }
}
