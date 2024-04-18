package Laborator7.oop_intro.encapsulation_violation;

public class Album {
    public String name;
    public String artist;
    public double price;
    public int numberOfCopies;
    
    public void sellCopies(){
        if(numberOfCopies > 0){
            numberOfCopies--;
            System.out.println("One album has sold!");
        }
        else{
            System.out.println("No more albums available!");
        }
    }
    
    public void orderCopies(int num){
        numberOfCopies += num;
    }
}