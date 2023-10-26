package temados.ejercicios;

import java.util.StringTokenizer;

public class Ejecicio2_6 {
	public static void main(String[] args) {
		/*Modifica la plantilla Java que hay en los recursos de este tema para que dada la siguiente cadena 
		 * de caracteres "T C A Q K A C T P P P P P P P P", que representan nombre de piezas del ajedrez:

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

			TCAKQACT*/
		
		String cadena = "T C A Q K A C T P P P P P P P P";
		StringTokenizer st = new StringTokenizer(cadena);
		String figuras = st.nextToken() + st.nextToken() + st.nextToken() + st.nextToken() +st.nextToken()
		+ st.nextToken() + st.nextToken() + st.nextToken();
		String peones = st.nextToken() + st.nextToken() + st.nextToken() + st.nextToken() +st.nextToken() 
		+ st.nextToken() + st.nextToken() + st.nextToken();
		
		System.out.println(figuras + "\n\n" + peones + "\n\n\n\n" + peones + "\n\n" + figuras);
		
	}

}
