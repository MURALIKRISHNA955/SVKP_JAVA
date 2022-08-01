package com.tnsif.Assessment;
 import java.util.Scanner;

public class SmallestNum
{
	public static void main(String[] args) 
	{
		int a,b,c,smallest,temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Three Numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		temp=a<b?a:b;
		smallest=c<temp?c:temp;
		System.out.println("The smallest number is :"+smallest);
	}
}
