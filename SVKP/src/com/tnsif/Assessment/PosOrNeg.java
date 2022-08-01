package com.tnsif.Assessment;
import java.io.*;
public class PosOrNeg 
{
  public static void main(String[] args)throws IOException
  {
	  String m;
	  int num;
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("enter The Number");
	 m=br.readLine();
	  num = Integer.parseInt(m);
	  if(num>0)
	  {
		  System.out.println("The Number is Positive.");
	  }
	  else if(num<0)
	  {
		  System.out.println("The Number is Negitive.");
	  }      
	  else
	  {
		  System.out.println("The Number is Zero.");
	  }
			}

}
