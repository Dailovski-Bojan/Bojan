package Kalkulator;
import java.util.Scanner;

	public class Kalkulator {
	public static void main(String[]args) {
		Scanner tastatura=new Scanner(System.in);//edniot scenner e za tast edniot za broevi
		Scanner broevi=new Scanner(System.in);//vtoriot e tekst
		double rezultat;
			System.out.println("Vnesi go prviot broj");
			double a=tastatura.nextDouble();
			System.out.println("Vnesi ja operacijata");
			String Operacija=broevi.nextLine();//dava moznost da vneseme operacija
			System.out.println("Vnesi go vtoriot broj");
			double b=tastatura.nextDouble();
			
			switch(Operacija) {//izbira koja operacija ni e zadadena i ja koristi istata
			case "+":
				 rezultat=a+b;
				System.out.println(rezultat);
				break;
			}
			
			switch(Operacija) {
			case "-":
				 rezultat=a-b;
				System.out.println(rezultat);
				break;
			}
			
			switch(Operacija) {
			case "*":
				 rezultat=a*b;
				System.out.println(rezultat);
				break;
			}
			
			switch(Operacija) {
			case "/":
				if(b>=1) {
				rezultat=a/b;
				System.out.println(rezultat);
				}
				else {
					System.out.println("ne se deli so 0");
				}
				break;
			}
			//default
			switch(Operacija) {
			case "*":
				rezultat=a*b;
				System.out.println(rezultat);
				break;
			}
			
		}
}//napraj poslozen kalkulator za domasna
