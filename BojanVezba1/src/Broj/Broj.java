/*
Da se procita eden broj i da se pecati na ekran dali brojot e deliv so 3
*/
package Broj;
import java.util.Scanner;

	public class Broj {
	public static void main(String[]args) {
		
	Scanner tastatura= new Scanner(System.in);
		int Broj;
		System.out.println("Vnesi go brojot da se proveri dali e delliv so 3: ");
		Broj = tastatura.nextInt();
		
		if(Broj%3==0) { 
			System.out.println("Brojot e deliv so 3");
		}
		else {
			System.out.println("Brojot ne e deliv so 3");
		}
			
	 
	}

}
