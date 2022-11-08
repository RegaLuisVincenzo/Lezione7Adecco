package lezione7Adecco2Set;

/*
 * 
 * dato un vettore 
 * di stringhe contare 
 * quante parole iniziano  con 
 * la lettera a
 * 
 * 
 * {"ciao","ala","miao","albero"}
 * 
 * 
 * 
 * 
 */

public class Esercizio13VettoreFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lett=0;
		
		 String[] parola= {"ciao","ala","miao","albero"};
		 
		 /*
		 for (int i = 0; i < parola.length; i++) {
			if(parola[i].charAt(0) == 'a' );
			 lett++;
			 
			
		}
		System.out.println(lett);
		*/
		 
		 for (int i = 0; i < parola.length; i++) {
			 String temp= parola[i];
			 
			 if(parola[i].charAt(0) == 'a' );
			 lett++;
			
		}
		 System.err.println("NUMERO LETTERE "+lett);
	}

}
