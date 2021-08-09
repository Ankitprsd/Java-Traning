package com.techment.demo;
import java.util.Scanner;

public class PatternQ11 {

	public static void main(String[] args) 
	{
		int i, m = 0, flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num  ");
		int num = sc.nextInt();
	   
		if(num==0 || num==1) {
	    System.out.print(num+"not prime no");
		}
		else
		{
			for (i=2;i<=m;i++) {
				if(num%i==0) {
					   System.out.print(num+"not prime no");
					
					   flag = 1;
					   break;
				}
			}
			if (flag==0){  System.out.print(num+"prime no");}
		}
	 
	}

	}


