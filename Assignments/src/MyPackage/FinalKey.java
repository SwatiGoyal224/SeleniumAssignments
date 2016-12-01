package MyPackage;

public class FinalKey {

	final int speedlimit=100;
	
	public void change(){
		speedlimit=400;
	}
	
	public static void main(String[] args) {
		FinalKey obj= new FinalKey();
		obj.change();
		

	}

}
