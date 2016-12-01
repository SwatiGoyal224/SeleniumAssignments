package MyPackage;
import java.util.Scanner;

class Menu {
	
public static void main (String [] args)
{

	Menu m= new Menu();
	System.out.println("Please select choices from below menu:");
	System.out.println("1. Draw Triangle");
	System.out.println("2. Draw Rectangle");
	System.out.println("3. Draw Circle");
	
	Scanner s= new Scanner(System.in);
	int choice=s.nextInt();
	
	
	switch (choice)
	{
	case 1:
	      m.triangle();
		  break;
		  
	case 2:
	      m.rectangle();
		  break;	  
		  
	case 3:
	      m.circle();
		  break;
	
	default:
		System.out.println("Entered choice does not exist");
	}

}
	public void triangle()
	{
		System.out.println("Enter 3 edges for triangle");
		Scanner s1= new Scanner(System.in);
		float e1=s1.nextFloat();
		float e2=s1.nextFloat();
		float e3=s1.nextFloat();
		float area= (e1+e2+e3)/2;
		System.out.println("Area :"+area);
	}
	
	public void rectangle()
	{
		System.out.println("Enter length and width for rectangle");
		Scanner s2= new Scanner(System.in);
		float len=s2.nextFloat();
		float wid=s2.nextFloat();
		
		float area= len*wid;
		System.out.println("Area :"+area);
	}
	
	public void circle()
	{
		System.out.println("Enter radius for circle");
		Scanner s3= new Scanner(System.in);
		float r=s3.nextFloat();
		s3.close();
		double area= 3.14*r*r;
		System.out.println("Area :"+area);
	}
}