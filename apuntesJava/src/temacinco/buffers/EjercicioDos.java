package temacinco.buffers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class EjercicioDos {
    /*Crea un método que reciba un archivo y devuelva la cantidad de palabras de dicho archivo.
Utiliza un buffer para realizar la lectura de forma más eficiente*/
    public static void main(String[] args) {
        String nombreArchivo = "archivo.txt";
        System.out.println(EjercicioDos.contadorPalabras(nombreArchivo)+" palabras en el archivo");
    }
    public static int contadorPalabras(String nombreArchivo){
        int contador = 0;
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(nombreArchivo));
            List<String> lista = bufferedReader.lines().toList();
            for(String string:lista){
                String[] array = string.split(" ");
                contador += array.length;
            }
            bufferedReader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return contador;
    }
    /*public static void main(String[] args) {
        String filename = "miArchivo.txt";
        int wordCount = countWords(filename);
        System.out.println("El archivo " + filename + " tiene " + wordCount + " palabras.");
    }

    public static int countWords(String filename) {
        int wordCount = 0;
        // try-with-resources
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\s+");
                wordCount += words.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordCount;
    }*/

}
