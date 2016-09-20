package base;

//Thomas Pennington
//Practice Set 2 final

public class MyIntegerTest {

	private int iValue;

	public MyIntegerTest(int iValue) {

		this.iValue = iValue;

	}

	public int getiValue() {
		return iValue;
	}

	public boolean isEven() {
		if (iValue % 2 != 0) {
			return false;
		} else
			return true;
	}

	public boolean isOdd() {
		if (iValue % 2 != 1) {
			return false;
		} else
			return true;
	}

	public boolean isPrime() {

		boolean isPrimeNum = true;

		for (int b = 2; b < iValue; b++) {

			if (iValue % b == 0) {
				isPrimeNum = false;

			}
		}
		return isPrimeNum;

	}

	public static boolean isEven(int x) {
		if (x % 2 != 0) {
			return false;
		}
		return true;
	}

	public static boolean isOdd(int x) {
		if (x % 2 != 1) {
			return false;
		}
		return true;
	}

	public static boolean isPrime(int x) {
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static boolean isEven(MyIntegerTest myInt) {
		int k = myInt.getiValue();
		if (k % 2 != 0) {
			return false;
		} else
			return true;
	}

	public static boolean isOdd(MyIntegerTest myInt) {
		int r = myInt.getiValue();
		if (r % 2 != 1) {
			return false;
		} else
			return true;
	}

	public static boolean isPrime(MyIntegerTest myInt) {
		int s = myInt.getiValue();
		for (int i = 2; i < s; i++) {
			if (s % i == 0) {
				return false;
			}
		}
		return true;

	}
	
	public boolean equals(int z){
		if (z == iValue){
			return true;
		}else return false;
	}
	
	public boolean equals(MyIntegerTest myint){
		if(myint.getiValue() == getiValue()){
			return true;
		}else return false;
	}

}
