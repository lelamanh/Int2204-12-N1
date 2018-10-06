
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

    
class NewEmptyJUnitTest1{
  public static int BigGest(int x, int y){
    return x > y ? x:y;
  }
  public static int SmalLest (int[] x){
    int min = x[0];
    for (int i = 1 ; i < x.length; i ++){
      if (x[i] <= x[0]){
        min = x[i]; 
      }
    }
    return min;
  }
  public static String Bmi(double x, double y){
      String result;
    double bmi = (double) x / (y * y);
    if (bmi < 18.5){
        result = "Thieu Can";
    }
    else if (bmi >= 18.5 && bmi <= 23 ){
      result = "Binh Thuong";
    }
    else if (bmi >= 23 && bmi < 24.99) {
      result = "Thua Can";
    }
    else {
      result = "Beo Phi";
    }
    return result;
  
 }
}
public class NewEmptyJUnitTest {
   @Test
    public void TestBigGest1(){
   
    assertEquals(5,NewEmptyJUnitTest1.BigGest(5,4));
  }
  @Test
  public void TestBigGest2(){
   assertEquals(4,NewEmptyJUnitTest1.BigGest(4,1));
  }
  @Test
  public void TestBigGest3(){
  assertEquals(8,NewEmptyJUnitTest1.BigGest(5,8));
  }
  @Test
  public void TestBigGest4(){
     assertEquals(4,NewEmptyJUnitTest1.BigGest(1,4));
  }
  @Test
  public void TestBigGest5(){
    assertEquals(9,NewEmptyJUnitTest1.BigGest(3,9));
  }
  @Test
  public void TestSmalLest1(){
 
    assertEquals(2,NewEmptyJUnitTest1.SmalLest(new int[]{2,3,4}));
    }
  @Test
  public void TestSmalLest2(){
    assertEquals(2, NewEmptyJUnitTest1.SmalLest(new int[]{2,5,4}));
    }
  @Test
  public void TestSmalLest3(){
    assertEquals(1, NewEmptyJUnitTest1.SmalLest(new int[]{1,3,4}));
    }
  @Test
  public void TestSmalLest4(){
    assertEquals(4, NewEmptyJUnitTest1.SmalLest(new int[]{7,9,4}));
    }
  @Test
  public void TestSmalLest5(){
    
    assertEquals(4,NewEmptyJUnitTest1.SmalLest(new int[]{4,6,9}));
    } 
  @Test
  public void TestBmi1(){
    assertEquals("Thieu Can",NewEmptyJUnitTest1.Bmi(38.3,1.7));
  }
  @Test
  public void TestBmi2(){
    assertEquals("Thieu Can",NewEmptyJUnitTest1.Bmi(40,1.72));
  }
  @Test
  public void TestBmi3(){

    assertEquals("Binh Thuong",NewEmptyJUnitTest1.Bmi(60.3,1.8));
  }
  @Test
  public void TestBmi4(){
  
    assertEquals("Thua Can",NewEmptyJUnitTest1.Bmi(65,1.63));
  }
  @Test
  public void TestBmi5(){
    
    assertEquals("Beo Phi",NewEmptyJUnitTest1.Bmi(70,1.65));
  }
 }
