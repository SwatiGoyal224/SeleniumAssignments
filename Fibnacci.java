package MyPackage;
import java.util.Scanner;

public class Fibnacci {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the number");
		int num1= s.nextInt();
		long prevnum=0, num=1, nextnum;
		System.out.println(+prevnum);
		System.out.println(+num);
		
		for (int i=1; i<= num1; i++)
		{
			nextnum= prevnum+num;
			prevnum=num;
			num=nextnum;
			System.out.println(+nextnum);
		}
		}

	}

