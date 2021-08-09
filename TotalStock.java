package com.techment.demo;

public class TotalStock {

	public static void main(String[] args) 
	{
		int a[]=new int[] {1,5,10,15,20,25,30,35,5,5,5,10,15,50};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of the elements are :" +sum);

	}

}
