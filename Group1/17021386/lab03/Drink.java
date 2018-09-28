package neon.com;

public class Drink {

    private String name_Drink ; // tên loại nước uống
    private String producer_Drink ; // nhà sản xuất
    private String price ; // giá
    private String taste; // vị

    // constructer không có tham số
    public Drink(){

    }


    // constructer có tham số
    public Drink(String name_Drink, String producer_Drink, String price, String taste) {
        this.name_Drink = name_Drink;
        this.producer_Drink = producer_Drink;
        this.price = price;
        this.taste = taste;
    }

    /**
     * ham trả về biến name
     * @return
     */
    public String getName_Drink() {
        return name_Drink;
    }

    /**
     * hàm khởi tạo biến name
     * @param name_Drink
     */

    public void setName_Drink(String name_Drink) {
        this.name_Drink = name_Drink;
    }

    /**
     * hàm trả về biến nhà sx
     * @return
     */

    public String getProducer_Drink() {
        return producer_Drink;
    }

    /**
     * hàm khởi tạo biến nsx
     * @param producer_Drink
     */
    public void setProducer_Drink(String producer_Drink) {
        this.producer_Drink = producer_Drink;
    }

    /**
     * hàm trả về biến giá
     * @return
     */
    public String getPrice() {
        return price;
    }

    /**
     * hàm khởi tạo biến giá
     * @param price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * hàm trả về biến mùi vị
     * @return
     */
    public String getTaste() {
        return taste;
    }

    /** hàm khởi tạo biến mùi vị
     *
     * @param taste
     */
    public void setTaste(String taste) {
        this.taste = taste;
    }

    public static void main (String[] args){
            Drink Coca = new Drink();
            Coca.setPrice("10000 nghìn đồng");
            System.out.println(Coca.getPrice());

    }
}
