package com.techment.demo;

import java.util.Scanner;

public class EvenOddRule {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day of month");
		int day=sc.nextInt();
		for(int i=1;i<=31;i++)
		{
			if(day%2==0)
			{
				System.out.println("cars with even registration numbers are permitted today");
				
			}
			else
			{
				System.out.println("cas with odd registration numbers are permitted today");
			}
		}

	}

}
