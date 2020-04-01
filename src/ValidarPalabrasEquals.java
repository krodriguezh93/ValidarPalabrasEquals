import java.util.Scanner;

public class ValidarPalabrasEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//32) Pedir dos palabras por teclado, indicar si son iguales.
	
	Scanner entrada = new Scanner(System.in);
	
	String primeraPalabra;
	String segundaPalabra;
	
	System.out.println("Introduzca la primera palabra");
	primeraPalabra = entrada.next();
	
	System.out.println("Introduza la segunda palabra");
	segundaPalabra =entrada.next();
	
	if (primeraPalabra.equals(segundaPalabra))
    {
		System.out.println("las palabras son iguales");
	}
	else
	{
		System.out.println("Las palabras no son iguales");
	}
	}

}
