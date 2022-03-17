package day0316;

public class Ex7MultiFor {

	public static void main(String[] args) {


		for(int a=1;a<=5;a++) {	// Çà
			for(int b=1;b<=5;b++) {	// ¿­
				System.out.print("¡Ú");
			}
			System.out.println();
		}
		System.out.println("====================");
		
		
		for(int a=1;a<=5;a++) {
			for(int b=a;b<=5;b++) {
				System.out.print("¡Ú");
			}
			System.out.println();
		}
		System.out.println("====================");
		
		

		
		for(int a=1;a<=5;a++) {
			for(int b=1;b<6-a;b++) {
				System.out.print("  ");
			}
			for(int b=1;b<=a;b++) {
				System.out.print("¡Ú");
			}
			
			System.out.println();
		}
		System.out.println("====================");
		
		
		
		for(int a=1;a<=5;a++) {
			for(int sp=a;sp<5;sp++) {
				System.out.print(" ");
			}
			for(int b=1;b<=a;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("====================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
