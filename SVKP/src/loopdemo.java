
public class loopdemo {

	public static void main(String[] args) {
		System.out.println("***For Loop***");
		for(int i=1;i<5;i++)
		{
			System.out.println("the value :"+i);
	}
		
		System.out.println("***While Loop***");
		int j = 1;
		while(j<5)
		{
			System.out.println("the value :"+j);
			j++;
		}
		
		System.out.println("***Do While Loop***");
		int k = 1;
		do
		{
			System.out.println("the value :"+k);
			k++;
		}
		while(k<5);
}
}