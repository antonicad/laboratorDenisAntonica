package Laborator2;

public class Hanoi {
	public static void main(String[] args) {
		
		System.out.println("Turnurile din Hanoi: -------------------------"); 
		runHanoi(4, 'A', 'C', 'B');
	}

	
	public static void runHanoi(int n, char src, char dst, char tmp) { 
		if (n > 0) {
			// muta toate discurile cu exceptia celui mai mare in tmp
			runHanoi(n - 1, src, tmp, dst);
			// muta discul cel mai mare (ultimul, adica discul n) in destinatie
			System.out.println("Muta discul. " + n + " de la " + src + " la " + dst);
			
			// recursiv: muta toate discurile din tmp in destinatie (peste discul cel mai mare)
			// folosing src ca si tmp de aceasta data
			runHanoi(n - 1, tmp, dst, src);
		}
	}
}



// runHanoi(2, 'A', 'C', 'B');
//		runHanoi(1, 'A', 'B', 'C')
//			runHanoi(0, 'A', 'C', 'B')
//			1 de la A la B
//			runHanoi(0,'C', 'B', 'A')
//		2 de la A la C
//		runHanoi(1, 'B', 'C', 'A')
//			runHanoi(0, ...
//			1 de la 'B' la 'C'
//			runHanoi(0, ...
		