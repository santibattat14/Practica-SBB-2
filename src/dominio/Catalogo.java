package dominio;
import java.util.ArrayList;
import java.io.*;


public class Catalogo {

	/**
	 * Metodo donde se en listan los coches
	 */

	ArrayList <Coche> array_coches = new ArrayList <Coche> ();

	/** 
	 * Metodo que asigna datos a la array
	 */

	public void annadirCoche (Coche coche){

		System.out.println("Estamos en annadirCoche");

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
			 catalogo.write (coche.getMarca () + " ");
			 catalogo.write (coche.getColor ()+" ");
			 catalogo.write (""+coche.getMatricula()+ " ");
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



	public void borrarCoche (Coche coche) {

		System.out.println("Dentro funcion borrarCoche");


	    try {

	        File inFile = new File("Catalogo.txt");

	        if (!inFile.isFile()) {
	            System.out.println("no se encuentra el fichero");
	            return;
	        }

	        File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

	        BufferedReader br = new BufferedReader(new FileReader("Catalogo.txt"));

	        PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

	        String line = null;

	        System.out.println("Que tiene coche:" +coche.getMarca()+" "+coche.getColor()+" "+coche.getMatricula()+" "+coche.getPlazas());

	        while ((line = br.readLine()) != null) {


	            if (!line.trim().contains(coche.getMatricula())){
	                pw.println(line);
	                pw.flush();
	            }
	        }

	        pw.close();
	        br.close();

	 

	        if (!inFile.delete()) {

	            System.out.println("No se puede borrar fichero");

	            return;
	        }

	        if (!tempFile.renameTo(inFile)){

	            System.out.println("no pudo nombra");
	        }

	    } catch (FileNotFoundException ex) {

	        ex.printStackTrace();

	    } catch (IOException ex) {

	        ex.printStackTrace();

	    }

	}



	


}





		

	
