package com.capg.practice;

import java.util.Scanner;

public class TypeCast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value:");
		int a = sc.nextInt();
		float b = (float)a;
		System.out.println(b);
//	sc.close();
	}
}
