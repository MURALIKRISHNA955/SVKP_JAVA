package com.tnsif.LambdaExp;
interface Operators{
	public int operate(int num1, int num2);
}

public class Two_operations {

	public static void main(String[] args) {
		Operators opadd = (num1 ,num2) -> num1+num2;
		int sum = opadd.operate(10,20);
		System.out.println("Sum: "+sum);
		
		Operators opdiff = (num1 ,num2) -> num1-num2;
		int Difference = opdiff.operate(20,10);
		System.out.println("Difference: "+Difference);
		
	}

}
