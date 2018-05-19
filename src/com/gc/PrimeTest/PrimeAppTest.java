package com.gc.PrimeTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gc.PrimeApp.PrimeNum;

class PrimeAppTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	
	//actual value 1 should return expected value 2
		@Test
		void test1() {
			long expected = 2;
			long actual = PrimeNum.numPrime(1);
			
			assertEquals(expected, actual);
		}
		
		//actual value 2 should return expected value 3
		@Test
		void test2() {
			long expected = 3;
			long actual = PrimeNum.numPrime(2);
			
			assertEquals(expected, actual);
		}
		
		//actual value 5 should return expected value 11
		@Test
		void test3() {
			long expected = 11;
			long actual = PrimeNum.numPrime(5);
			
			assertEquals(expected, actual);
		}
		
		//actual value 100 should return expected value 541
		@Test
		void test4() {
			long expected = 541;
			long actual = PrimeNum.numPrime(100);
			
			assertEquals(expected, actual);
		}
		
		//actual value 9999 should return expected value 104723
		@Test
		void test5() {
			long expected = 104723;
			long actual = PrimeNum.numPrime(9999);
			
			assertEquals(expected, actual);
		}

}
