import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BMITest {


    /*
        five methods to check methods findBMI in class BMI
     */
    @Test
    public void findBMI1() {

        try {
            assertEquals("Thieu can", BMI.findBMI(40,1.5 ));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    @Test
    public void findBMI2() {

        try {
            assertEquals("Binh thuong", BMI.findBMI(55,1.63 ));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    @Test
    public void findBMI3() {

        try {
            assertEquals("Thua can", BMI.findBMI(66, 1.67 ));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    @Test
    public void findBMI4() {

        try {
            assertEquals("Thua can", BMI.findBMI(71,1.7 ));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    @Test
    public void findBMI5() {

        try {
            assertEquals("Beo phi", BMI.findBMI(80, 1.73 ));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


}