package Pravoagolnik;
import java.util.Scanner; //ja importiras bibliotekata skener!
public class Pravoagolnik {
	public static void main(String[]args) {
	double strana1, strana2, plostina, perimetar;
	Scanner tastatura=new Scanner(System.in);
	System.out.println("Programata presmetuva povrsina i perimetar na pravoagolnik");
	System.out.println("Vnesete dolzina na edna strana: ");
	strana1=tastatura.nextDouble();
	System.out.println("Vnesete dolzina na drugata strana: ");
	strana2=tastatura.nextDouble();
	plostina=strana1*strana2;
	perimetar=2*strana1+2*strana2;
	System.out.println("Plostinata e: " +plostina);
	System.out.println("Perimetarot e: " +perimetar);
	
}
}
