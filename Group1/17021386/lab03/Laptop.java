package neon.com;

public class Laptop {

        private String name; // Tên(mã) laptop
        private String configuration; // Cấu hình
        private int prize; // Giá

        /* Constructor không tham số lớp Laptop */
        Laptop() {

        }

        /* Constructor đầy đủ tham số lớp Laptop */
        Laptop(String name, String configuration, int prize) {
            this.name = name;
            this.configuration = configuration;
            this.prize = prize;
        }

        /**
         * Hàm khởi tạo biến name
         * @param name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * Hàm trả về biến name
         * @return name
         */
        public String getName() {
            return name;
        }

        /**
         * Hàm khởi tạo biến configuration
         * @param configuration
         */
        public void setConfiguration(String configuration) {
            this.configuration = configuration;
        }

        /**
         * Hàm trả về biến configuration
         * @return configuration
         */
        public String getConfiguration() {
            return configuration;
        }

        /**
         * Hàm khởi tạo biến prize
         * @param prize
         */
        public void setPrize(int prize) {
            this.prize = prize;
        }

        /**
         * Hàm trả về biến prize
         * @return prize
         */
        public int getPrize() {
            return prize;
        }

        /* In thông tin sản phẩm laptop */
        public void getInfo() {
            System.out.println("Sản phẩm: " + name);
            System.out.println("Cấu hình: " + configuration);
            System.out.println("Giá: " + prize);
        }
}
