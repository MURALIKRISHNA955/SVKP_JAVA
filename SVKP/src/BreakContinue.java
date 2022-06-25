
public class BreakContinue {

	public static void main(String[] args) {
		System.out.println("***CONTINUE***");
		for(int i=1; i<10;i++)
		{
			if(i==1)
			{
				continue;
			}
			System.out.println(i);
		}
		
		System.out.println("***BREAK***");
		for(int k=1; k<10;k++)
		{
			if(k==1)
			{
				
			}
			System.out.println(k);
			break;
		}
	}
}
