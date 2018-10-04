package Lab03_03.DoVat;

public class Table01 extends SanPham {

    /* a table
        @ name
        @ type :
        @ Size
        @ Id table
        @ producer
        @ weight
        
     */

    static String MAIN_UES = "It is used to support objects or objects " +
            "that users want to place on the table.";


    static int LEG = 4;     // table usualy has 4 leg
    public void setMainUes(String MAIN_UES){
        super.setMainUse(MAIN_UES);
    }
    public void setChan(int LEG){
        this.setChan(LEG);
    }


}
