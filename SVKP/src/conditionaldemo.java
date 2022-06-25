
public class conditionaldemo {

	public static void main(String[] args) {
		int a=25;
		int b=20;
		int c=15;
		
		if(a<b)
			System.out.println("Tha values of A is:" +a);
		
		if(a>b)
	    System.out.println("A is biger then B");  
	else
		System.out.println("B is bigger then A");
		
		if(a>b)
			if(a>c)
				System.out.println("Print A value");
			else
				System.out.println("Print C value");
		else
		     System.out.println("Print B value");
	}

}
