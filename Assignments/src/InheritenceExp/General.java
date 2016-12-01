package InheritenceExp;
import java.util.Scanner;

public class General {

	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the mode of travel: 1. Car 2. Bus");
		int num=sc.nextInt();
		Bus b3= new Bus();
		Car c= new Car();
		
		if (num==1)
		{
			c.Carinfo();
		}
		else if (num==2)
		{
			System.out.println("Enter the Registration number of Bus");
			int renum=sc.nextInt();
			
			b3.Businfo(renum);
		}
		else
		{
			System.out.println("No value matched");
		}
		}

	}


