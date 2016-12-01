package SuperEx;

class Subclass extends SuperVeriable {
	int speed=100;
	
	public void method1(){
		System.out.println("i'm child");
	}
	
	public void m2(){
		super.method1();
	}
	
	public static void main(String[] args) {
		Subclass objSubVeriable= new Subclass();
		objSubVeriable.m2();
		
	}

}

public class SuperVeriable {
	int speed= 200;
	
	public void method1(){
		System.out.println("i'm parant");
	}
	
}
