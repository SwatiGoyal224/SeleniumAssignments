package newpackage;

public class Cat extends Animal{

	public void details(){
		category= "walkon4legs";
		eats= "nonveg";
		System.out.println("Category :"+category);
		System.out.println("Eats :"+eats);
	}
	
}

 class Fish extends Animal{

	public void details(){
		category= "water animal";
		eats= "nonveg";
		System.out.println("Category :"+category);
		System.out.println("Eats :"+eats);
	}
	
}
 
 class Snake extends Animal{

	public void details(){
		category= "reptiles";
		eats= "nonveg";
		System.out.println("Category :"+category);
		System.out.println("Eats :"+eats);
	}
	
}
