package temados.examen;

public class RepasoPreExamen {

	public static void main(String[] args) {
		//Escribir un programa Java que solicite una cadena de caracteres 
				//y la devuelva invertida con efecto espejo, esto es, se concatena a la palabra 
				//original su inversa, compartiendo la última letra, que hará de espejo, 
				//por lo que la palabra obtenida se lee igual hacia adelante que hacia atrás.
				//La palabra debe empezar con mayúsculas y terminar en mayúsculas, 
				//los demás caracteres deben estar en minúsculas. (5 puntos, ce: b,c,d,h)
				//Ejemplo: HolaloH
				 Scanner sc = new Scanner(System.in);
				 //Pedimos la palabra por consola 
			        System.out.print("Ingrese una palabra: ");
			        String palabra = sc.nextLine();
			        //Le damos la vuelta a la palabra 
			        String palabraInvertida = new StringBuilder(palabra).reverse().toString();
			        //Ponemos la palabra en minuscula
			        String letraMinuscula = palabra.toLowerCase();
			        //Ponemos la primera letra en mayuscula
			        String letraMayuscula = palabra.substring(0,1).toUpperCase()+palabra.substring(1);
			        //Se pide la longitud de la palabra 
			        int l = palabra.length();
			        //Le asignamos la ultima letra en mayuscula
			        String palabra1 = palabra.substring(0, l-1) + palabra.substring(l-1).toUpperCase();
			        System.out.println(palabra + palabraInvertida.substring(1));
	}

}
