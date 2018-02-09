package EjerciciosCadena;

import java.util.Scanner;

public class Ej_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada =  new Scanner(System.in);
		
		String cadena;
		System.out.println("Introduce una palabra");
		cadena=entrada.nextLine();
		cadena= cadena.replace(" ", "");
		System.out.println(cadena);
		
		palindroma(cadena);
		
	}
	
	 static public void palindroma(String cadena) {
		String cadenaAux = "";
		for (int i = cadena.length()-1; i >= 0; i--) {
			cadenaAux += cadena.charAt(i);
		}
		if (cadena.compareToIgnoreCase(cadenaAux) == 0)
			System.out.println("La cadena introducida es palindroma.");
		else
			System.out.println("La cadena no era palindroma.");
	}

}
