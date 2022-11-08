package lezione7Adecco2Set;



/*
 * 
 * DATO UN VETTORE 
 * vett={10, 2, 40 , 50}
 * 
 * sommare solamente gli elementi che si trovano in posizione pari
 * 
 * 
 * 
 * 
 */

public class Esercizio10VettoreFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vett = {10, 2, 40 , 50};
		
		int sommPari;
		sommPari=0;
		
		for (int i = 0; i < vett.length; i++) {
			if(i%2==0) {
				System.out.println("somma pari"+vett[i]);
				sommPari+=vett[i];
				i++;
			}
			
		}
		System.out.println(sommPari);
	}

}
