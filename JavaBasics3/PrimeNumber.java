package com.learning.JavaBasics3;

public class PrimeNumber {

	public static void main(String[] args) {
		 int num = 0;
		 boolean flag = false;
		
		 for(int i = 2; i<= num/2 ; i++) {
			 if(num % i == 0){
				 flag = true;
				 break;
			 } 
		 }
		 if(!flag && num != 0 && num != 1) {
			 System.out.println(num +" is a prime number");
		 }else {
			 System.out.println( num +" is not a prime number");
		 }

	}

}
