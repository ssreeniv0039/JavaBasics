package com.learning.JavaBasics3;



public class PowerOfANumber {

	public static void main(String[] args) {
		// 3^2 = 3*3 = 9
		//3 = base and 2 = exponent
		int base = 2;
		int exponent = 4;
	
		int result = 1;
		while(exponent != 0 ) {
			result = result * base;
			--exponent;
		}System.out.println(result);
		
		//Using Math.pow
		//System.out.println(Math.pow(base, exponent));

}
}