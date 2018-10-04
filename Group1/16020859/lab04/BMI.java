
package lab4;

/**
 *
 * @author anhco
 */
public class BMI {
    public static String kiemtra(float kg , float m)
    {
         float BMI = kg/(m*m);
         if(BMI<18.5) return "Thiếu cân";
         else if (BMI<23) return "Bình thường";
         else if(BMI<25) return"Thừa cân";
         else return "Béo phì";
    }
}
