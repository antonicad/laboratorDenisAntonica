package Laborator7.oop_intro.abstraction;

abstract class Shape {
    public abstract void draw();
}

class Circle1 extends Shape{
    public void draw() {
        System.out.println("Circle!");
    }
}

public class TestShapeAbstract {
    public static void main(String[] args) {
        Shape circle = new Circle1();
        circle.draw();
    }
}