package MyPackage;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = sc.nextInt();
		//String s=sc.next();
		int temp, sum = 0, r;

		temp = num;
		while (num > 0) {
			r=num%10; 				//calculating remainder
			sum= (sum*10)+r;
			num=num/10;				
		}
		
		if(temp==sum){
			System.out.println("Given number is palindrom number");
		} else {
			System.out.println("Given number is not a palindrom number");
		}
		}

	}
