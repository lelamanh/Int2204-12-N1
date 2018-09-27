package Lab03_03.DoVat;

public class Pen03 extends SanPham {


    class Other{
        String ballpoint;
        // ball pen

        String rollerball;
        // rollerball of pen

        String fountain;
        // fountain of pen

        String gel;
        // gel of pen : color : black, read, blue, ...

        public String getBallpoint() {
            return ballpoint;
        }

        public void setBallpoint(String ballpoint) {
            this.ballpoint = ballpoint;
        }

        public String getRollerball() {
            return rollerball;
        }

        public void setRollerball(String rollerball) {
            this.rollerball = rollerball;
        }

        public String getFountain() {
            return fountain;
        }

        public void setFountain(String fountain) {
            this.fountain = fountain;
        }

        public String getGel() {
            return gel;
        }

        public void setGel(String gel) {
            this.gel = gel;
        }
    }

    static String MAIN_USE =
            "A pen is a common writing instrument used to apply ink to a surface, " +
            "usually paper, for writing or drawing";

    public void setMainUse(String MAIN_USE){
        super.setMainUse(MAIN_USE);
    }



}
