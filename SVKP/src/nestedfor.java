
public class nestedfor 
{
	public static void main(String[] args) 
	{
		
		System.out.println("***FOR LOOP***");
		int number = 8;
		boolean isPrime = true;
		for(int i=2; i<number/2; i++)                 
		{
			if(number%i==0) 
			{
				isPrime = false;
			}
		}
		if(isPrime==true)
		{
			System.out.println("THE NUMBER IS APRIME NUMBER");
		}
		else
		{
			System.out.println("THE NUMBER IS NOT A PRIME NUMBER");
		}
		
		
		System.out.println("***NESTED FOR LOOP***");
		for(int j=1; j<=10; j++)
		{
			for(int k=1; k<=10; k++)
			{
				System.out.println("value of j:"+j+" and value of k:" +k);
				
			}
			System.out.println("******KITTU ******");
		}
	}
}
