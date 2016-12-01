package MyPackage;

import java.util.Scanner;

public class Arrayex {

	public void printArray(int arr[]) {
		System.out.println("Array Elements are: ");
		for (int i = 0; i < arr.length-1; i++) { // Printing array
			System.out.println(arr[i]);
		}
	}

	public void addElement(int arr[]) {
  
		for (int i = arr.length-1; i> 2; i--) { // Adding an element to 3rd
												// position of array
			arr[i] = arr[i-1];
		}
		arr[2] = 4;
	}

	public void deleteElement(int arr[]) {
		for (int i = 5; i < arr.length; i++) // Printing array
		{
			arr[i+1]= arr[i];
		}
	}

	public static void main(String[] args) {

		Arrayex arObj = new Arrayex();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in array: ");
		int num = sc.nextInt();
		int a[] = new int[num+1];

		System.out.println("Enter elements in array: ");
		for (int i = 0; i < num; i++) { // accept elements of array from user
			a[i] = sc.nextInt();
		}
		arObj.printArray(a);
		arObj.addElement(a);
		arObj.printArray(a);
		// arObj.deleteElement(a);

	}

}
