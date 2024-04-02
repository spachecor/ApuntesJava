package temacinco.buffers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EjercicioUno {
    /*Crea un método que reciba el nombre de un archivo, y un entero. El método deberá crear
el archivo y escribir ‘n’ líneas dentro. Cada línea deberá tener escrito “Esta es la línea n”,
sustituyendo ‘n’ por el número de la línea. Utiliza un buffer para realizar la escritura de
forma más eficiente*/
    public static void main(String[] args) {
        String nombreArchivo = "archivo.txt";
        EjercicioUno.esritor(nombreArchivo, 4);
    }
    public static void esritor(String nombreArchivo, int entero){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo, true));
            for(int i=0;i<entero;i++){
                bw.write("Nombre de linea "+i);
                bw.newLine();
            }
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
