package com.learning.JavaBasics1;

public class LeapYear {

	public static void main(String[] args) {
		
		//leap year => is divisible by 4 for all century years ---> ending with 00
		
		//Century year is a leap year only when it is divisible by 400
		
		//1900 is not a leap year ---> not divisible by 4
		//2012 is a leap year --> divisible by 4
		
		int year = 2020;
		boolean leap = false;
		
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 ==0) {
					leap = true;
				}else {
					leap = false;
				}
			}else {
				leap = true;
			}
		}else {
			leap = false;
		}
		 if(leap) {
			 System.out.println(year + " is a leap year");
		 }else {
			 System.out.println(year + " is not a leap year");
		 }

	}

}
