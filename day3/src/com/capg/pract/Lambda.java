package com.capg.pract;

import java.util.*;
interface Multi{
	void mul(int a, int b);
}

interface Div{
	void div(int a, int b);
}

interface Sub{
	void sub(int a, int b);
}

interface extra extends Sub{
	@Override
	void sub(int a,int b);
}

public class Lambda {
	
	public static void main(String[] args)
	{
		Multi c = (int a, int b) ->{		//creating a refrence variable c
			System.out.println(a*b);
		};
		
		Div d = (int a, int b) ->{			//creating a refrence variable d
			System.out.println(a/b);
		};
		
		extra e = (int a, int b) ->{			//creating a refrence variable e
			System.out.println(a-b);
		};
		
		System.out.println("Input 2 values:");
		Scanner sc = new Scanner(System.in);
		int[] array = new int[2];
		for(int i=0;i<2;i++)
		{
			array[i]=sc.nextInt();
		}
		
		
		
		int choice;
		System.out.println("1. *,\n2. /\n3. -");
		choice= sc.nextInt();
		
		switch(choice) {
		case 1: c.mul(array[0],array[1]);
				break;
		case 2:	d.div(array[0],array[1]); 
				break;
		case 3: e.sub(array[0],array[1]);
			break;
		default: System.out.println("wrong Input");
		}
		
		
	}

}
