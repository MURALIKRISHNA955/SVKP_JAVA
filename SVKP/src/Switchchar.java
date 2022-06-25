
public class Switchchar 
{
public static void main(String[] args)
{
	char x = 'a';
	switch(x)
	{
	case 'a':
	case 'A':
		System.out.println("THE VALUE OF X IS A");
		break;
	case'b':
	case'B':
		System.out.println("THE VALUE OF X IS B");
		break;
	case'c':
	case'C':
		System.out.println("THE VALUE OF X IS C");
		break;
		default:
			System.out.println("THE VALUE OF X IS OTHER THAN A,B,C");
			break;
	}
}
}