package Bai3;

public class School {
    private String address;     // địa chỉ của trường
    private String name;        // tên trường

    public School() {           // tạo đối tượng trường rỗng
    }

    public School(String address, String name) {        // tạo dối tượng trường với các thông tin là tham số truyền vào
        this.address = address;
        this.name = name;
    }

    public String getAddress() {        // lấy địa chỉ
        return address;
    }

    public void setAddress(String address) {    // đặt lại địa chỉ
        this.address = address;
    }

    public String getName() {           // lấy tên trường
        return name;
    }

    public void setName(String name) {      // dặt lại tên
        this.name = name;
    }
}
