package com.learning.JavaBasics1;

public class VowelOrConsonant {
	

	public static void main(String[] args) {
		
		////Using if condition and OR operator
		char ch = '.';
		if(ch == 'a' || ch == 'e' || ch == 'i'  || ch == 'o' || ch == 'u' ) {
			System.out.println(ch + " : Is a vowel");
		}else {
			System.out.println(ch +"  is consonant");
		} 
		
		
	//Using Switch operator
		switch(ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch + " : is a vowel");
			break;
			
		default:
			System.out.println(ch + " is consonant");
			break;
		}
	}
	}


