package temacinco.ejerciciosficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EjercicioUno {
    public static void main(String[] args) {
        /*Escribe un programa que guarde en un fichero con nombre primos.dat los numeros primos que hay entre 1 y 500*/
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(System.getProperty("user.dir")+"/apuntesJava/src/temacinco/ejerciciosficheros/ficheros/ejercicioUno.dat", false));
            for(int i=1;i<=500; i++){
                if(EjercicioUno.numerosPrimos(i))bw.write(i+"\n");
            }
            bw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static boolean numerosPrimos(int n){
        for(int j=2;j<n;j++){
            if(n%j==0)return false;
        }
        return true;
    }
}
