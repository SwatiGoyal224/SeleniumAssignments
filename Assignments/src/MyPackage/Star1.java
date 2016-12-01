package MyPackage;
import java.util.Scanner;

public class Star1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num=sc.nextInt();
		int i, j=0;
		
		
		for(i=1; i<=num; i++) {
			for (j=1;j<=num-i;j++) {
			System.out.print(" ");
			
			}
			for(int k=num-i;k<num;k++)
			{
			System.out.print("*");
			}
			System.out.println("");
		}
	}

}
