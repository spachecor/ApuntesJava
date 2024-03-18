package temaseis.ejercicioexpresionesregulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase que contiene los ejercicios de la actividadb 6.11
 * @author Selene
 * @version 1.0
 */
public class EjercicicioSeisTrece {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Ejercicio 1 - Recibe una cadena de caracteres y devuelve true si la cadena es exactamente la palabra "true"
        String cadena1;
        System.out.println("Introduce una cadena y comprobaremos si es exactamente true");
        cadena1 = sc.nextLine();
        Pattern pat1 = Pattern.compile("^true$");
        Matcher mat1 = pat1.matcher(cadena1);
        System.out.println(mat1.matches());

        //Ejercicio 2 - Recibe una cadena de caracteres y devuelve true si la cadena es: "True", "true" o "TRUE"
        String cadena2;
        System.out.println("Introduce una cadena y comprobaremos si es True, true o TRUE");
        cadena2 = sc.nextLine();
        Pattern pat2 = Pattern.compile("^(True|true|TRUE)$");
        Matcher mat2 = pat2.matcher(cadena2);
        System.out.println(mat2.matches());

        //Ejercicio 3 - Recibe una cadena de caracteres y devuelve true la cadena contiene tres caracteres
        String cadena3;
        System.out.println("Introduce una cadena y comprobaremos que mida exactamente 3 caracteres");
        cadena3 = sc.nextLine();
        Pattern pat3 = Pattern.compile("^\\w{3}$");
        Matcher mat3 = pat3.matcher(cadena3);
        System.out.println(mat3.matches());

        //Ejercicio 4 - Recibe una cadena de caracteres y devuelve true si la cadena contiene algún carácter menos la "b"
        String cadena4;
        System.out.println("Introduce una cadena y comprobaremos si contiene la b");
        cadena4 = sc.nextLine();
        Pattern pat4 = Pattern.compile("b");
        Matcher mat4 = pat4.matcher(cadena4);
        if(mat4.find()) System.out.println("Cotiene la b");
        else System.out.println("No contiene la b");

        //Ejercicio 5 - Recibe una cadena de caracteres y devuelve true si la cadena contiene un número menor de 200
        String cadena5;
        System.out.println("Introduce una cadena y comprobaremos si es un número menor a 200");
        cadena5 = sc.nextLine();
        Pattern pat5 = Pattern.compile("^[0|1]?[0-9]?[0-9]$");
        Matcher mat5 = pat5.matcher(cadena5);
        if(mat5.matches()) System.out.println("Es menor a 200");
        else System.out.println("Es mayor o igual a 200, o no es numérico");
    }
}
