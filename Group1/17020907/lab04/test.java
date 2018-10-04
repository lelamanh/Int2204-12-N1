package lab4;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {


	// Test max() function
	@Test
	public void testMax1() {
		assertEquals(5, Main.max(5, 2));
	}
	@Test
	public void testMax2() {
		assertEquals(5, Main.max(5, 0));
	}
	@Test
	public void testMax3() {
		assertEquals(7, Main.max(7, 2));
	}
	@Test
	public void testMax4() {
		assertEquals(2, Main.max(-5, 2));
	}
	@Test
	public void testMax5() {
		assertEquals(-2, Main.max(-9, -2));
	}
	
	
	@Test
	// Test minArr()
	public void testMinArr1() {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		assertEquals(1, Main.minArr(arr1));
	}
	@Test
	public void testMinArr2() {
		int[] arr2 = { 0, 2, 3, -4, 5 };
		assertEquals(-4, Main.minArr(arr2));
	}
	@Test
	public void testMinArr3() {
		int[] arr3 = { -1, -2, -3, -4, -5 };
		assertEquals(-5, Main.minArr(arr3));
	}
	@Test
	public void testMinArr4() {
		int[] arr4 = { 1, 2, -3, 4, 5 };
		assertEquals(-3, Main.minArr(arr4));
	}
	@Test
	public void testMinArr5() {
		int[] arr5 = { 1, 2, -3, 0, -5 };
		assertEquals(-5, Main.minArr(arr5));
	}

	
	@Test
	// Test BMI function
	public void BMI_1() {
		assertEquals("Bình thường", Main.BMI(55, 1.7));
	}
	@Test
	public void BMI_2() {
		assertEquals("Thừa cân", Main.BMI(65, 1.7));
	}
	@Test
	public void BMI_3() {
		assertEquals("Béo phì", Main.BMI(95, 1.7));
	}
	@Test
	public void BMI_4() {
		assertEquals("Thiếu cân", Main.BMI(45, 1.72));
	}
	@Test
	public void BMI_5() {
		assertEquals("", Main.BMI(55, -1.7));
	}
	@Test
	public void BMI_6() {
		assertEquals("", Main.BMI(-56, 1.5));
	}
}
