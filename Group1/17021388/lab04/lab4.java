/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
 
/**
 *
 * @author CCNE
 */
class lab4{
  public int SoSanh(int a, int b){
     int c = a - b;
    if (c > 0 ){return a;}
    else return b;
  }
  public int FindMin (int[] a){
    int min = a[0];
    for (int i = 1 ; i < a.length; i++){
      if (a[i] <= a[0]){
        min = a[i]; 
      }
    }
    return min;
  }
  public String Bmi(double a, double b){
      String result;
    double bmi = (double) a / (b * b);
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
public class lab4Test {
    @Test
  public void TestSoSanh1(){
    lab4 test1 = new lab4();
    assertEquals(5,test1.SoSanh(5,4));
  }
    @Test
  public void TestSoSanh2(){
    lab4 test1 = new lab4();
    assertEquals(4,test1.SoSanh(4,1));
  }
    @Test
  public void TestSoSanh3(){
    lab4 test1 = new lab4();
    assertEquals(8,test1.SoSanh(5,8));
  }
    @Test
  public void TestSoSanh4(){
    lab4 test1 = new lab4();
    assertEquals(4,test1.SoSanh(1,4));
  }
  @Test
  public void TestSoSanh5(){
    lab4 test1 = new lab4();
    assertEquals(9,test1.SoSanh(3,9));
  }
  @Test
  public void TestFindMin1(){
    lab4 test2 = new lab4();
    assertEquals(2, test2.FindMin(new int[]{2,3,4}));
    }
  @Test
  public void TestFindMin2(){
    lab4 test2 = new lab4();
    assertEquals(2, test2.FindMin(new int[]{2,5,4}));
    }
  @Test
  public void TestFindMin3(){
    lab4 test2 = new lab4();
    assertEquals(1, test2.FindMin(new int[]{1,3,4}));
    }
  @Test
  public void TestFindMin4(){
    lab4 test2 = new lab4();
    assertEquals(4, test2.FindMin(new int[]{7,8,4}));
    }
  @Test
  public void TestFindMin5(){
    lab4 test2 = new lab4();
    assertEquals(4, test2.FindMin(new int[]{4,6,9}));
    } 
  @Test
 public void TestBmi1(){
   lab4 test3 = new lab4();
   assertEquals("Thieu Can",test3.Bmi(38.3,1.7));
  }
  @Test
  public void TestBmi2(){
    lab4 test3 = new lab4();
    assertEquals("Thieu Can",test3.Bmi(40,1.72));
  }
 @Test
  public void TestBmi3(){
    lab4 test3 = new lab4();
    assertEquals("Binh Thuong",test3.Bmi(60.3,1.8));
  }
  @Test
  public void TestBmi4(){
    lab4 test3 = new lab4();
    assertEquals("Thua Can",test3.Bmi(65,1.63));
  }
  @Test
  public void TestBmi5(){
    lab4 test3 = new lab4();
    assertEquals("Beo Phi",test3.Bmi(70,1.65));
  }
}