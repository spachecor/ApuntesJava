package temaseis.ejercicioexpresionesregulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjercicioTresSiete {
    public static void main(String[] args){

    /*Escribe un programa que pueda probar expresiones regulares que satisfagan los siguientes casos (entre paréntesis tenéis pistas para
    la solución):

    1- Encuentra (find) dígitos en una cadena
    2- Cuenta el número de veces que aparece una palabra en una frase (while(matcher.find)) count++ ...
    3- Comprobar si una cadena dada contiene exactamente 3 letras([a-z])
    4- Comprobar si una cadena puede ser una URL del tipo: https://www.midominio.es. Sabiendo lo siguiente sobre 'midominio':
    Los únicos caracteres permitidos para un nombre de dominio son:

    Los pertenecientes al alfabeto inglés: de la a a la z.
    Los dígitos del 0 al 9 (No es aconsejable un nombre con sólo dígitos).
    El guión: - (No puede ser ni el primero ni el último carácter del nombre).
    No se admiten: acentos, diéresis, la ñ, la ç, espacios en blanco, el punto, etc.
    No hay distinción entre minúsculas y mayúsculas.
    Las longitudes máximas y mínimas de un nombre de dominio son:
    Para los gTLD .com, .org, .net, hay un máximo de 64 y un mínimo de 2.
    Para el TLD ISO-3166 .es: como máximo 63 y como mínimo 3.
    Para los restantes TLD ISO-3166 depende del registro.
    Ejemplos de nombres de dominio:

    · Correctos: midominio123, 123midominio, mi-dominio

    · Incorrectos: -midominio, mi dominio, mi&dominio, másdominios, mi.dominio*/
        //Ejercicio 1 - Encuentra (find) dígitos en una cadena
        Scanner sc = new Scanner(System.in);
        String cadena1;
        System.out.println("Introduce una cadena y encontraremos los dígitos dentro de ésta");
        cadena1 = sc.next();
        Pattern pat1 = Pattern.compile("\\d");
        Matcher mat1 = pat1.matcher(cadena1);
        while(mat1.find()){
            System.out.print(mat1.group()+" ");
        }
    }

    //Ejercicio 2 - Cuenta el número de veces que aparece una palabra en una frase (while(matcher.find)) count++ ...
    


}
