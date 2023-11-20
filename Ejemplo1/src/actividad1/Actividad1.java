package actividad1;
import java.util.Scanner;

//	Crea un programa anomenat FormattedDate amb una classe amb el mateix nom dins. El
//	programa demanarà a l'usuari que introduïsca el dia, el mes i l'any del seu naixement (tots
//	els valors són sencers). Llavors, es traurà per pantalla la data de naixement amb el següent
//	format d/m/a. Per exemple, si l'usuari tecleja dia=7,mes=11, any=1990, el programa traurà
//	7/11/1990.

public class Actividad1 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingresa un dia: ");
		int dia = sc.nextInt();
		
		System.out.print("Ingresa un mes: ");
		int mes = sc.nextInt();
		
		System.out.print("Ingresa un año: ");
		int año = sc.nextInt();
		
		System.out.printf("La fecha introducida es: %02d/%02d/%04d", dia, mes, año);
	}
}
