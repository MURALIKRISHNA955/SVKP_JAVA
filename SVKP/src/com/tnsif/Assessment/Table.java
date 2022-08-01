package com.tnsif.Assessment;
import java.util.Scanner;
public class Table 
{
	public static void main(String[] args) 
	{
		int i,n,m;
		System.out.println("Enter the Number to be calculated");
		Scanner sc = new Scanner(System.in);
		m=sc.nextInt();
		System.out.println("The Lenght Of Table");
		n=sc.nextInt();
		System.out.println("\n");
		for(i=1;i<=n;i++)
		{
		System.out.println(m+"X"+i+"="+m*i);	
		}
		
	}

}
