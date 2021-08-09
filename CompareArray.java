package com.techment.demo;

import java.util.Arrays;
import java.util.Scanner;

public class CompareArray 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[15];
		int b[]=new int[15];
	
		System.out.println("Enter the elements of array 1");
		for(int i=0;i<a.length;i++)
			{
			a[i]=sc.nextInt();
			System.out.print(a[i]);
			}
		System.out.println();
		
		System.out.println("Enter the elements of array 2");
		for(int i=0;i<b.length;i++)
			{
			b[i]=sc.nextInt();
			System.out.print(b[i]);
			}
		if(Arrays.equals(a,b))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("Not Same");
		}

	}

}
