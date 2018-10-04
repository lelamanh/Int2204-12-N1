/*
    class BMI
 */

public class BMI {

    /*
        method findBMI
        @param high doubble
        @param weight

        return string answer
     */
    public static String findBMI(double high, double weight){

        double BIM = high / (weight * weight);

        if(BIM < 18.5){
            return "Thieu can";
        }else {
            if (BIM < 22.99) {
                return "Binh thuong";
            } else {
                if (BIM < 25) {
                    return "Thua can";
                } else {
                    if (BIM > 25) {
                        return "Beo phi";
                    }

                }
            }
        }
        return "Expetion";

    }
}
