package interfaz;
import dominio.*;


public class Interfaz {
	public void procesarPeticion (String[] comandos){


		
		Coche coche_1 = new Coche();
		coche_1.setMarca (comandos[1]);
		coche_1.setColor (comandos[2]);
		coche_1.setMatricula (comandos[3]);
		coche_1.setPlazas (Integer.parseInt(comandos[4]));
		

		Catalogo lista_de_coches = new Catalogo();

		System.out.println("Entramos interfaz");

		if (comandos[0].equals("add")){
			lista_de_coches.annadirCoche(coche_1);
			System.out.println("añadir coche");

		}
		else if (comandos[0].equals("remove")){
			lista_de_coches.borrarCoche(coche_1);
			System.out.println("borramos coche");
		}
		
		//ejemplo comando modificar mercedes blanco 123 7
		else if (comandos[0].equals("modify")){
			lista_de_coches.borrarCoche(coche_1);
			lista_de_coches.annadirCoche(coche_1);
			System.out.println("modificamos coche");
		}
		

	}

}

