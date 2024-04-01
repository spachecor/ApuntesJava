package temacinco.claseFile;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EjercicioFile {
    public static void main(String[] args) {//ESTÁ MAL
        /*¿Cómo lo harías si quisieras listar una carpeta tanto sus archivos como los archivos de sus subcarpetas*/

        //imprimimos to lo contenido en la carpeta /home/Selene, para ello, lo ponemos en un array de tipo String con el método .list
        File file = new File(System.getProperty("user.home"));
        String[] files1 = file.list();
        if(files1.length>0){
            for (String string : files1) {
                System.out.println(string);
            }
        }

        System.out.println("----------------------------------------------");
        //ahora con el método .listFiles() creamos un array de tipo File, y luego, mientras lo recorremos, comprobamos
        // si es o no el File un directorio
        File[] files2 = file.listFiles();
        int contador = 0;
        if(files2.length>0){
            for(File f:files2){
                System.out.println(f.getName());
                if(f.isDirectory()){
                    System.out.println("Contenido del directorio: ");
                    File[] contenido = f.listFiles();
                    for(File fi:contenido){
                        System.out.println(fi.getName());
                    }
                }
                System.out.println("---");
            }
        }
        System.out.println("----------------------------");
    }
}