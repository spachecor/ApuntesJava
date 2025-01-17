package temacinco.interfazgrafica;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EjercicioLayuot extends Application{
    /*Supongamos que quieres tener una barra de botones en la parte superior
y un área principal debajo de ella. Podrías usar un VBox como layout
principal y añadir un HBox para la barra de botones y un StackPane (o
cualquier otro layout) para el área principal*/

    public static void main(String[] args) {
        /*Invocamos al método launch (de la case Application)
        Inicializa al entorno de JavaFX y llama al método start
        Como puede aceptar argumentos, se le suele poner como parámetros el arrray de string args, pero podemos no ponerlo*/
        Application.launch();
    }
    public void start(Stage ventanappal) {
        //1º creamos todos los nodos necesarios
        Button botonUno = new Button("Insertar");
        Button botonDos = new Button("Modificar");
        Button botonTres = new Button("Listar");
        //2º creamos un contenedor para los botones tipo hbox
        HBox contenedorBotonesSuperior = new HBox(10);
        //tomamos el hbox, sacamos sus hijos (que devuelve una observableList), y luego usamos el método add para agregar los nuevos botones
        //a la lista de hijos
        contenedorBotonesSuperior.getChildren().addAll(botonUno, botonDos, botonTres);
        contenedorBotonesSuperior.setAlignment(Pos.CENTER);//centramos
        //creamos el area del texto, contenida en otro HBox, que contendrá un texto(objeto tipo text)
        Label textoUno = new Label("Esto es una etiqueta dentro de un VBox");
        HBox contenedorTexto = new HBox();
        contenedorTexto.getChildren().add(textoUno);
        contenedorTexto.setAlignment(Pos.CENTER);//centramos
        //Creamos un objeto tipo Image
        Image imagen = new Image("/img/JavaFX_Logo.png");
        ImageView imagenView = new ImageView(imagen);
        HBox contenedorImagen = new HBox();
        contenedorImagen.getChildren().add(imagenView);
        contenedorImagen.setAlignment(Pos.CENTER);//centramos

        //creamos otros dos botones y los metemos en otro hbox
        Button botonCuatro = new Button("Borrar");
        Button botonCinco = new Button("Reiniciar");
        HBox contenedorBotonesInferior = new HBox(10);
        contenedorBotonesInferior.getChildren().addAll(botonCuatro, botonCinco);
        contenedorBotonesInferior.setAlignment(Pos.CENTER);//centramos

        //3º Creamos un VBox para introducir dentro ambos HBox
        VBox contenedorGordo = new VBox(30);
        contenedorGordo.getChildren().addAll(contenedorBotonesSuperior, contenedorTexto, contenedorImagen, contenedorBotonesInferior);
        contenedorGordo.setAlignment(Pos.CENTER);//centramos
        //4º creamos la escena
        Scene escena = new Scene(contenedorGordo, 600, 400);
        //5º introducimos la escena en la ventana ppal
        ventanappal.setScene(escena);
        //6º cambiamos el titulo
        ventanappal.setTitle("Ejemplo Layouts");
        //7º mostramos la escena
        ventanappal.show();
    }

}
