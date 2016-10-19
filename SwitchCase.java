package MyPackage;

import java.util.Scanner;

public class SwitchCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the Operation(Add/Sub):");
		String name = s.next();
		System.out.println("Enter Number1=");
		int num1= s.nextInt();
		System.out.println("Enter Number2=");
		int num2= s.nextInt();	
		
			switch(name)
		{
		case "Add":
			int sum= num1+num2;
			System.out.println("Sum is="+sum);
			break;
			
		case "Sub":
			int num3= num1-num2;
			System.out.println("Substraction is ="+num3);
			break;
			
		default:
			System.out.println("Do not match with any Operations");
			break;	
			
		}
	}

}
