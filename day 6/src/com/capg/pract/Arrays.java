package com.capg.pract;

public class Arrays {

	public static void array(int []arr) {
		
		for(int i: arr) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		int []a;		//declaration of array
		int[] ar;	//declaration of array
		int arr[];	//declaration of array
		
		arr = new int[3];  //instantiation of array
	
		// 0       1       2    this is a array of size 3
//		  1001	  1002	  1003
	
		arr[0]=12;
		arr[1]=45;
		arr[2]=23;
		
		int []a1 = new int[5];		//initialisation and instantiation  
	
		int []a2 = new int[] {2,4,6,5,7};		// declaration, initialisation and instantiation
		
//	for (int i = 0; i < a2.length; i++) {
//		System.out.println(a2[i]);
//	}
		
//		for(int i: a2) {						// advanced for loop  automatcally values are copied in i each time
//			System.out.println(i);
//		}
	
//		array(a2);
//		passing an array to the method
	}
}
