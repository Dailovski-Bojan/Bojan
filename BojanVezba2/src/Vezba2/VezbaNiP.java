//Da se procita eden broj i da se proveri dali poslednata cifra na toj broj e paren ili neparen
 
 package Vezba2;
 import java.util.Scanner;
 
 		public class VezbaNiP {
 		public static void main(String[]args) {
 			
 			int Broj;
 			Scanner tastatura = new Scanner(System.in);
 			
 				System.out.println("Vnesi go brojot: ");
 				Broj=tastatura.nextInt();
 				if(Broj%2==0) {
 					System.out.println("Brojot e paren");
 				}
 				else {
 					System.out.println("Brojot e neparen");
 				}
 			
 			
 		}
}
