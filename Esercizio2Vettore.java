package lezione7Adecco2Set;

import java.util.Scanner;

/*
 * CREARE UN PROGRAMMA 
 * CHE PRENDA UN NUMERO CHE SIA
 * COMPRESO TRA 3 E 10 ESTREMI INCLUSI 
 * 
 * IL NUMERO CHE VIENE INSERITO MI 
 * DETERMINA LA GRANDEZZA DEL VETTORE.
 * 
 * RIEMPIRE IL VETTORE CON LO SCANNER 
 * ELEMENTO PER ELEMENTO 
 * 
 * STAMPARE IL VETTORE 
 * 
 * 
 */

public class Esercizio2Vettore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key=new Scanner(System.in);
		
			System.out.println("INSERISCI IL NUMERO ");
			int numberUtente;
		do  {
			System.out.println("COMPRESO TRA 3 E 10");
			numberUtente=key.nextInt();
		}
		while(numberUtente<3 || numberUtente<10 );
			System.out.println("PRENDO IL NUMERO ");
			int numberUtente1=key.nextInt();
			
			int[] vettint= new int[numberUtente1];
			
			System.out.println("hai creato un vettore "+vettint.length);
			
			int index=0;
			// sto facendo ogni casella 
			while(index<vettint.length) {
				System.out.println("inserisci");
				
				// con key , chiediamo al programma di stampare il valore del inserito dall'utente 
				vettint[index]=key.nextInt();
				// passiamo al secondo valore per inserila all'interno delle casella 
				index++;
				
			}
			key.close();
		}
	}

