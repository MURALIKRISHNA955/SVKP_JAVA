package com.tnsif.exceptions;

public class MyExceptionDemo extends Exception{
	private static int accno[] = {101,102,103,104,105};
	private static String name[] = {"kittu","ramu","navya","reddy","siri","kishore"};
	private static double bal[]= {10000.00,23000.00,300.00,19800.87,12200.00};
	
	MyExceptionDemo(String str)
	{
		super(str);
	}
			public static void main(String[] args) {
		try {
			System.out.println("Acc no"+ "\t" +"name"+ "\t"+"balance");
			for(int i=0;i<5;i++)
			{
				System.out.println(accno[i]+ "\t" +name[i] +"\t" +bal[i]);
				
				if(bal[i]<1000)
				{
					MyExceptionDemo ex = new MyExceptionDemo("balance is less than 1000")
							throws e;
				}
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
}
}