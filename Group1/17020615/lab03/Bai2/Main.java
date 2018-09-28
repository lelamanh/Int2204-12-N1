package Bai2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        PS a = null;
        PS b = null;

        try {
            a = new PS(-2, 3);
            b = new PS(2, -3);
        } catch (IOException e) {
            e.printStackTrace();
        }

        PS tong = new PS(a.cong(b));
        tong.print();
        tong.print_RG();

        PS hieu = new PS(b.tru(a));
        hieu.print();
        hieu.print_RG();

        PS tich = new PS(a.nhan(b));
        tich.print();
        tich.print_RG();

        PS thuong = new PS(a.chia(b));
        thuong.print();
        thuong.print_RG();

        System.out.println(a.equals(b));

    }
}
