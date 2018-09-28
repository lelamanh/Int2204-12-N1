

public class Clother {
    private String producer ; // nhà sản xuất
    private String clothers; // loại quần áo
    private Integer price ; // giá tiền
    private String clor ; // màu sắc

     // Constructer có tham số đầy đủ

    public Clother(String producer, String clothers, Integer price, String clor) {
        this.producer = producer;
        this.clothers = clothers;
        this.price = price;
        this.clor = clor;
    }
    // Trả về producer
    public String getProducer() {
        return producer;
    }
    // khởi tạo producer
    public void setProducer(String producer) {
        this.producer = producer;
    }
    // trả về clothers
    public String getClothers() {
        return clothers;
    }
    //khởi tạo clothers
    public void setClothers(String clothers) {
        this.clothers = clothers;
    }
    // trả về price
    public Integer getPrice() {
        return price;
    }
    //khởi tạo price
    public void setPrice(Integer price) {
        this.price = price;
    }
    // trả về clor
    public String getClor() {
        return clor;
    }
    // khoeir tạo clor
    public void setClor(String clor) {
        this.clor = clor;
    }
}
