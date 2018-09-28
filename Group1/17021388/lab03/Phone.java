

public class Phone {
    private String name; // Tên(mã) smartphone
    private String configuration; // Cấu hình
    private int price; // Giá


    // Constructor đầy đủ tham số lớp Smartphone
    Smartphone(String name, String configuration, int prize) {
        this.name = name;
        this.configuration = configuration;
        this.price = prize;
    }
     // Hàm khởi tạo biến name

    public void setName(String name) {
        this.name = name;
    }
     // Hàm trả về biến name

    public String getName() {
        return name;
    }
     // Hàm khởi tạo biến configuration

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }
     // Hàm trả về biến configuration

    public String getConfiguration() {
        return configuration;
    }
     // Hàm khởi tạo biến prize

    public void setPrize(int prize) {
        this.price = prize;
    }
     // Hàm trả về biến prize

    public int getPrize() {
        return price;
    }
    // In thông tin sản phẩm smartphone
    public void getInfo() {
        System.out.println("Sản phẩm: " + name);
        System.out.println("Cấu hình: " + configuration);
        System.out.println("Giá: " + price);
    }
}
