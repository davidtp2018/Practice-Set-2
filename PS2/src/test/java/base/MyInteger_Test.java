package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1 == 1);
	}

	@Test
	public void isOddTest() {
		MyInteger int1 = new MyInteger(3);
		boolean dActualInt = int1.isOdd();
		boolean dExpectInt = true;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isOddTest2() {
		MyInteger int2 = new MyInteger(4);
		boolean dActualInt = int2.isOdd();
		boolean dExpectInt = false;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isEvenTest() {
		MyInteger int1 = new MyInteger(46);
		boolean dActualInt = int1.isEven();
		boolean dExpectInt = true;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isEvenTest2() {
		MyInteger int2 = new MyInteger(213);
		boolean dActualInt = int2.isEven();
		boolean dExpectInt = false;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isPrimeTest() {
		MyInteger int1 = new MyInteger(41);
		boolean dActualInt = int1.isPrime();
		boolean dExpectInt = true;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isPrimeTest2() {
		MyInteger int2 = new MyInteger(52);
		boolean dActualInt = int2.isPrime();
		boolean dExpectInt = false;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isOddTest3() {
		MyInteger int1 = new MyInteger(5);
		int value = int1.getiValue();
		boolean dActualInt = MyInteger.isOdd(value);
		boolean dExpectInt = true;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isOddTest4() {
		MyInteger int2 = new MyInteger(4);
		int value = int2.getiValue();
		boolean dActualInt = MyInteger.isOdd(value);
		boolean dExpectInt = false;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isEvenTest3() {
		MyInteger int1 = new MyInteger(44);
		int value = int1.getiValue();
		boolean dActualInt = MyInteger.isEven(value);
		boolean dExpectInt = true;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isEvenTest4() {
		MyInteger int2 = new MyInteger(253);
		int value = int2.getiValue();
		boolean dActualInt = MyInteger.isEven(value);
		boolean dExpectInt = false;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isPrimeTest3() {
		MyInteger int1 = new MyInteger(11);
		int value = int1.getiValue();
		boolean dActualInt = MyInteger.isPrime(value);
		boolean dExpectInt = true;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isPrimeTest4() {
		MyInteger int2 = new MyInteger(100);
		int value = int2.getiValue();
		boolean dActualInt = MyInteger.isPrime(value);
		boolean dExpectInt = false;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isOddTest5() {
		MyInteger int1 = new MyInteger(27);
		boolean dActualInt = MyInteger.isOdd(int1);
		boolean dExpectInt = true;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isOddTest6() {
		MyInteger int2 = new MyInteger(546);
		boolean dActualInt = MyInteger.isOdd(int2);
		boolean dExpectInt = false;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isEvenTest5() {
		MyInteger int1 = new MyInteger(40);
		boolean dActualInt = MyInteger.isEven(int1);
		boolean dExpectInt = true;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isEvenTest6() {
		MyInteger int2 = new MyInteger(123);
		boolean dActualInt = MyInteger.isEven(int2);
		boolean dExpectInt = false;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isPrimeTest5() {
		MyInteger int1 = new MyInteger(59);
		boolean dActualInt = MyInteger.isPrime(int1);
		boolean dExpectInt = true;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isPrimeTest6() {
		MyInteger int2 = new MyInteger(12);
		boolean dActualInt = MyInteger.isPrime(int2);
		boolean dExpectInt = false;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void equalsTest1() {
		MyInteger int1 = new MyInteger(3);
		boolean dActualInt = int1.equals(3);
		boolean dExpectInt = true;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void equalsTest2() {
		MyInteger int1 = new MyInteger(3);
		boolean dActualInt = int1.equals(54);
		boolean dExpectInt = false;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void equalsTest3() {
		MyInteger int2 = new MyInteger(12);
		MyInteger int1 = new MyInteger(12);
		boolean dActualInt = int2.equals(int1);
		boolean dExpectInt = true;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void equalsTest4() {
		MyInteger int2 = new MyInteger(12);
		MyInteger int3 = new MyInteger(11);
		boolean dActualInt = int2.equals(int3);
		boolean dExpectInt = false;
		assertEquals(dActualInt, dExpectInt);
	}

}
