package com.techment.demo;

import java.util.Scanner;

public class BestHorse {

	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the horse number");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a==b) {
			System.out.println("Entered weights of A and B are not distinct values");
		}
		else if(b==c)
		{
			System.out.println("Entered weights of B and C are not distinct values");
		}
		else if(c==a)
		{
			System.out.println("Entered weights of C and A are not distinct values");
		}
		
		if(a>b && a>c)
		{
			System.out.println("weight of horse A is maximum");
		}
		if(b>a && b>c)
		{
			System.out.println("weight of horse B is maximum");
		}
		if(c>a && c>b)
		{
			System.out.println("weight of horse C is maximum");
		}

	}

}
