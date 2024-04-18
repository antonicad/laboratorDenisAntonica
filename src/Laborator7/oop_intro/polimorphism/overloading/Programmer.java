package Laborator7.oop_intro.polimorphism.overloading;

public class Programmer {
	  public void code() {
		  System.out.println("Coding in C++");
	  }
	  
	    public void code(String language) {
	        System.out.println("Coding in "+language);
	    }
    
	    public static void main(String[] args) {
	    	Programmer gosling = new Programmer();
	        gosling.code();
	        gosling.code("Java");
	    }
}
