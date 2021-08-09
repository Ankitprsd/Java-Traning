package com.techment.demo;

import java.util.Scanner;

public class Calci {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		char operator;
		System.out.println("Enter A:");
		a=sc.nextInt();
		System.out.println("Enter Operator(+,-,*,/)");
		operator=sc.next().charAt(0);
		System.out.println("Enter B:");
		b=sc.nextInt();
		
		double addition = a+b;
		double subtraction = a-b;
		double multiplication = a*b;
		double division = a/b;
		
		switch(operator)
		{
		case '+' :
			System.out.println("Total after addition is :"+addition);
			break;
		case '-' :
			System.out.println("Total after subtraction is :"+subtraction);
			break;
		case '*' :
			System.out.println("Total after multiplication is :"+multiplication);
			break;	
		case '/' :
			System.out.println("Total after dividsion is :"+division);
			break;
		default :
			System.out.println("please select proper operator");
			break;
		}

	}

}
