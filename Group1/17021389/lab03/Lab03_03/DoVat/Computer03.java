package Lab03_03.DoVat;

import Lab03_03.DoVat.SanPham;

public class Computer03 extends SanPham {
    class Difeerent{
        String chip;
        // Chip of computer
        String ram;
        // Ram of computer
        String cpu;
        // Central Processing Unit of computer
        String gpu;
        // Graphics Processing Unit of computer
        String mainBoard;
        // mainBoard of computer


        /* Setter getter for feature of computer */

        public String getChip() {
            return chip;
        }

        public void setChip(String chip) {
            this.chip = chip;
        }

        public String getRam() {
            return ram;
        }

        public void setRam(String ram) {
            this.ram = ram;
        }

        public String getCpu() {
            return cpu;
        }

        public void setCpu(String cpu) {
            this.cpu = cpu;
        }

        public String getGpu() {
            return gpu;
        }

        public void setGpu(String gpu) {
            this.gpu = gpu;
        }

        public String getMain() {
            return mainBoard;
        }

        public void setMain(String mainBoard) {
            this.mainBoard = mainBoard;
        }


    }

    // computer no-leg

    static String MAIN_USE = "Computing, Work, Entertainment, Other";

    public void setMainUse(String MAIN_USE){
    this.mainUse = MAIN_USE;
    }
}
