package com.learning.JavaBasic2;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		double num1 = obj1.nextDouble();
		if(num1 == 0 ) {
			System.out.println("Zero is neither positive nor negitive");
			}else if(num1 < 0){
				System.out.println("The number " + num1+" is negative " );
		}else {
			System.out.println("The number " + num1+" is postive " );
		}
	}

}
