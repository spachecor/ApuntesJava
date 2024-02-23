package temaseis;

import java.util.Scanner;

/**
 * Ejercicio de Arrays tercero. Programa java que calcula la altura media de n personas(n introducido por el usuario). Devuelve
 * cuántas personas tienen altura superior a la media y cuántas tienen altura inferior a la media
 * @author selene
 * @version 1.0
 */
public class EjercicioArraysTres {

	public static void main(String[] args) {
		//abrimos flujo de entrada
		Scanner sc = new Scanner(System.in);
		//declaramos el array de personas
		int[] personas;
		//nº de personas dentro del array
		int numero = 0, aux = 0;
		boolean comprobador = false;
		//usamos un bucle do-while para recoger el nº de personas a comparar
		do {
			System.out.println("Introduce el nº de personas para calcular la altura media: ");
			//comprobamos que el caracter introducido sea un nº
			try {
				numero = sc.nextInt();
				//si el nº no es mayor que 0, devuelve un mensaje y volverá a solicitar el nº
				if(numero<=0) System.out.println("El nº introducido es inferior o igual a 0, inténtelo de nuevo");
			}catch (RuntimeException e) {
				System.out.println("El caracter introducido no es un nº");
				//reseteamos el scanner
				sc.next();
				continue;
			}
		}while(numero<=0);
		//asignamos longitud al array
		personas = new int[numero];
		//usamos un bucle do-while para asegurar que los datos introducidos son correctos, para que siga pidiendo los nº hasta que no salten excepciones
		do {
			try {
				//usamos un bucle for para introducir manualmente la altura de las personas
				for(int i = 0;i < personas.length;i++) {
					//usamos la auxiliar altura para guardar la altura y comprobar que sea mayor que 0
					int altura;
					System.out.println(String.format("Introduce la altura de la %dº persona en centímetros: ", i));
					altura = sc.nextInt();
					//si la altura es mayor que 0 y menor a 250, se asigna, si no, se resta uno al contador y se continua
					if(altura>0&&altura<250) {
						personas[i] = altura;
					}else {
						System.out.println("Altura incorrecta, vuelva a intentarlo.");
						i--;
					}
				}
				//si el bucle termina, se han introducido valores válidos y el comprobador es true
				comprobador = true;
			}catch (RuntimeException e) {
				System.out.println("No se ha introducido un caracter correcto, vuelva a intentarlo");
			}
		}while(!comprobador);
		

		//usamos un bucle for para sumar todos los valores dentro del array
		for(int i = 0;i < personas.length;i++) {
			//sumamos en la auxiliar el valor de las alturas de las personas
			aux += personas[i];
		}
		//imprimimos la altura media, que es la suma de todas las alturas entre el nº de personas
		System.out.println("La altura media es: "+aux/numero+" centímetros.");
		
		
		//cerramos el flujo de entrada
		sc.close();
	}

}
