package Inheritance;

import java.util.Scanner;

public class Swapp_Class {

	static int a,b,temp,i,size,max;
	static char ch;
	static Scanner sc = new Scanner(System.in);
	public static void swap()
	{
	
		System.out.print("Enter a no for swapping : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Old value ");
		System.out.println("A : "+a);
		System.out.println("B : "+b);
		System.out.println("After Swapping...");
		temp = a;
		a = b;
		b = temp;
		System.out.println("A : "+a);
		System.out.println("B : "+b);
		

		
	}
	public static void main(String[] args)
	{
		swap();
	}
	
	
}
