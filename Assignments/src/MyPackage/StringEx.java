package MyPackage;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String: ");
		s = sc.next(); // accepting String from User
		System.out.println("Entered string is: " + s);
		int length = s.length(); // calculating length of string
		System.out.println("Length of the string is: " + length);
		String sub = s.substring(0, 3); // taking substring
		System.out.println("Substring is: " + sub);

		System.out.println("Enter new string : ");
		String s1 = sc.next();
		String s2 = s.concat(s1);
		System.out.println("After cancatnation, string is: " + s2);
		if (s.equals(s1)) {
			System.out.println("Strings are same");
		} else {
			System.out.println("Strings are diffrent");
		}

	}

}
