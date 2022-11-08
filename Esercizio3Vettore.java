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

public class Esercizio3Vettore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
				
				Scanner key=new Scanner(System.in);
				System.out.println("INSERISCI NUMERO");
				int numero=key.nextInt();
				
				while((numero>10 || numero<3));
					System.out.println("non va bene");
					numero=key.nextInt();
					
				int[] vettint=new int[numero];
				
				System.out.println("HAI CREATO UN VETTORE"+vettint);
				
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
