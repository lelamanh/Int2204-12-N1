
public class House {
    private String location ;
    private  Integer price ;
    private Integer floor;
    private Integer number_human;

    // constructer đầy đủ tham số
    public House(String location, Integer price, Integer floor, Integer number_human) {
        this.location = location;
        this.price = price;
        this.floor = floor;
        this.number_human = number_human;
    }
   // Hàm lấy location
    public String getLocation() {
        return location;
    }
   // Hàm khởi tạo location
    public void setLocation(String location) {
        this.location = location;
    }
   // Hàm lấy price
    public Integer getPrice() {
        return price;
    }
 // Hàm khởi taoj price
    public void setPrice(Integer price) {
        this.price = price;
    }
// làm lấy Floor
    public Integer getFloor() {
        return floor;
    }
//Hàm khởi tạo floor
    public void setFloor(Integer floor) {
        this.floor = floor;
    }
//Hàm lấy number_human
    public Integer getNumber_human() {
        return number_human;
    }
// Hàm Khởi tạo number_human
    public void setNumber_human(Integer number_human) {
        this.number_human = number_human;
    }
}
