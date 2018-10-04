package neon.com;

public class House {
    private String location ;
    private  Integer price ;
    private Integer floor;
    private Integer number_human;
    //Constructer không có them số
    public House (){

    }
    // constructer đầy đủ tham số
    public House(String location, Integer price, Integer floor, Integer number_human) {
        this.location = location;
        this.price = price;
        this.floor = floor;
        this.number_human = number_human;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getNumber_human() {
        return number_human;
    }

    public void setNumber_human(Integer number_human) {
        this.number_human = number_human;
    }
}
