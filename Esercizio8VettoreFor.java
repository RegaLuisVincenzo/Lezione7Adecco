package lezione7Adecco2Set;


/*
 * DATO UN VETTORE DI ELEMNTI GIà
 * INIZIALIZZA
 * 
 * int[] vett={ 10, 50, 100, 1, 4}
 * 
 * TROVA L'ELEMENTO PIU GRANDE DEL VETTORE 
 * QUINDI STAMPA 100,
 * 
 * 
 * 
 */

public class Esercizio8VettoreFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vett = { 10, 50, 100, 1, 4 };
		int massimo;
		massimo=vett[0];
//---
		for (int i = 0; i < vett.length; i++) {
			System.out.println("elemento maggiore di " + vett[i]);

			if (vett[i] > massimo) {

				massimo = vett[i];
			}

		}
		//il numero maggiore
		System.out.println("il massimo "+massimo);

	}

}
