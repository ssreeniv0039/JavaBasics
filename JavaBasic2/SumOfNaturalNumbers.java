package com.learning.JavaBasic2;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
	
		int n = 100;
		int result = 0;
		int sum = 0;
		for(int i = 0;i<=n;i++) {
				result = i + result;
			}System.out.println(result);
			
			System.out.println("==========");
			
			//Using while loop
			int j = 0;
			while(j<=n) {
				 sum = sum +j;
				 j++;
			}System.out.println(sum);
	}

	}


