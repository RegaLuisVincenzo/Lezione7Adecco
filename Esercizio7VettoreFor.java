package lezione7Adecco2Set;

/*
 * DATO UN VATTORE 
 * GIà AINIZIALIZZATO
 * int[] vett={ 2,4,18}
 * 
 * stampare  la scritta 
 * 
 * contiene tutti gli elementi pari 
 * 
 * se il vettore stampa tutti gli elemti pari 
 * 
 * 
 * 
 */

public class Esercizio7VettoreFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean elementi = true;
		int[] vett = { 2, 4, 18 };
		for (int i = 0; i < vett.length; i++) {
			System.out.println("sto considerando elemento "+vett[i]);
			if (vett[i] % 2 != 0)
				elementi = false;

		}

		if (elementi) {
			System.out.println("sono tutti pari");
		} else {
			System.out.println("sonotutti dispari");
		}
	}

}
