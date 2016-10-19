package MyPackage;

public class PrimeNumber {
	public static void main(String[] args) {
		int num1 = 7;
		int k=0;
		for (int i = 2;i< num1 ; i++) {
			if(num1%i==0){
				k=1;
				break;
			}		
				
		}	
		if (k==1)
		{
			System.out.println(num1+ "Given number is Not Prime number");
		}
		else {
			System.out.println(num1+ "Given number is Prime number");
		}
						
	}

}
