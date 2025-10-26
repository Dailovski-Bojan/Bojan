package Suma;
import java.util.Scanner;
public class Suma {
	
	public static void main(String[]args) {
		int a,b,c,d,e;
		int sumap=0, sumanep=0;
		Scanner tastatura=new Scanner(System.in);
		
	System.out.print("Vnesi go brojot 1");
	a=tastatura.nextInt();
	System.out.println("Vnesi go brojot 2");
	b=tastatura.nextInt();
	System.out.println("Vnesi go brojot 3");
	c=tastatura.nextInt();
	System.out.println("Vnesi go brojot 4");
	d=tastatura.nextInt();
	System.out.println("Vnesi go brojot 5");
	e=tastatura.nextInt();
	//MODULOT PECTI SE POSLE ZAPIRKATA
	if(a%2==0) {    		//Uslovni iskazi!(if ciklus)ova e za pronaoganje 
		sumap=sumap+a;
	}
	else {
		sumanep=sumanep+a;
	}
	if(b%2==0) {
		sumap=sumap+b;
	}
	else {
		sumanep=sumanep+b;
	}
	if(c%2==0) {
		sumap=sumap+c;
	}
	else {
		sumanep=sumanep+c;
	}
	if(d%2==0) {
		sumap=sumap+d;
	}
	else {
		sumanep=sumanep+d;
	}
	if(e%2==0) {
		sumap=sumap+e;
	}
	else {
		sumanep=sumanep+e;
	}
	System.out.println("Sumata na parnite broevi e: "+sumap+" a na neparnite e: "+sumanep);
	}
}
