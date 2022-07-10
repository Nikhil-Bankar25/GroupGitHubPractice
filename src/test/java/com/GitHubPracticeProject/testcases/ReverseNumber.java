package com.GitHubPracticeProject.testcases;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no: ");
		int num=sc.nextInt();
		
//		int rev=0;
//		while(num!=0) 
//		{
//			rev=rev*10 + num%10;
//			num=num/10;
//		}
//		System.out.println("reverse no is :"+rev);
		
		// by using StringBuffer class
		
		StringBuffer sb=new StringBuffer();
		sb.append(num);
		StringBuffer rev = sb.reverse();
		System.out.println("reverse no is: "+rev);
		
		//by using stringbuilder class
//		StringBuilder sb=new StringBuilder(String.valueOf(num));
//		StringBuilder rev = sb.reverse();
//		System.out.println("reverse no is :"+rev);
	}

}
