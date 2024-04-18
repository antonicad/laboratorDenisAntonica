package Laborator7.oop_intro.abstraction;

abstract class Animal {
   //abstract method
   public abstract void sound();
   
  public static void main(String args[]){
	 Animal obj = new Dog();
	 obj.sound();
  }
}

//Dog class extends Animal class
class Dog extends Animal{

   public void sound(){
	   System.out.println("Woof");
   }
   

}