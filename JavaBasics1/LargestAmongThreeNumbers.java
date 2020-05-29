package com.learning.JavaBasics1;

public class LargestAmongThreeNumbers {

	public static void main(String[] args) {
		/*
		int arr[] = {10,2,3,0,45,50};
		int n = arr.length;
		for(int i = 0; i<n;i++) {
			for(int j = i+ 1; j<n;j++ ) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("The largest element in the array is : "+ arr[n-1]);*/
		
		int x= 100;
		int y = 200;
		int z = 300;
		// Easy to understand 
		if(x >= y && x >= z) {
			System.out.println("x is the largest element"+ x);
		}
		else if(y >= x && y >= z ) {
			System.out.println(" y  is the largest number "+ y);
		}
		else {
			System.out.println("Z is the largest number : "+z);
		}
	
		// Best Practice
		if(x>= y) {
			if(x>= z) {
				System.out.println("x is the largest element"+ x);
			}else {
				System.out.println("z is the largest number "+ z);
			}
		}else {
			if(y>= z) {
				System.out.println("y is the largest number " + y);
			}else {
				System.out.println("z is the largest number "+ z);
			}
		}
	}

}
	
