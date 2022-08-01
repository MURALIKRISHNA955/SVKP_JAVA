package com.tnsif.exceptions;

public class DemoException {

	public static void main(String[] args) {
		int n1,n2;
		try {
			
			int a[]=new int[3];
			a[4]=30/2;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero not allowed");
		}
        catch(Exception e)
		{
	System.out.println(e);
		}
		finally
		{
			System.out.println("whatever in the block will be excuted");
			
		}
	}

}
