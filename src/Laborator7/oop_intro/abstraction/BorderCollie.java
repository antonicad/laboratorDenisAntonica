package Laborator7.oop_intro.abstraction;

public class BorderCollie implements DogInterface {
    public void bark() {
        System.out.println("Woof, woof!!");    
    }

    public void wiggleTail() {
        System.out.println("wiggles tail");
    }

    public void eat() {
        System.out.println("eats food");
    }
}
