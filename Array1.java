package com.techment.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) 
	{
		System.out.println("HOw many marks do you want to enter");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[5];
	
		System.out.println("Enter the elements of array");
		for(int i=0;i<a.length;i++)
			{
			a[i]=sc.nextInt();
			System.out.println(a[i]);
			}
		int sum = 0;
		for(int i=0;i<a.length;i++) 
		{
			sum=sum+a[i];
			
		}
		System.out.println("sum of all the elements:"+ sum);
		int large,small;
		large=small=0;
		for(int i=0;i<a.length;i++)
		{
		
			if(a[i]>large)
			{
				large=a[i];
				
			}
			else if(a[i]<small)
			{
				small=a[i];
				
			}

	    }
		System.out.println("The highest mark is:"+ large);
		System.out.println("The smallest mark is:"+ small);
		Arrays.sort(a);
		System.out.println("Second highest mark is:"+ a[a.length-2]);
		
		for(int i=0;i<n;i++)
		{
			if(a[i]>40)
			{
				System.out.println("student passed !");
			}
			else
			{
				System.out.println("student is not successful");
			}
		}
	
		

	}}
