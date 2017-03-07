package newpackage;

import java.util.Scanner;

public class PrintDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cat c = new Cat();
		Fish f = new Fish();
		Snake s = new Snake();

		System.out.println("Enter following options: 1. Cat 2. Fish 3. Snake ");
		int n = sc.nextInt();

		switch (n) {
		case 1:
			c.details();
			break;
		case 2:
			f.details();
			break;
		case 3:
			s.details();
			break;
		default:
			System.out.println("Option not exist");
		}

	}

}
