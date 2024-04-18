package Laborator7.oop_intro.polimorphism.overriding;


class Programmer {
    public void code() {
        System.out.println("Coding in C++");
    }
}

public class JavaProgrammer extends Programmer{

    public void code() {
        System.out.println("Coding in Java");
    }
	

    public static void main(String[] args) {
        Programmer ben = new JavaProgrammer();
        ben.code();
    }
	
}
