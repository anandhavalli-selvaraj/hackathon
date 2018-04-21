package org.hackathon.solutions;

import java.util.Scanner;

public class NumberIsPositive {
 public static void main(String args[])
 {
	 final Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 if(n>0)
	 {
		 System.out.println("Positive");
	 }
	 else if(n==0)
	 {
		System.out.println("Zero"); 
	 }
	 else
	 {
		 System.out.println("Negative");
	 }
 }
}
