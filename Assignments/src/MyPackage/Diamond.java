package MyPackage;

public class Diamond {

	
	public static void main(String[] args) {
		int i, j=0;
		
		
		for(i=0; i<=3; i++) {
			for (j=0;j<=3-i;j++) {
			System.out.print(" ");
			
			}
			for(int k=3-i;k<3+i-1;k++)
			{
			System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
