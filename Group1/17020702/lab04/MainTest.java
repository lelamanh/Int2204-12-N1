package Test;
import static org.junit.Assert.*;

import org.junit.Test;
import demoTuan04.Main;
public class MainTest {
// Test FindMax
	@Test
	public void testFindMax1() {
		assertEquals(Main.findMax(2,0),2);
    }
	@Test
	public void testFindMax2()
	{assertEquals(Main.findMax(3,3),3);}
	@Test
	public void testFindMax3()
	{
		assertEquals(Main.findMax(-20,3),3);
	}
	@Test
	public void testFindMax4()
	{
		assertEquals(Main.findMax(-5,-2),-2);
	}
	@Test
	public void testFindMax5()
	{
		 assertEquals(Main.findMax(184,258),258);
	}
	//Test FindMin
	@Test
	public void testFindMin1() {
		int a[] = {1,3,4};
	   assertEquals(Main.findMin(a),1);
	}
	@Test
	public void testFindMin2() 
	{ int b[] = {-25,3,-89,12};
	assertEquals(Main.findMin(b),-89);
	}
	@Test
	public void testFindMin3()
	{ int c[] = {-89,-1999,252,365};
	assertEquals(Main.findMin(c),-1999);
	}
	@Test
	public void testFindMin4()
	{int d[] = {259,368,252,189};
	assertEquals(Main.findMin(d),189);
	}
	@Test
	public void testFindMin5() 
	{int e[] = {123,356,987,-8};
	assertEquals(Main.findMin(e),-8);
	}
	//Test BMI
	@Test
	public void testBMI1() {
		assertEquals(Main.BMI(50.36624,1.65),"Thieu can");   
       
	}
	@Test
	public void testBMI2() 
	{assertEquals(Main.BMI(50.36625,1.65),"Binh thuong"); 
	}
	@Test
	public void testBMI3()
	{    assertEquals(Main.BMI(0,1.65),"Du lieu nhap vao khong dung");   

	}
	@Test
	public void testBMI4() 
	{assertEquals(Main.BMI(74.52,1.8),"Thua can");  
	}
	
@Test
	public void testBMI5() 
	{assertEquals(Main.BMI(68.03555,1.65),"Beo phi");   //BMI 24.9901
}
}
