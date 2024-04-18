package Laborator7.oop_intro;

public class TestCat {
    public static void main(String[] args) {
        Cat severus = new Cat();
        Cat luna = new Cat();
     
        severus.name = "Severus";
        severus.age = 2;
        severus.breed = "European";
        severus.color = "Black";

        severus.sleep();

        luna.name = "Luna";
        luna.age = 1;
        luna.breed = "European";
        luna.color = "White";
        luna.play();
    }
}
