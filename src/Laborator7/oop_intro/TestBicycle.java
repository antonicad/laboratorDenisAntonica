package Laborator7.oop_intro;

public class TestBicycle {
    public static void main(String[] args) {
        Bicycle roadBicycle = new Bicycle();
        roadBicycle.gear = 5;
        roadBicycle.braking();
        
        Bicycle mountainBicycle = new Bicycle();
        mountainBicycle.gear = 4;
        mountainBicycle.braking();
    }
}
