package com.techment.demo;

import java.util.Scanner;

public class BirthMonth {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day of month");
		int month=sc.nextInt();
		sc.nextLine();
		for(int i=1;i<=12;i++)
		{
		switch(month)
		{
			
			case 1: System.out.println("Month : JANUARY");
			        break;
			case 2: System.out.println("Month : FEBRUARY");
	                break;
			case 3: System.out.println("Month : MARCH");
	                break;
			case 4: System.out.println("Month : APRIL");
	                break;
			case 5: System.out.println("Month : MAY");
	                break;
			case 6: System.out.println("Month : JUNE");
	                break;
			case 7: System.out.println("Month : JULY");
	                break;
			case 8: System.out.println("Month : AUGUST");
	                break;
			case 9: System.out.println("Month : SEPTEMBER - MY BIRTHDAY IS IN THIS MONTH");
	                break;
			case 10: System.out.println("Month : OCTOBER");
	                break;
			case 11: System.out.println("Month : NOVEMBER");
	                break;
			case 12: System.out.println("Month : DECEMBER");
	                break;
	        default: System.out.println("inavlid month");        
		}
		}
	}

}
