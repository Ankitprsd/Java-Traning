package com.techment.demo;

public class StockChallenge {

	public static void main(String[] args) 
	{
		int a[] = new int[] {10,20,25,30,35,45,55,75};
		int max =a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		System.out.println("maximum quantities of product "+max);
		

	}

}
