package aplicacion;
import java.util.Scanner;
import interfaz.*;
 /* Con los imports se conecta la Interfaz con el Main, y se usa un metedo de String que se llama Scanner para leer datos.
 y el package aplicacion para luego poder ser relacionada con otras clases
 */

public class Principal {

	public static void main(String[] args)
	{
	
		if (args[0].equals("add")){

			Interfaz procesar = new Interfaz ();

			procesar.procesarPeticion(args[1], args[2], args[3], args[4]);	
		
		}

		
		else {
			System.out.println("argumento introducido no reconocido.");
			System.out.println("Ejemeplo: add Mercedes azul 2772 5");
		}
		
	}

// Eso va a hacer que 



}