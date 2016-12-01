package MyPackage;

public class SelectionSort {
	
	public static void selectionSort(int arr[]){
		
		int temp,i,j;
		for(i=0;i<arr.length;i++){
			for(j=1;j<arr.length;j++){
				
				if(arr[j]<arr[j-1]){
					temp= arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
				
			}
		
		}
	}

	public static void main(String[] args) {
		int arr[]= {34,56,7,90,2,36,129};	
		
		System.out.println("Array before sort : ");
		for (int i=0; i<arr.length; i++){
		System.out.println(+arr[i]);
		}
		
		selectionSort(arr);  // calling selectionSort method
		System.out.println("Array after sort : ");
		for (int i=0; i<arr.length; i++){
		System.out.println(+arr[i]);
		}
		
		}
}
