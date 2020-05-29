package com.learning.JavaBasics3;

public class FactorsOfANumber {

	public static void main(String[] args) {
		//Factors of a number
		//10 = 1 2 5 10
		//30 = 1 2 3 5 6 10 15 30
		int num = 10 ;
		for(int i = 1;i <= num ; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
