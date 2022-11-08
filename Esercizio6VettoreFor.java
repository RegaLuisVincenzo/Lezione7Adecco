package lezione7Adecco2Set;

/**
 * 
 * 
 * Dato un vettore gia' inizializzato
 * int[] vett = {3 , 4 , 6 , 8 , 15};
 * sovrascrivere tutti gli elementi del vettore
 * moltiplicando gli elementi per 2
 * 
 * 
 * 
 * 				{ 6 , 8 , 12 , 16 , 30 }
 * 
 *  stampare il vettore
 * 
 * @author mr
 *
 */

public class Esercizio6VettoreFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int index = 0;
		
		
		int[] vett = {3 , 4 , 6 , 8 , 15};
		
		
		System.out.print(vett.length);
		
		
		for (int i = 0; i < vett.length; i++) {
			
			System.out.print(vett[i]);
			vett[i]*=2;
		}
		
		System.out.println(index);

	}

}
