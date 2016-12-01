package MyPackage;
import java.util.Scanner;

public class FactorialNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number: ");
		int number= sc. nextInt();
		long result=1;
		
		for (int i=1;i <=number;i++) {
			
			result= result*i;
		
		}
		
		System.out.println("Factorial of given number : " +result);
		
		
	}

}
