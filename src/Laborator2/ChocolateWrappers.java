package Laborator2;

public class ChocolateWrappers {
	public static void main(String[] args) {
		int money = 15;
        int price = 1;
        int wrap = 3;
		
        System.out.println(countChocolates(money, price, wrap));
	}
	
	public static int countChocolates(int money, int price, int wrappers) {
        int chocolates = money/price;

        return chocolates + countChocolatesFromWrappers(chocolates, wrappers);
	}
	
	public static int countChocolatesFromWrappers(int chocolates, int wrappers) {
        if (chocolates < wrappers) {
            return 0;	
        }
     
        int newChocolates = chocolates / wrappers;
     
        return newChocolates + countChocolatesFromWrappers(newChocolates + chocolates % wrappers, wrappers);
	}
}


//	cc(16, 2, 2)
//		8 + ccfw(8, 2) = 8 + 7 = 15
//			4 + ccfw(4,2) = 4 + 3 = 7
//				2 + ccfw(2, 2) = 2 + 1 = 3
//					1 + ccfw(1, 2) = 1+0 = 1
//						ccfw(1,2) = 0


// cc(15, 1, 3)
// 15 + ccfw(15, 3) = 15 + 7 = 22
//			5 + ccfw(5, 3) = 5+ 2 = 7
//				1 + ccfw(3,3) = 1+ 1 = 2
//					1 + ccfw(1,3) = 1 + 0 = 1
//						ccfw(1,3) = 0 