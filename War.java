package com.techment.demo;

import java.util.Scanner;

public class War {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int b,c;
		System.out.println("First soldier");
		b=sc.nextInt();
		System.out.println("Last soldier");
		c=sc.nextInt();
		for(int i=b;i<=c;i++)
		{
			System.out.println(i);
		}
		

	}

}
