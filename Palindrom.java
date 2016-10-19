package MyPackage;
import java.util.Scanner;

public class Palindrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number: ");
		String num=sc.next();
		
		int length= num.length();
		//System.out.println(+length);
		for(int i=0;i<=length;i++){
			String a=num.substring(i);
			System.out.println(a);
		}
		

	}

}
