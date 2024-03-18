package temaseis.ejercicioexpresionesregulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase que contiene los ejercicios resueltos de la actividad 6.7
 * @author Selene
 * @version 1.0
 */
public class EjercicioSeisSiete {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Ejercicio 1 - Encuentra (find) dígitos en una cadena
        String cadena1;
        System.out.println("Introduce una cadena y encontraremos los dígitos dentro de ésta");
        cadena1 = sc.next();
        Pattern pat1 = Pattern.compile("\\d");
        Matcher mat1 = pat1.matcher(cadena1);
        while(mat1.find()){
            System.out.print(mat1.group()+" ");
        }

        //Ejercicio 2 - Cuenta el número de veces que aparece una palabra en una frase (while(matcher.find)) count++ ...
        String cadena2, palabraClave;
        int contador=0;
        System.out.println("Introduce una cadena y encontraremos la palabra.");
        cadena2 = sc.nextLine();
        System.out.println("Introduce la palabra a buscar");
        palabraClave = sc.nextLine();
        Pattern pat2 = Pattern.compile("\\b"+palabraClave+"\\b");
        Matcher mat2 = pat2.matcher(cadena2);
        while(mat2.find()){
            contador++;
        }
        System.out.println("La palabra se repite un total de "+contador+" veces");

        //Ejercicio 3 - Comprobar si una cadena dada contiene exactamente 3 letras([a-z])
        String cadena3;
        System.out.println("Introduce una cadena y comprobaremos su longitud");
        cadena3 = sc.nextLine();
        Pattern pat3 = Pattern.compile("^\\w{3}$");
        Matcher mat3 = pat3.matcher(cadena3);
        System.out.println((mat3.find())?"Se ha introducido una cadena de longitud 3":"No se ha introducido una cadena de longitud 3");

        //Ejercicio 4 - Comprobar si una cadena puede ser una URL del tipo: https://www.midominio.es.
        String cadena4;
        System.out.println("Introduce un url y comprobaremos si es válido");
        cadena4 = sc.nextLine();
        Pattern pat4 = Pattern.compile("^https://www\\.([a-zA-Z0-9-]{2,63})\\.es$|^https://www\\.([a-zA-Z0-9-]{2,64})\\.(com|org|net)$");
        Matcher mat4 = pat4.matcher(cadena4);
        System.out.println((mat4.find())?"Se ha introducido un url válido":"No se ha introducido un url válido");
        sc.close();
    }
}
