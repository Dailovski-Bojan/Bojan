//Da se procitaat 4broja i da se ispecati na ekran nivniot minimum
package Vezba3;
import java.util.Scanner;



	public class CetiriBroja {
		public static void main(String[]args) {
			
			Scanner tastatura=new Scanner(System.in);
			int n1,n2,n3,n4,minimum;
			
				System.out.println("Vnesi cetiri broja");
				n1=tastatura.nextInt();
				n2=tastatura.nextInt();
				n3=tastatura.nextInt();
				n4=tastatura.nextInt();
				
					if(n1 == n2 && n2==n3 && n3==n4) {
					System.out.println("Broevite se ednakvi");
		}else {
					minimum=n1;
					if(n1<minimum) {
						minimum=n1;
					}
					if(n2<minimum) {
						minimum=n2;
					}
					if(n3<minimum) {
						minimum=n3;
					}
					if(n4<minimum) {
						minimum=n4;
					}
					System.out.println("Minimumot e: " +minimum);
					tastatura.close();
		}
		}
	}
	
						