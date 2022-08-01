package com.tnsif.Assessment;

public class Swap {

	public static void main(String[] args) {
		int a=2;
		int b=3;
		System.out.println("Before SWAP");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After SWAP");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}

}
