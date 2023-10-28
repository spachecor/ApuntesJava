package temados.librerias.clasestringbuffer;

public class ClaseStringBuffer {
	public static void main(String[] args) {
		
		//CONSTRUCTORES
		
		StringBuffer const1 = new StringBuffer();
		
		//Se construye un buffer tipo string, sin caracteres y con la capacidad marcada por el parámetro
		StringBuffer const2 = new StringBuffer(7);//sin caracteres ningunos, no son espacios en blanco
		
		StringBuffer const3 = new StringBuffer("Hola Mariola");		
		
		//MÉTODOS
		//Todos los métodos (+ importantes) de la clase StringBuffer:
		
		String stringOriginal, stringFinal;
		
		//StringBuffer append(dato x) - Devuelve un StringBuffer
		//Añade al buffer la representación string del dato x que introduzcamos
		StringBuffer sb = new StringBuffer ("Nuevo StringBuffer");
		stringOriginal = sb.toString();
		sb.append(1);//con un int
		sb.append(false);//con un boolean
		sb.append("Holiwis");//con un String
		
		/*------------------------------------------------------------------------------------------*/
		
		//Char charAt(int Index) - Devuelve un char
		//Devuelve el caracter que ocupa la posición marcada por el argumento index en la secuencia
		//representada por el buffer
		char car1 = sb.charAt(6);//muestra 'S'
		
		/*------------------------------------------------------------------------------------------*/
		
		// int capacity() - Devuelve un int
		//Devuelve la capacidad potencial (total) del buffer
		int num1 = sb.capacity();//muestra 34
		
		/*------------------------------------------------------------------------------------------*/
		
		//StringBuffer delete (int start, int end) - Devuelve un StringBuffer
		//Elimina del buffer los caracteres indicados (mantiene la capacidad potencial)
		sb.delete(2, 4);//Muestra Nuo StringBuffer1falseHoliwis, antes mostraba Nuevo StringBuffer1falseHoliwis
		
		/*------------------------------------------------------------------------------------------*/
		//String deleteCharAt(int index) - Devuelve un StringBuffer
		//Elimina del buffer el caracter especificado
		sb.deleteCharAt(0);//muestra uo StringBuffer1falseHoliwis
		
		/*------------------------------------------------------------------------------------------*/
		//void ensureCapacity(int minimunCapacity)
		//Asegura que la capacidad del buffer sea al menos igual al mínimo dado.
		sb.ensureCapacity(16);//No hace nada porque su capacidad, 34, es mayor que 16
		sb.ensureCapacity(36);//Aumenta la capacidad, porque 34 es inferior a 36. Ahora tendrá capacidad
								//potencial de 70, porque 34+36=70
		
		/*------------------------------------------------------------------------------------------*/
		//void getChars(int srcBegin, intsrcEng, char[] dst, int dstBegin)
		//Los caracteres se copian de este bufferstring en el array de caracteres de destino
		char[] arrayCar = new char[10];
		sb.getChars(5, 15, arrayCar, 0);//Contiene r i n g B u f f e r
		
		/*------------------------------------------------------------------------------------------*/
		//StringBuffer insert (int offset, tipo dato X) - Devuelve un StringBuffer
		//Inserta la representación del tipo de dato X en el buffer.
		sb.insert(4, "8 milloooneess de eurooooooosss");//Devuelve uo S8 milloooneess de eurooooooossstringBuffer1falseHoliwis
		sb.insert(9, '¬');//Devuelve uo S8 mil¬loooneess de eurooooooossstringBuffer1falseHoliwis
		
		/*------------------------------------------------------------------------------------------*/
		//int length() - Devuelve un int
		//Devuelve la longitud (capacidad real) (en caracteres) del buffer.
		sb.length();//Muestra 60
		
		/*------------------------------------------------------------------------------------------*/
		//StringBuffer replace(int start, int end, String str) - Devuelve un StringBuffer
		//Reemplaza los caracteres del substring del buffer con los caracteres del string dado
		sb.replace(3, 5, " OLA K ASE ");//Muestra uo  OLA K ASE  mil¬loooneess de eurooooooossstringBuffer1falseHoliwis
		
		/*------------------------------------------------------------------------------------------*/
		//StringBuffer reverse() - Devuelve un StringBuffer
		//La secuencia de caracteres del buffer es reemplazado por su inversa
		sb.reverse();//Muestra siwiloHeslaf1reffuBgnirtsssooooooorue ed sseenoool¬lim  ESA K ALO  ou
		
		/*------------------------------------------------------------------------------------------*/
		//void setCharAt(int index, char ch)
		//El caracter del buffer que ocupa la posición dada por el índice se cambia por el marcado en
		//el segundo argumento
		sb.setCharAt(0, '0'); //Muestra 0iwiloHeslaf1reffuBgnirtsssooooooorue ed sseenoool¬lim  ESA K ALO  ou
		
		/*------------------------------------------------------------------------------------------*/
		//void setLength(int newLength)
		//Establece la longitud del string
		sb.setLength(90);
		/* Podemos ver que ha pasado de tener una capacidad real y potencial de 69 a una capacidad 
		 * real de 90 y una potencial de 141*/
		
		/*------------------------------------------------------------------------------------------*/
		//String substring(int start)/(int start, int length) - Devuelve un int
		//Produce una nueva cadena que contiene una subsecuencia de caracteres actualmente contenida
		//en el buffer
		String str = sb.substring(4, 10);//Muestra loHesl
		
		/*------------------------------------------------------------------------------------------*/
		//StringBuffer trimToSize() - Devuelve un StringBuffer
		//Devuelve el mismo buffer, pero optimizado, eliminando los espacios vacíos.
		sb.trimToSize();//Su capacidad real=capacidad potencial=90
		
		/*------------------------------------------------------------------------------------------*/
		//String toString() - Devuelve un String
		//Convierte los datos del buffer a un String
		stringFinal = sb.toString();
		//El String contiene 0iwiloHeslaf1reffuBgnirtsssooooooorue ed sseenoool¬lim  ESA K ALO  ou;		
		


	}

}
