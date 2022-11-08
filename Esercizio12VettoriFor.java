package lezione7Adecco2Set;
/*
 * dato un vattore di boolean 
 * contare quanti vettori true e quanti false
 * 
 * 
 * 
 */

public class Esercizio12VettoriFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vero=0;
		
		int falso=0;
		
		Boolean[] vett= {true, false , true };
		
		for (int i = 0; i < vett.length; i++) {
			if(vett[i]) {
				
					
				vero++;
		}
			else {
				
				falso++;
			}
			System.out.println("false-->"+falso);
			System.out.println("true--->"+vero);
		}

	}

}
