package newpackage;


public class MultidemArray {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 5, 6 } };

		int arr1[][] = { { 3, 4, 5 }, { 5, 6, 7 }, { 6, 7, 8 } };

		int arr2[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				arr2[i][j] = arr[i][j] + arr1[i][j];

				System.out.print(arr2[i][j] + " ");

			}

			System.out.println();

		}

	}

}