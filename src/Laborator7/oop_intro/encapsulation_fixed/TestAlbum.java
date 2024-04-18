package Laborator7.oop_intro.encapsulation_fixed;

public class TestAlbum {
    public static void main(String[] args) {
       StockKeeper johnDoe = new StockKeeper("John Doe");
//       System.out.println(johnDoe.name);
       
       /*
       Stock keeper creates album and assigns negative values for price and number of copies available
        */
       johnDoe.manageAlbum(new Album(), "Slippery When Wet", "Bon Jovi", -1000.00, -50);
    }
}
