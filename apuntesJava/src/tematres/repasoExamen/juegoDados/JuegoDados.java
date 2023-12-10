package tematres.repasoExamen.juegoDados;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Programa que es un juego de dados. Dos jugadores lanzan sus dados pulsando el boton que se indica y gana el que mayor puntuación obtenga.
 * No es posible empatar.
 * @see EmpateException
 * @author selene
 * @version 1.0
 */
public class JuegoDados {
    public static void main(String[] args) throws EmpateException, SecurityException, IOException {
        /*Solo pueden jugar dos personas, a las que antes de jugar se les preguntará el nombre, en cada jugada se utilizan 2 dados
         * (as=6, k=5, q=4, j=3, rojos=2, negros=1). Gana el jugador que consigue la mayor puntuación. Si se produce un empate se
         * lanzará una Excepción no comprobada en la que se mostrará como mensaje 'Se ha producido un empate, ambos jugadores han
         * obtenido ... puntos'. El programa debe dejar en dicho caso que se vuelva a realizar las dos tiradas de dados. Cada vez
         * que se produzca la excepción el programa debe hacer que los jugadores vuelvan tirar los dados. El programa termina cuando
         * uno de los dos jugadores gana.

         * Se debe introducir un trazador para depurar el funcionamiento del programa, de manera que se almacenarán en un fichero
         * todas las puntuaciones obtenidas por los jugadores en cada jugada, el nombre de cada jugador, el momento de la jugada
         * (fecha y hora) y la duración de la jugada (tiempo en milisegundos hasta que la jugada termina). Cada vez que los jugadores
         * empatan en una tirada se mostrará el mensaje de la excepción correspondiente en consola.*/

        //se declaran, asignan e inicializan todas las variables necesarias
        String jugadorUno, jugadorDos;
        int dadoUno, dadoDos, puntosUno, puntosDos;
        long tiempoUno, finTiempoUno, tiempoDos, finTiempoDos;
        final int MAX=6, MIN=1;
        String[] figuras = {"Negro", "Rojo", "J", "Q", "K", "As"};
        //creamos un formateador para la fecha y hora del logger
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        //incorporamos el trazador
        //inicializamos el logger
        Logger logger = Logger.getLogger(JuegoDados.class.getName());
        //declaramos nuestro nuevo trazador de archivo
        FileHandler fileHandler;
        //declaramos nuestro nuevo trazador de consola
        ConsoleHandler consoleHandler;
        try{
            //asignamos nuestro trazador de archivo
            fileHandler = new FileHandler("logs.txt");
            //desactivamos el handler por defecto
            logger.setUseParentHandlers(false);
            //añadimos nuestro nuevo manejador
            logger.addHandler(fileHandler);
            //asignamos nuestro trazador de consola
            consoleHandler = new ConsoleHandler();
            //añadimos nuestro nuevo manejador
            logger.addHandler(consoleHandler);
            //asignamos niveles
            consoleHandler.setLevel(Level.WARNING);
            fileHandler.setLevel(Level.INFO);
        }catch(SecurityException | IOException e) {
            e.printStackTrace();
        }
        //se abre el flujo de entrada
        Scanner sc = new Scanner(System.in);
        //se solicitan y recojen el nombre de cada jugador
        System.out.println("Bienvenidos al juego. \nJugador 1, ¿cuál es tu nombre?");
        jugadorUno = sc.next();
        System.out.println("Bienvenido "+jugadorUno);
        System.out.println("Jugador 2, ¿cuál es tu nombre?");
        jugadorDos = sc.next();
        System.out.println("Bienvenido "+jugadorDos);
        do {
            //Comienza el turno del jugador 1
            System.out.println(jugadorUno+" es tu turno, pulsa 0 + Intro para tirar los dados");
            sc.next();
            tiempoUno=System.currentTimeMillis();
            //se generan aleatoriamente los valores de cada dado entre 1 y 6
            dadoUno = (int)Math.round(Math.random()*(MAX-MIN+1)+MIN);
            dadoDos = (int)Math.round(Math.random()*(MAX-MIN+1)+MIN);
            //se suman los valores para obneter los resultados
            puntosUno = dadoUno+dadoDos;
            //se muestran los resultados
            System.out.println(String.format("%s, sacaste %s y %s, un total del %d puntos", jugadorUno, figuras[dadoUno-1], figuras[dadoDos-1], puntosUno));
            finTiempoUno=System.currentTimeMillis();
            logger.info(jugadorUno+" ha sacado "+figuras[dadoUno-1]+" y "+figuras[dadoDos-1]+", en total "+puntosUno+". Su jugada ha tardado "
                    +(finTiempoUno-tiempoUno)+" milisegundos. Jugada en fecha y hora: "+ LocalDateTime.now().format(formateador));
            //se repite el proceso con el jugador 2
            System.out.println(jugadorDos+" es tu turno, pulsa 0 + Intro para tirar los dados");
            sc.next();
            tiempoDos=System.currentTimeMillis();
            dadoUno = (int)Math.round(Math.random()*(MAX-MIN+1)+MIN);
            dadoDos = (int)Math.round(Math.random()*(MAX-MIN+1)+MIN);
            puntosDos = dadoUno+dadoDos;
            System.out.println(String.format("%s, sacaste %s y %s, un total del %d puntos", jugadorDos, figuras[dadoUno-1], figuras[dadoDos-1], puntosDos));
            finTiempoDos=System.currentTimeMillis();
            logger.info(jugadorDos+" ha sacado "+figuras[dadoUno-1]+" y "+figuras[dadoDos-1]+", en total "+puntosDos+". Su jugada ha tardado "
                    +(finTiempoDos-tiempoDos)+" milisegundos. Jugada en fecha y hora: "+ LocalDateTime.now().format(formateador));
            //si hay un empate, se produce una excepcion no comprobada
            try {
                //lanzamos la excepción si empatan
                if(puntosUno==puntosDos)throw new EmpateException("Se ha producido un empate, ambos jugadores han obtenido"+puntosUno+"puntos");
                //la capturamos, ofrecemos un mensaje y seguimos
            }catch(EmpateException e) {
                System.out.println("Se ha producido un empate, ambos jugadores han obtenido "+puntosUno+" puntos, pulsa 0 + Intro para volver a tirar.");
                sc.next();
            }
            //si ambas puntuaciones son iguales, no saldrá del bucle
        }while(puntosUno==puntosDos);
        //se comprueba quien tiene mayor puntuación, el que la tenga, habrá ganado
        if(puntosUno>puntosDos)System.out.println("Gana "+jugadorUno+" con "+puntosUno+" puntos.");
        else System.out.println("Gana "+jugadorDos+" con "+puntosDos+" puntos.");





        sc.close();
    }
}
