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
		MyIntegerTest int1 = new MyIntegerTest(3);
		boolean dActualInt = int1.isOdd();
		boolean dExpectInt = true;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isOddTest2() {
		MyIntegerTest int2 = new MyIntegerTest(4);
		boolean dActualInt = int2.isOdd();
		boolean dExpectInt = false;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isEvenTest() {
		MyIntegerTest int1 = new MyIntegerTest(46);
		boolean dActualInt = int1.isEven();
		boolean dExpectInt = true;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isEvenTest2() {
		MyIntegerTest int2 = new MyIntegerTest(213);
		boolean dActualInt = int2.isEven();
		boolean dExpectInt = false;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isPrimeTest() {
		MyIntegerTest int1 = new MyIntegerTest(41);
		boolean dActualInt = int1.isPrime();
		boolean dExpectInt = true;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isPrimeTest2() {
		MyIntegerTest int2 = new MyIntegerTest(52);
		boolean dActualInt = int2.isPrime();
		boolean dExpectInt = false;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isOddTest3() {
		MyIntegerTest int1 = new MyIntegerTest(5);
		int value = int1.getiValue();
		boolean dActualInt = MyIntegerTest.isOdd(value);
		boolean dExpectInt = true;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isOddTest4() {
		MyIntegerTest int2 = new MyIntegerTest(4);
		int value = int2.getiValue();
		boolean dActualInt = MyIntegerTest.isOdd(value);
		boolean dExpectInt = false;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isEvenTest3() {
		MyIntegerTest int1 = new MyIntegerTest(44);
		int value = int1.getiValue();
		boolean dActualInt = MyIntegerTest.isEven(value);
		boolean dExpectInt = true;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isEvenTest4() {
		MyIntegerTest int2 = new MyIntegerTest(253);
		int value = int2.getiValue();
		boolean dActualInt = MyIntegerTest.isEven(value);
		boolean dExpectInt = false;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isPrimeTest3() {
		MyIntegerTest int1 = new MyIntegerTest(11);
		int value = int1.getiValue();
		boolean dActualInt = MyIntegerTest.isPrime(value);
		boolean dExpectInt = true;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isPrimeTest4() {
		MyIntegerTest int2 = new MyIntegerTest(100);
		int value = int2.getiValue();
		boolean dActualInt = MyIntegerTest.isPrime(value);
		boolean dExpectInt = false;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isOddTest5() {
		MyIntegerTest int1 = new MyIntegerTest(27);
		boolean dActualInt = MyIntegerTest.isOdd(int1);
		boolean dExpectInt = true;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isOddTest6() {
		MyIntegerTest int2 = new MyIntegerTest(546);
		boolean dActualInt = MyIntegerTest.isOdd(int2);
		boolean dExpectInt = false;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isEvenTest5() {
		MyIntegerTest int1 = new MyIntegerTest(40);
		boolean dActualInt = MyIntegerTest.isEven(int1);
		boolean dExpectInt = true;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isEvenTest6() {
		MyIntegerTest int2 = new MyIntegerTest(123);
		boolean dActualInt = MyIntegerTest.isEven(int2);
		boolean dExpectInt = false;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isPrimeTest5() {
		MyIntegerTest int1 = new MyIntegerTest(59);
		boolean dActualInt = MyIntegerTest.isPrime(int1);
		boolean dExpectInt = true;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void isPrimeTest6() {
		MyIntegerTest int2 = new MyIntegerTest(12);
		boolean dActualInt = MyIntegerTest.isPrime(int2);
		boolean dExpectInt = false;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void equalsTest1() {
		MyIntegerTest int1 = new MyIntegerTest(3);
		boolean dActualInt = int1.equals(3);
		boolean dExpectInt = true;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void equalsTest2() {
		MyIntegerTest int1 = new MyIntegerTest(3);
		boolean dActualInt = int1.equals(54);
		boolean dExpectInt = false;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void equalsTest3() {
		MyIntegerTest int2 = new MyIntegerTest(12);
		MyIntegerTest int1 = new MyIntegerTest(12);
		boolean dActualInt = int2.equals(int1);
		boolean dExpectInt = true;
		assertEquals(dActualInt, dExpectInt);
	}

	@Test
	public void equalsTest4() {
		MyIntegerTest int2 = new MyIntegerTest(12);
		MyIntegerTest int3 = new MyIntegerTest(11);
		boolean dActualInt = int2.equals(int3);
		boolean dExpectInt = false;
		assertEquals(dActualInt, dExpectInt);
	}

}
