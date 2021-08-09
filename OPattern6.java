package com.techment.demo;
import java.util.Scanner;

public class OPattern6 {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int row=sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=row;j++)
			{       
                
                if(i==j)
				    System.out.print("* ");
                else
                	System.out.print("  ");
                
			}
                
			System.out.println("");
		}

	}

}
