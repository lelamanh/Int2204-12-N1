package Bai3;

public class Computer {
    private String CPU;           // tên vi xử lý
    private String VGA;           // tên card đồ hoạ
    private int RAM;              // dung lượng RAM

    public Computer() {           // tạo ra đối tượng rỗng
    }

    public Computer(String CPU, String VGA, int RAM) {          // tạo ra đối tượng với tham số truyền vào
        this.CPU = CPU;
        this.VGA = VGA;
        this.RAM = RAM;
    }

    public String getCPU() {      // đặt tên vi xử lý
        return CPU;
    }

    public void setCPU(String CPU) {    // lấy tên CPU
        this.CPU = CPU;
    }

    public String getVGA() {      // đặt tên card đồ hoạ
        return VGA;
    }

    public void setVGA(String VGA) {    // đặt tên card đồ hoạ
        this.VGA = VGA;
    }

    public int getRAM() {          // lấy dung lượng RAM
        return RAM;
    }

    public void setRAM(int RAM) {    // đặt dung lượng RAM
        this.RAM = RAM;
    }
}
