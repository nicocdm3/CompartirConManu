import java.util.Scanner;

public class Ejercicio{
		public static void main (String[] args){
			
		final Scanner SC = new Scanner(System.in);
		System.out.println("Por favor introduce un numero:");
			
		int numero1 = SC.nextInt();

		if ( numero1 % 2 == 0  ) {
			System.out.println("El numero es Par"); 
		}
		else {
			System.out.println("El numero es Impar"); 
		}
		
		SC.close();
	}
}




