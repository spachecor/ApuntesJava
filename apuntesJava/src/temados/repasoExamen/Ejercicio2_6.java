package temados.repasoExamen;

import java.util.StringTokenizer;

public class Ejercicio2_6 {

	public static void main(String[] args) {
		/* Modifica la plantilla Java que hay en los recursos de este tema para que dada la siguiente 
		 * cadena de caracteres "T C A Q K A C T P P P P P P P P", que representan nombre de piezas del 
		 * ajedrez:

		T: torre

		C: caballo

		A: álfil

		Q: reina

		K: rey

		P: peón

		Trocear la cadena utilizando StringTokenizer para que se muestre un tablero de ajedrez de la 
		siguiente forma:

		TCAQKACT

		PPPPPPPPP



		PPPPPPPPP

		TCAKQACT
		 * */
		
		StringTokenizer st = new StringTokenizer("T C A Q K A C T P P P P P P P P");
		StringBuilder figuras = new StringBuilder(st.nextToken().concat(st.nextToken())
				.concat(st.nextToken()).concat(st.nextToken()).concat(st.nextToken())
				.concat(st.nextToken()).concat(st.nextToken()).concat(st.nextToken()));
		StringBuilder peones = new StringBuilder(st.nextToken().concat(st.nextToken())
				.concat(st.nextToken()).concat(st.nextToken()).concat(st.nextToken())
				.concat(st.nextToken()).concat(st.nextToken()).concat(st.nextToken()));
		System.out.println(figuras + "\n" + peones + "\n\n\n\n" + peones + "\n" + figuras.reverse());
	}

}
