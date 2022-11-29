package interfaz;
import dominio.*;

/*

*/
public class Interfaz {
	public void procesarPeticion (String marca, String color, String matricula, String plazas){


		/**
		System.out.println(" posicion 1: " + marca);
		System.out.println(" posicion 2: " + color);
		System.out.println(" posicion 3: " + matricula);
		System.out.println(" posicion 4: " + plazas);
		*/
		
		Coche coche_1 = new Coche();
		coche_1.setMarca (marca);
		coche_1.setColor (color);
		coche_1.setMatricula (Integer.parseInt(matricula));
		coche_1.setPlazas (Integer.parseInt(plazas));

		Catalogo lista_de_coches = new Catalogo();

		lista_de_coches.annadirCoche(coche_1);

		//lista_de_coches.getCoche_1();

	}

}

