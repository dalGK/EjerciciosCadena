package EjerciciosCadena;

import java.util.Scanner;

/*1.	Dada una cadena introducida por teclado, obtener su longitud, el carácter que ocupa
el centro de la  cadena y visualizar la mitad derecha y la mitad izquierda de la misma.*/


public class Ej_01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int mitadCadena;
		System.out.println("Introduce una palabra");
		String cadena = new String(entrada.nextLine());
		mitadCadena = cadena.length() - cadena.length()/2;
		
		System.out.println("La palabra "+"'"+cadena+"'"+" tiene "+cadena.length()+" caracteres");
		System.out.println("la letra que está en la mitad de la cadena es: "+cadena.charAt(cadena.length()/2));
		System.out.println(cadena.substring(mitadCadena, cadena.length()));
		System.out.println(cadena.substring(0, mitadCadena));
		
		
	}

}
