package com.capg.pract;

import java.lang.reflect.Method;

public class VarArgs {
	
	public static void display(int b, String... val) {
		System.out.println("Displaying");
//		System.out.println(b + " " + val);
		System.out.println(b);
		for(String i: val) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
//		VarArgs a = new VarArgs();
		display(3,"rohit", "aman","naman");
		
	} 
}
