package com.techment.demo;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		int a=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n terms");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int s=a*a*a;
			System.out.print(s + " ");
			a++;
		}

	}

}
