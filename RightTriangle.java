package com.techment.demo;

import java.util.Scanner;

public class RightTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      int a = sc.nextInt();
	      int b = sc.nextInt();
	      int c = sc.nextInt();
	      
	      if(a+b+c==180)
	      {
	    	System.out.println("it is avalid traiangle");  
	      }
	      else if(a<90 && b<90 && a<90)
	      {
	    	  System.out.println("it is an acute angled triangle");
	      }
	      else if(a>90 && b>90 && a>90)
	      {
	    	  System.out.println("it is an obtuse angled triangle");
	      }
	      else
	      {
	    	  System.out.println("it is right  angled triangle"); 
	      }

	}

}
