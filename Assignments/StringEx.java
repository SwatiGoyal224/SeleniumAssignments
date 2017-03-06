package newpackage;

import java.util.Scanner;

public class StringEx {

	public void compare(String str, String newstr) {
		if (str.equals(newstr)) {
			System.out.println("Both Strings are same");
		} else {
			System.out.println("Both Strings are different");
		}

	}

	public static void main(String[] args) {
		StringEx s = new StringEx();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any string value : ");
		String str = sc.nextLine();
		int len = str.length();
		System.out.println("String length is : " + len);
		String sub1 = str.substring(5);
		String sub2 = str.substring(0, 5);
		System.out.println("Sub String 1 : " + sub1);
		System.out.println("Sub String 2 : " + sub2);
		String str2 = sub1.concat(sub2);
		System.out.println("String   : " + str2);
		System.out.println("Enter any string value : ");
		String str3 = sc.next();
		s.compare(str,str3);

	}

}
