package EjerciciosCadena;

import java.util.Scanner;

public class Ej_02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		char c = 0;
		String cadena;
		
		System.out.println("Introduce una cadena de caracteres");
		cadena=entrada.next();
		System.out.println("Introduce un caracter a buscar");
		c=entrada.next().charAt(c);
		
		buscarOcurrencias(cadena, c);

	}
	

	public static void buscarOcurrencias(String cadena, char c){

		char arrayletras[]= new char[cadena.length()];

		for(int i=0; i<cadena.length(); i++)
			arrayletras[i]=cadena.charAt(i);

		System.out.print("El caracter "+c+ " esta en las posiciones: ");
		for(int i=0; i<arrayletras.length; i++) {
			if (c==arrayletras[i]) 
				System.out.print(i+" ");


		}
	}
}
