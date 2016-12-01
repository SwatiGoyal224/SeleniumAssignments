package MyPackage;
import java.util.Scanner;

public class Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num=sc.nextInt();
		int i, j=0;
		
		
		for(i=0; i<=num; i++) {
			for (j=0;j<=num-i;j++) {
			System.out.print(" ");
			
			}
			for(int k=num-i;k<num+i-1;k++)
			{
			System.out.print("*");
			}
			System.out.println("");
		}
	}

}
