package dominio;
import java.util.ArrayList;
import java.io.FileWriter;


public class Catalogo {

	/**
	 * Metodo donde se en listan los coches
	 */

	ArrayList <Coche> array_coches = new ArrayList <Coche> ();

	/** 
	 * Metodo que asigna datos a la array
	 */

	public void annadirCoche (Coche coche){

		array_coches.add(coche);


		/** 
		 * Se crea un fichero
		 */
		
		FileWriter catalogo = null;

		/** 
		 *Escribe en el fichero los atributos de Coche
		 */

		try {
			
			 catalogo = new FileWriter ("Catalogo.txt",true);
			 catalogo.write (coche.getMarca ()+",");
			 catalogo.write (coche.getColor ()+",");
			 catalogo.write (""+coche.getMatricula()+ ",");
			 catalogo.write (""+coche.getPlazas()+"\n");
			 catalogo.close();
		}

		/** 
		 * Si ocurre algun error al ejutarse la respuesta el catch lo indentificara
		 */

		catch (Exception ex) {

			System.out.println("ha habido una excepcion: " + ex.getMessage());
			//catalogo.close();
		}

	}

}



		

	
