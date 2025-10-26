package Smetka;
import java.util.Scanner;
	public class Smetka {
	public static void main(String[]args) {
		//jabolki-50den kg, krusi-60den kg, grozje-100den kg
	double smetka =0;
	System.out.println("Vnesi sto si poracuval vo kg!");
	Scanner tastatura = new Scanner(System.in);
	System.out.println("Jabolki: ");
	double Jabolki = tastatura.nextDouble();
	System.out.println("Krusi: ");
	double Krusi = tastatura.nextDouble();
	System.out.println("Grozje: ");
	double Grozje = tastatura.nextDouble();
	smetka=Jabolki*50+Krusi*60+Grozje*100;
	System.out.println("Smetkata iznesuva "+smetka+" denari");
	
	}

	}
