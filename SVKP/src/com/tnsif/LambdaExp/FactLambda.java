package com.tnsif.LambdaExp;
interface FactNumber
{
	public int print(int num);
}
public class FactLambda {

	public static void main(String[] args) {

		//int i,fact=1;  
		  int num ;//It is the number to calculate factorial    
		 // for(i=1;i<=num;i++){    
		   //   fact=fact*i;    
		  //}    
		FactNumber Fobj = (int num ) -> System.out.println("Factorial of "+num+" is: "+fact);  
		int fact = 1;
		int i;
		 for(i=1;i<=num;i++){    
		      fact=fact*i;    
		  }    
		Fobj.print(num);
		}
		 }  
