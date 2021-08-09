package com.techment.demo;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number to calculate sum of the digits");
		int number=sc.nextInt();
		int digit,sum=0;
		while(number>0)
		{
			digit=number % 10;
			number=number / 10;
			sum=sum + digit;
		}
		System.out.println("exit door number of thre glasshouse"+sum);
	}

}
