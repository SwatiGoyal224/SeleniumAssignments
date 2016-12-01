package MyPackage;

public class Finalmethod {
	int speed=100;
	
	final public void change(){
		speed=400;
	}

	public static void main(String[] args) {
	
	
	}

}

class Finalmethod2 extends  Finalmethod{
	
	public void change()
	{
		speed=900;
	}
}
