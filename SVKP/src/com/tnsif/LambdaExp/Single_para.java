package com.tnsif.LambdaExp;
interface Operator{
	public void operate(int num);
}

public class Single_para {

	public static void main(String[] args) {
		Operator op = num -> System.out.println("Inccccreasing num by 1:" +(num+1));
		op.operate(5);
	}

}
