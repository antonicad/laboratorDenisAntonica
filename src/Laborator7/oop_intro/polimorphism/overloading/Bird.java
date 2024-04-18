package Laborator7.oop_intro.polimorphism.overloading;

public class  Bird  {
	public  void  fly()  {
		System.out.println("The bird is flying.");
	}
	
	public  void  fly(int height)  {
		System.out.println("The bird is flying "  + height +  " meters high.");
	}
	
	public  void  fly(String name,  int height)  {
		System.out.println("The "  + name +  " is flying "  + height +  " meters high.");
	}
	
	public  static  void  main(String[] args)  {
		Bird myBird =  new Bird();
		myBird.fly();
		myBird.fly(50);
		myBird.fly("falcon", 50);
	}
}