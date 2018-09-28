package neon.com;

public class Clother {
    private String producer ; // nhà sản xuất
    private String clothers; // loại quần áo
    private Integer price ; // giá tiền
    private String clor ; // màu sắc

    /**
     * Constructer khoogn có tham so
     */
    public Clother() {
    }
    /**
     * Constructer có tham số đầy đủ
     */
    public Clother(String producer, String clothers, Integer price, String clor) {
        this.producer = producer;
        this.clothers = clothers;
        this.price = price;
        this.clor = clor;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getClothers() {
        return clothers;
    }

    public void setClothers(String clothers) {
        this.clothers = clothers;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getClor() {
        return clor;
    }

    public void setClor(String clor) {
        this.clor = clor;
    }
}
