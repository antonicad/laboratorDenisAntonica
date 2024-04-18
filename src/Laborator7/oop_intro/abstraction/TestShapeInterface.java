package Laborator7.oop_intro.abstraction;

interface Drawable {
    void draw();
}

class Circle implements Drawable{
    public void draw() {
        System.out.println("Circle!");
    }
}

public class TestShapeInterface {
    public static void main(String[] args) {
        Drawable circle = new Circle();
       
        circle.draw();
    }
}