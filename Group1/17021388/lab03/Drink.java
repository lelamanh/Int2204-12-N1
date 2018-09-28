

public class Drink {

    private String name_Drink ; // tên loại nước uống
    private String producer_Drink ; // nhà sản xuất
    private String price ; // giá
    private String taste; // vị
    // constructer có tham số
    public Drink(String name_Drink, String producer_Drink, String price, String taste) {
        this.name_Drink = name_Drink;
        this.producer_Drink = producer_Drink;
        this.price = price;
        this.taste = taste;
    }
     // ham trả về biến name


    public String getName_Drink() {
        return name_Drink;
    }
     // hàm khởi tạo biến name


    public void setName_Drink(String name_Drink) {
        this.name_Drink = name_Drink;
    }
     // hàm trả về biến nhà sx

    public String getProducer_Drink() {
        return producer_Drink;
    }


     //hàm khởi tạo biến nsx
    public void setProducer_Drink(String producer_Drink) {
        this.producer_Drink = producer_Drink;
    }
     //hàm trả về biến giá

    public String getPrice() {
        return price;
    }
     // hàm khởi tạo biến giá

    public void setPrice(String price) {
        this.price = price;
    }
     //hàm trả về biến mùi vị
     /
    public String getTaste() {
        return taste;
    }
     //@param taste

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public void getInfo(){
      System.out.println(name_Drink);
      System.out.println(producer_Drink);
      System.out.println(taste);
      System.out.println(price);
    }
    }
}
