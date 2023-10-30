package temados.librerias.clasestringjoiner;

import java.util.StringJoiner;

public class ClaseStringJoiner {
	public static void main(String[] args) {
		
		//CONSTRUCTORES
		
		StringJoiner sj1 = new StringJoiner("-");//Se le agrega el delimitador de los diferentes elementos
		
		StringJoiner sj2 = new StringJoiner(",", "(", ")");//Se le agrega el delimitador, el prefijo del
															//string y el final
		
		//MÉTODOS
		
		//.add() - Devuelve un StringJoiner
		//Añade nuevos valores al StringJoiner
		
		sj2.add("Mercedes");//Muestra (Mercedes)
		sj2.add("Mario");//Muestra (Mercedes,Mario)
		sj2.add("Manolo");//Muestra (Mercedes,Mario,Manolo)
		
		/*------------------------------------------------------------------------------------------*/
		
		//.length() - Devuelve un int
		//Muestra la longitud del String representado en el StringJoiner
		
		int longitud = sj2.length();//Muestra 23
		
		/*------------------------------------------------------------------------------------------*/
		
		//.merge() - Devuelve un StringJoiner
		//Une dos StringJoiner
		
		sj1.add("Luna");
		sj1.add("Marte");
		sj1.add("Venus");
		sj1.add("Tierra");
		StringJoiner sj3 = sj2.merge(sj1);
		
		/*------------------------------------------------------------------------------------------*/
		
		//.setEmptyValue() - Devuelve un StringJoiner
		//Si el StringJoiner está vacío, le asigna el valor introducido por parámetro, si está lleno, 
		//cambia su valor al nuevo valor introducido por parámetro
		
		StringJoiner sj4 = new StringJoiner(" ");
		System.out.println("Este StringJoiner está vacío? " + sj4);//No muestra nada porque está vacío
		System.out.println(sj4.setEmptyValue("Ya no estoy vacío"));//Al estar vacío, le asigna el valor 
																	//introducido por parámetro
		System.out.println(sj4);//Podemos comprobar que ahora ese es su nuevo valor
		System.out.println(sj4.setEmptyValue("Ja ja ja ja"));//Si contiene algo, sustituye su valor por el
															//nuevo introducido por parámetro
		System.out.println(sj4);//Podemos comprobar el nuevo valor
		
		/*------------------------------------------------------------------------------------------*/
		
		//.toString() - Devuelve un String
		//Devuelve el valor del StringJoiner en String
		
		String sjCambiao = sj3.toString();
		System.out.println(sjCambiao);
		
		
	}

}
