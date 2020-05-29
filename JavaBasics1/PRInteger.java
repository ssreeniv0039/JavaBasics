package com.learning.JavaBasics1;

import java.util.Scanner;

public class PRInteger {

	public static void main(String[] args) {
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter the Input : ");
		
		try {
			int input = obj1.nextInt();
			System.out.println("The user entered input is :"+ input);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
