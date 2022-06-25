
public class decisionoperator {

	public static void main(String[] args) {
		System.out.println("***OR-Condition***");
		int x=10;
		int y=20;
		int z=10;
		  if(!(x > y) || (x != z))
		  {
			  System.out.println("Condition is TRUE");
		  }
		  else
		  {
			  System.out.println("Condition is FALSE");
		  }
		  
		  System.out.println("***AND-Condition***");
		  int ageOfBoy = 3;
		  int ageOfGirl = 20;
		  if((ageOfBoy>=21)&&(ageOfGirl>=18))
		  {
			  System.out.println("READY TO GET MARRIED!");
		  }
		  else
		  {
			  System.out.println("WAIT FOR FEW MORE YEARS@");
		  }
		  
		  System.out.println("***NOT-Condition***");
		  int k = 5;
		  if(k != 5)
		  {
			  System.out.println("VALUE OF k IS NOT 5");
		  }
		  else
		  {
			  System.out.println("VALUE OF k IS  5");
		  }
	}

}
