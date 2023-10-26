package temados.librerias.clasestring;

public class ClaseString {

	public static void main(String[] args) {
		String string1 = "Hola Mundo", string2 = "hola mundo";
		char array[] = {'M','i', ' ', 'n', 'o', 'm', 'b', 'r', 'e', ' ', 'e', 's', ' ', 'M', 'a',
				 'r', 'í', 'a', '.'};
		//Todos los métodos (+ importantes) de la clase String.
		
		//charAt(int index) - duelve un tipo de dato char
		//Devuelve el caracter del índice específicado
		char caracter1 = string1.charAt(1); //Obtendríamos 'o'
		
		/*------------------------------------------------------------------------------------------*/
		
		//comparteTo(String otraCadena) - devuelve un entero
		//Compara esta cadena con el objeto formado.
		/* Este método Java devuelve un tipo de datos int que se basa en la comparación lexicográfica
		 * entre dos cadenas.
		 * 	- devuelve <0, entonces la cadena que llama al método es primero lexicográficamente
			- devuelve == 0 entonces las dos cadenas son lexicográficamente equivalentes
			- devuelve> 0, entonces el parámetro pasado al método compareTo es lexicográficamente el
			primero.*/
		int num1 = string1.compareTo(string2); //Obtendríamos -32
		/* ¿CUÁNDO SE USA?
		 * CompareTo () se utiliza para comparar dos cadenas lexicográficamente. Cada carácter de
		 * ambas cadenas se convierte en un valor Unicode. Sin embargo, si ambas cadenas son iguales,
		 * este método devuelve 0 sino que solo da como resultado un valor negativo o positivo.
		 * En este método, si la primera cadena siempre es lexicográficamente más alta que la segunda cadena, devuelve un número positivo.
		 * 
		 * - si a1> a2, devuelve un número negativo
		 * - si a1 <a2, devuelve un número positivo
		 * - si a1 == a2, devuelve 0 */
		
		/*------------------------------------------------------------------------------------------*/
		
		//compareToIgnoreCase(String str) - Devuelve un entero
		//Igual que el anterior, sólo que no tiene en cuenta mayúsculas o minúsculas.
		int num2 = string1.compareToIgnoreCase(string2); //Obtendríamos 0 (son iguales)
		
		/*------------------------------------------------------------------------------------------*/

		//concat(String str) - Devuelve una cadena
		//Une la cadena especificada al final de nuestra cadena.
		String concadenado = string1.concat(string2);//Muestra HolaMundoholamundo
		
		/*------------------------------------------------------------------------------------------*/

		//contentEquals(StringBufer sb) - Devuelve un booleano
		//Devuelve verdadero si y solo si la secuencia de caracteres es igual a la informada
		boolean comp1 = string1.contentEquals(string2);//Muestra false
		
		/*------------------------------------------------------------------------------------------*/

		//MÉTODO ESTÁTICO
		//copyValueOf(char[]data) - Devuelve una cadena
		//Devuelve una cadena que representa la secuencia de caracteres en el Array informado
		String mensaje = String.copyValueOf(array);//Muestra "Mi nombre es María."
		
		/*------------------------------------------------------------------------------------------*/
		
		//MÉTODO ESTÁTICO
		//copyValueOf(char[]data, int offset, int count) - Devuelve una cadena
		//Igual que el anterior, pero a partir del índice informado y delimitado por la cantidad 
		//informada.
		String mensaje2 = String.copyValueOf(array, 1, 7);//Muestra "i nombr"
		//Nos da una cadena que comienza por el índice que le introducimos (1º num) y con la longitud
		//que delimitamos (el último num)
		
		/*------------------------------------------------------------------------------------------*/
		
		//endsWith(String sufijo) - Devuelve un booleano
		//Chequea si la cadena termina con el sufijo especificado
		String sufijo = "o";
		boolean comp2 = string1.endsWith(sufijo);//Muestra true
		
		/*------------------------------------------------------------------------------------------*/
		
		//equals(Objeto unObjeto) - Devuelve un booleano
		//Compara la cadena con el objeto especificado
		boolean comp3 = string1.equals(string2);//Muestra false
		
		/*------------------------------------------------------------------------------------------*/
		
		//equalsIgnoreCase(String otraCadena) - Devuelve un booleano
		//Igual que el anterior pero sin tener en cuenta mayúsculas y minúsculas
		boolean com4 = string1.equalsIgnoreCase(string2);//Muestra true
		
		/*------------------------------------------------------------------------------------------*/
		
		//getBytes() / getBytes(String chraset) - Devuelve un entero (byte)
		//Codifica la cadena en una secuencia de bytes usando la charset por defecto, almacenándola
		//en un nuevo array de bytes
		byte[] cadenaCodificada1 = string1.getBytes();
		
		/*------------------------------------------------------------------------------------------*/
		
		//getChars(int inicio, int final, destino[], int inicioDestino) - Modifica el array
		//Copia caracteres de la cadena dentro de un destino de array de caracteres
		char[] carac = new char[8];//inicializamos un array cuya longitud será la diferencia de los
		//dos primeros números introducidos en el método .getChars();
		String prueba = "Bienvenidos a mi casa";
		prueba.getChars(7, 15, carac, 0); //Muestra en consola "idos a m"
		
		/*------------------------------------------------------------------------------------------*/
		
		//hashCode() - Devuelve un entero
		//Devueve el código hash de la cadena
		int hash = string1.hashCode();
				
		/*El código hash es una sucesión alfanumérica(letras y números) de longitud fija, que
		 *identifica o representa a un conjunto de datos determinados (por ejemplo, un documento,
		 *una foto, un vídeo, etc.).*/
				
		/*------------------------------------------------------------------------------------------*/
		
		//DEVUELVE UN ENTERO
		/*indexOf(char ch) - Devuelve el indice dentro de la cadena de la primera coincidencia del
		caracter especificado.*/
		int num3 = string1.indexOf('o');//Muestra 1
		
		/*indexOf(char ch, int indice) - Devuelve el indice dentro de la cadena de la primera
		 *coincidencia del caracter especificado a partir del indice especificado.*/
		int num4 = string1.indexOf('o', 2);//Muestra 9
		
		/*indexOf(String str) - Devuelve el indice dentro de la cadena de la primer coincidencia de
		 *la subcadena especificada */
		int num5 = string1.indexOf("ola");//Muestra 1
		
		/*indexOf(String str, int indice) - Devuelve el indice dentro de la cadena de la primer 
		 * coincidencia de la subcadena especificada a partir del índice informado.*/
		int num6 = string1.indexOf("ola", 2);//Muestra -1 (Significa que no hay)
		
		
		/*------------------------------------------------------------------------------------------*/
		
		//intern() - Devuelve una cadena
		//Devuelve una representación canonical de la cadena
		
		String str = string1.intern();//Muestra "Hola mundo"
		
		/*------------------------------------------------------------------------------------------*/
		
		/*lastIndexOf(char ch) - Devuelve el índice dentro de la cadena de la última ocurrencia del
		caracter especificado. */
		int num7 = string1.lastIndexOf('o');//Muestra 9
		
		/*lastIndexOf(char ch, int indice) - Devuelve el indice dentro de la cadena de la ultima 
		 * ocurrencia del caracter especificado, comenzando desde atrás a partir del indice especificado*/
		int num8 = string1.lastIndexOf('o' , 5);//Muestra 1
		
		/*lastIndexOf(String str) - Devuelve el indice dentro de la cadena de la ultima ocurrncia de
		 * la subcadena especificada*/
		int num9 = string1.lastIndexOf("Hola");//Muestra 0
		
		/*lastIndexOf(String str, int indice) - Devuelve el indice dentro de la cadena de la ultima
		 * ocurrencia de la subcadena especificada, comenzando desde atras a partir del indice especificado*/
		int num10 = string1.lastIndexOf("nd", 5);//Muestra -1
		
		/*------------------------------------------------------------------------------------------*/
		
		//length() - Devuelve un entero
		//Devuelve la cantidad de caracteres de la cadena
		int num11 = string1.length();//Muestra 10
		
		/*------------------------------------------------------------------------------------------*/
		
		//matches(String regex) - Devuelve un booleano
		//Nos dice cuando nuestra cadena coincide o no con la expresión informada
		boolean comp4 = string2.matches(string1.toLowerCase());//Muestra true
		
		/*------------------------------------------------------------------------------------------*/
		
		//regionMatches(boolean ignoreCase, intoffset, String segundaCadena, int comienzo, 
		// int longBuscado)
		//Devuelve un booleano
		//Chequea si las dos regiones de cadena son iguales
		String star1 = "Mercurio";
		String star2 = "Mer";
		int donde = star1.indexOf(star2);//Daría 0
		String msj = "Valor devuelto: ";
		boolean comp5 = star1.regionMatches(donde, star2, 0, 3);//El último num es la longitud que
																//buscamos
		
		/*------------------------------------------------------------------------------------------*/
		
		//replace(char viejo, char nuevo) - Devuelve una cadena
		//Devuelve una nueva cadena del reemplazo de todas las coincidencias del caracter viejo con el
		//caracter nuevo
		String presentacion1 = "Hola, soy impresionante";
		String presentacionMedia = presentacion1.replace('o', '0');//Muestra "H0la, s0y impresi0nante"
		
		/*------------------------------------------------------------------------------------------*/
		
		//replaceAll(String viejo, String nuevo) - Devuelve una cadena
		//reemplaza cada subcadena de la cadena que coincide con la frase informada con la de reemplazo
		String presentacionFinal = presentacion1.replaceAll("impresionante", "una kk");
		
		/*------------------------------------------------------------------------------------------*/
		
		//replaceFirst(String viejo, String nuevo) - Devuelve una cadena
		//Igual que la anterior pero con la primera que se encuentre, no todas
		String random = "k t pika bixaka";
		String nuevo = random.replaceFirst("k", "Q");
		
		/*------------------------------------------------------------------------------------------*/
		
		//split(String separador) - Devuelve un array de tipo String
		//Separa la cadena en distintas expresiones en base a la expresión informada
		String[] hello = random.split(" ");
		
		/*------------------------------------------------------------------------------------------*/
		
		//split(String separador, int limite) - Devuelve un array de tipo String
		//Separa la cadena en distintas expresiones en base a la expresion informada pero con un limite
		String[] hello2 = random.split(" ", 2);//Lo ha dividido en 2 cadenas, pues el limite es 2
		
		/*------------------------------------------------------------------------------------------*/
		
		//startsWith(String prefijo) - Devuelve un booleano
		//Chequea si la cadena comienza con el prefijo informado
		boolean comp6 = string1.startsWith("H");//Muestra true
		
		/*------------------------------------------------------------------------------------------*/
		//starsWith(String prefijo, int offset) - Devuelve un booleano
		//Igual que el anterior pero a partir de el índice introducido
		boolean comp7 = string1.startsWith(" ", 4);//Muestra true
		
		/*------------------------------------------------------------------------------------------*/
		
		//subSecuence(int inicio, int final) - Devuelve una cadena
		//Devuelve una secuencia de caracteres creada a partir del inicio y final informado
		String str2 = string1.substring(1, 3);
		
		/*------------------------------------------------------------------------------------------*/
		
		//substring(int inicio)/(int inicio, int final) - Devuelve una cadena
		//Devuelve una nueva cadena que es una subcadena de la cadena. Si lleva 2 parámetros, la 
		//subcadena que devuelve es la delimitada por el inicio y el final informados. Si lleva 1 
		//parámetro, la cadena que devuelve es aquella delimitada únicamente por el inicio dado.
		String str3 = string1.substring(5);//Muestra "Mundo"
		String str4 = string1.substring(1, 4);//Muestra "ola"
		
		/*------------------------------------------------------------------------------------------*/
		
		//toCharArray() - Devuelve un array de tipo char
		//Convierte la cadena en un array de caracteres
		char[] array2 = string1.toCharArray();
		
		/*------------------------------------------------------------------------------------------*/
		
		//toLowerCase(String str) - Devuelve una cadena
		//Convierte toda la cadena a minúsculas
		String str5 = string1.toLowerCase();
		
		/*------------------------------------------------------------------------------------------*/
		
		//toString() - Devuelve una cadena
		//Se devuelve el objeto en sí
		String str6 = string1.toString();//Muestra "Hola Mundo"
		
		/*------------------------------------------------------------------------------------------*/
		
		//toUpperCase() - Devuelve una cadena
		//Transforma la cadena en mayúsculas
		String str7 = string2.toUpperCase();//Muerta "HOLA MUNDO"
		
		/*------------------------------------------------------------------------------------------*/
		
		//trim() - Devuelve una cadena
		//Devuelve una copia de la cadena donde se omiten los espacios de delante y detrás
		String str8 = string1.trim();
		
		/*------------------------------------------------------------------------------------------*/
		
		//MÉTODO ESTÁTICO
		//valueOf(tipos de dato X) - Devuelve una cadena
		//Devuelve la representación de cadena del argumento de tipo de datos pasado
		long num12 = 990284888392L;
		String str9 = String.valueOf(num12);
		

	}

}
