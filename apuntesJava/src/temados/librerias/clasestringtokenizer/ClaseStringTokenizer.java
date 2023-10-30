package temados.librerias.clasestringtokenizer;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class ClaseStringTokenizer {
	public static void main(String[] args) {
		
		//CONSTRUCTORES
		
		//1º forma: construye un objeto tipo StringTokenizer a partir de la cadena que se pasa como parámetro
		StringTokenizer st1 = new StringTokenizer("T C A Q K A C T P P P P P P P P");
		
		//2º forma: igual que el anterior pero indicando la cadena que se usará como delimitador
		StringTokenizer st2 = new StringTokenizer("P P P P P P P P T C A Q K A C T", " ");
		
		//3º forma: igual que el anterior pero indicando si se tienen en cuenta como tokens los delimitadores
		StringTokenizer st3 = new StringTokenizer("P P P P P P P P", " ", true);
		
		/*------------------------------------------------------------------------------------------*/
		
		//MÉTODOS
		
		//.countTokens() - Devuelve un int
		//Devuelve el nº de tokens de la cadena
		
		int nTokens1 = st1.countTokens();//Muestra 16
		int nTokens2 = st3.countTokens();//Muestra 15(cuenta los espacios como si tmb fuesen tokens)
		
		/*------------------------------------------------------------------------------------------*/
		
		//.hasmoreTokens() - Devuelve un boolean
		//Comprueba si hay más tokens que extraer
		
		boolean comp = st1.hasMoreTokens();//Muestra true
		
		/*------------------------------------------------------------------------------------------*/
		
		//.nextToken() - Devuelve un String
		//Devuelve el siguiente token de la cadena
		
		String str1 = st1.nextToken();//Muestra T
		String str2 = st1.nextToken();//Muestra C
		
		/*------------------------------------------------------------------------------------------*/
		
		//.nextToken(String delimitador) - Devuelve un String
		//Devuelve el siguiente token de la cadena utilizando como delimitador el indicado como parámetro
		
		//Para este ejemplo, vamos a mezclar StringJoiner con StringTokenizer
		
		//instanciamos un objeto StringJoiner fijando el separador, el prefijo de la cadena y el final
		StringJoiner sj1 = new StringJoiner(",", "(", ")");
		
		//instanciamos otro objeto StringJoiner similar pero con sólo el separador y que éste sea diferente
		StringJoiner sj2 = new StringJoiner("-");
		
		//Agregamos contenido a ambos objetos StringJoiner
		
		sj1.add("Luna");
		sj1.add("Marte");
		sj1.add("Sol");
		sj1.add("Estrella");
		sj1.add("Tierra");
		
		sj2.add("Lucía");
		sj2.add("Marta");
		sj2.add("Amelia");
		sj2.add("Sara");
		
		//Unimos ambas cadenas y las convertimos en String
		
		String alFin = sj1.merge(sj2).toString();
		
		//Introducimos nuestro String en un StringTokenizer y le decimos que los delimitadores son la ","
		
		StringTokenizer fin = new StringTokenizer(alFin, ",");
		
		//Empezamos a sacar Tokens hasta que lleguemos hasta los que van con "-"
		
		String uno = fin.nextToken();//muestra Luna
		String dos = fin.nextToken();//muestra Marte
		String tres = fin.nextToken();//Muestra Sol
		String cuatro = fin.nextToken();//Muestra Estrella
		String cinco = fin.nextToken();//Muestra Tierra
		
		//String seis = fin.nextToken();//Mostraría Lucía-Marta-Amelia-Sara)
		//¿CÓMO EVITARLO?
		
		String seis = fin.nextToken("-");//Muestra ,Lucía
		String siete = fin.nextToken("-");//Muestra Marta
		String ocho = fin.nextToken("-");//Muestra Amelia
		String nueve = fin.nextToken("-");//Muestra Sara)
		
	}
}
