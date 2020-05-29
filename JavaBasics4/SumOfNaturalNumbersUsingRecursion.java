package com.learning.JavaBasics4;

public class SumOfNaturalNumbersUsingRecursion {

	public static void main(String[] args) {
		int num = 5;
		int sum = sumOfNaturalNumbersRec(num);
		System.out.println(sum);

	}
	
	public static int sumOfNaturalNumbersRec(int num) {
		if(num != 0) {
			return (num + sumOfNaturalNumbersRec(num -1));
		}else {
			return num;
		}
	}
}
