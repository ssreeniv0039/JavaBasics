package com.learning.JavaBasics3;

public class AmstrongNumber {

	public static void main(String[] args) {
		//153 = 1*1*1 + 5*5*5 +3*3*3 = 1+125+27 =153
		//371
		int num = 153;
		double actualNumber =num;
		double res = 0;
		while(num> 0) {
			int n = num % 10;
			res = res + Math.pow(n, 3);
			num = num/10;
				}System.out.println(res);
				
			if(res == actualNumber) {
				System.out.println("Amstrong number");
			}else {
				System.out.println("Not an amstrong number");	
			}
			
		}

	}


