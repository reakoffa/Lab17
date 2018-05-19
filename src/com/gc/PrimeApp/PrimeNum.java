package com.gc.PrimeApp;

public class PrimeNum {

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	private int num;

	public PrimeNum(int num) {
		this.num = num;
	}

	public static long numPrime(int num) {
		int counter = 0;
		long i;
		for (i = 2; i <= Long.MAX_VALUE / 2; i++) {
			if (PrimeNum.isPrime(i)) {
				counter++;
			}
			if (counter == num) {
				break;
			}
		}
		return i;
	}

	private static boolean isPrime(long num) {
		if (num < 2)
			return false;
		if (num == 2)
			return true;
		if (num % 2 == 0)
			return false;
		for (int i = 3; i * i <= num; i += 2)
			if (num % i == 0)
				return false;
		return true;
	}

}
