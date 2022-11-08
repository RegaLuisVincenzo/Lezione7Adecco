package lezione7Adecco2Set;
/*
 * VETTORI == ARRAY
 * RICORDO CHE IL VETTORE è UN INSIEME DI CASELLE TUTTE UNITE 
 * IN OGNI VETTORE COSTITUISCE DEI OGGETTI 
 * N=1 INDICA LE POSIZIONE DEI ELEMENTI ALL'INTERNO DI OGNI CASELLA 
 * 
 * COME SI CREARE AUN VETTORE 
 * 
 * tipoVettore[] nomeVettore = tipoVettore[DIMENTIONE(viene inserita una volta)]
 * 
 * 
 * 
 */



public class Esercizio1Vettori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Abbiamo dichiarato il nostro vettore formato con 10 caselle 
		int[]vettint= new int[10];
		
		//adesso andiamo a stampare gli elementi del vettore 
		/*
		 * System.out.println(vettint[9]);
		 * System.out.println(vettint[8]);
		 */
		// ANDIAMO A STAMPARE A CICLO CON IL WHILE 
		
		int index=0;
		//ANDIAMO A INSERIERE DEI VALORI AI VATTORI 
		
		 vettint[0]=8;// nella casella 0 abbiamo inserito  il valore 8
		 vettint[1]=16;
		 vettint[2]=24;
		
		while(index<vettint.length){
			
			System.out.println(vettint[index]);
			
			index++;
		}

	}

}
