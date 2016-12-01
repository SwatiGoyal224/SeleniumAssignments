package MyPackage;

import java.util.Scanner;

public class ArmstrongNumber{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = sc.nextInt();
		int temp, sum = 0, r;

		temp = num;
		while (num > 0) {
			r=num%10; 				//calculating remainder
			sum= sum+(r*r*r);
			num=num/10;				
		}
		
		if(temp==sum){
			System.out.println("Given number is Armstrong number");
		} else {
			System.out.println("Given number is not a Armstrong number");
		}
		}

	}
