package Laborator7.oop_intro.polimorphism.overriding;

class  Animal  {
	public  void  eat()  {
		System.out.println("This animal eats insects.");
	}
}

class  Bird  extends Animal {
	public  void  eat()  {
		System.out.println("This bird eats seeds.");
	}
}

public class BirdOverriding {
	public  static  void  main(String[] args)  {
		Animal myAnimal =  new Animal();
		myAnimal.eat();
		
		
		Bird myBird =  new Bird();
		myBird.eat();
	}
}
