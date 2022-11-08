package lezione7Adecco2Set;

import java.util.Scanner;

/*
 * 
 * DATO UN VETTORE 
 * GIA INIZZIALIZZATO
 * 
 * {10, 35, 2}
 * 
 * E UN NUMERO IN INPUT CON SCANNER.
 *DETERMINARE QUANtI NUMERI SONO MULTIPLI DEL NUMERO INSERITO 
 * 
 */

public class Esercizio11VettoreFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);

		System.out.println("INSERIRE IL NUMERO");
		
		int numero = key.nextInt();
		
		int[] vett = { 10, 35, 2 };
		
		int cont=0;
		
		for (int i = 0; i < vett.length; i++) {

			if (vett[i] % numero == 0);
				;
			cont++;
		}

		System.out.println(cont);

		key.close();

	}

}
