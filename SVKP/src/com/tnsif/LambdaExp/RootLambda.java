package com.tnsif.LambdaExp;

		interface RootNumber
		{
			public void print(int num);
		}

		public class RootLambda {

			public static void main(String[] args) {			
				RootNumber Robj = (int num) -> System.out.println("square is: "+ num*num);
				Robj.print(5);
			}
		
	}


