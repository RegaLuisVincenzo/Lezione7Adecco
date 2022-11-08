package lezione7Adecco2Set;
/*
 * 
 *dato un vettore 
 *
 * {10, 50 ,60 ,2}
 * stampare al contrario il vettore 
 * con ciclo ..
 * 
 * 
 */

public class Esercizio9VettoreFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vett = { 10, 50, 100, 1, 4 };
		
//-----INVERTIAMO L'ORDINE
		for (int i = vett.length-1 ;i>=0 ; i--) {
			System.out.print(vett[i]+"-->");
		}

	}

}
