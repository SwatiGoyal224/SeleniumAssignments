package InheritenceExp;

import java.util.Scanner;

public class Bus extends Vehicle

{
	public void Businfo(int n) {

		Bus b = new Bus();
		Bus b1 = new Bus();

		b.regno = 34;
		b1.regno = 66;
		b.noofwheels = 2;
		b1.noofwheels = 4;

		if (b.regno == n) {
			System.out.println("Number of wheels in bus= " + b.noofwheels);
			System.out.println("Registration Number= " + b.regno);
			System.out.println("40 seater Bus");
		}

		else if (b1.regno == n) {
			System.out.println("Number of wheels in bus= " + b1.noofwheels);
			System.out.println("Registration Number= " + b1.regno);
			System.out.println("20 seater Bus");
		}
		else
		{
			System.out.println("No value matched");
		}
	}

}
