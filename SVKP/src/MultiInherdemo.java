class Department
{
	public int Department_id;
	String Department_name;
}
class MCA extends Department
{
	int Rollno;
}
class MSC extends Department
{
	int Rollno;
}

public class MultiInherdemo {

	public static void main(String[] args) 
	{
System.out.println("**********MCA**********");
MCA ob=new MCA();
MSC ob1=new MSC();
System.out.println(ob.Department_name="MCA");
System.out.println(ob.Department_id=101);
System.out.println(ob.Rollno=01);
System.out.println("**********MSC**********");
System.out.println(ob1.Department_name="MSC");
System.out.println(ob1.Department_id=102);
System.out.println(ob1.Rollno=02);
	
	}

}
