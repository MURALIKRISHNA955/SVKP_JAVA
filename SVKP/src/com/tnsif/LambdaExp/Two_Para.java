package com.tnsif.LambdaExp;
interface Operatore{
	public int operate(int num1, int num2);
	
}

public class Two_Para {

	public static void main(String[] args) {
		Operatore op = (num1,num2) -> num1+num2;
		int sum = op.operate(10,20);
		System.out.println("sum:"+sum);

	}

}
 