 package com.learning.JavaBasics4;

public class FactorialRecursive {

	public static void main(String[] args) {
		int res = factorialRecursive(0);
		System.out.println(res);
	} 
	
	public static int factorialRecursive(int num) {
		if(num == 0)
			return 1;
		else
			return (num * factorialRecursive(num-1));
	}
}
