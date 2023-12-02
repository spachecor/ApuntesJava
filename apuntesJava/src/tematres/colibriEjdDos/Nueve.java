package tematres.colibriEjdDos;
/**
 * Programa que muestra todos los números del 100 al 0 de 7 en 7
 * @author selenepachecorodriguez
 * @version 1.0
 */
public class Nueve {

	public static void main(String[] args) {
		//se inicializa la variable cien con 100
		int cien =100;
		do {
			//se imprime el valor de 100
			System.out.println(cien);
			//se resta 7 a 100
			cien-=7;
			//se comprueba que cien > 0 y se sale o se vuelve a repetir según resulte
		}while(cien>0);
		//se finaliza imprimiendo que es el fin
		System.out.println("Programa finalizado");
	}

}
