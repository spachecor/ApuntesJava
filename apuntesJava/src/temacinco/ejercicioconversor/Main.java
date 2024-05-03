package temacinco.ejercicioconversor;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringBinding;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import java.util.Objects;


public class Main extends Application {
    public void start(Stage stage){
        //creamos el label y el textfield, donde introduciremos la cantidad a convertir
        Label eurosLabel = new Label("Euros: ");
        TextField cantidadConvertir = new TextField();

        //creamos el objeto para hacer el bind
        SimpleDoubleProperty eurosBind = new SimpleDoubleProperty();
        //usamos un listener para ir cambiando el valor según se seleccione
        cantidadConvertir.textProperty().addListener((observable, oldValue, newValue) -> {
            try {
                //si no se mete correctamente el valor, salta excepción
                eurosBind.set(Double.parseDouble(newValue));
            } catch (NumberFormatException ex) {
                System.out.println("Error, revise lo introducido");
            }
        });

        //creamos un objeto de tipo combobox para tener un desplegable con los diferentes tipos de moneda
        ComboBox<String> desplegable = new ComboBox<>(FXCollections.observableArrayList("Dólares", "Libras","Liras","Bolívar Venezolano"));
        //damos un valor inicial
        desplegable.setValue("Dólares");
        SimpleDoubleProperty conversion = new SimpleDoubleProperty(1.07);

        //según la opción elegida, cambiamos el valor de la conversión
        desplegable.valueProperty().addListener((obs, oldVal, newVal) -> {
            switch (newVal) {
                case "Dólares":
                    conversion.set(1.07);
                    break;
                case "Libras":
                    conversion.set(0.85);
                    break;
                case "Liras":
                    conversion.set(34.79);
                    break;
                case "Bolívar Venezolano":
                    conversion.set(38.83);
                    break;

            }
        });

        //tomamos el resultado según lo introducido
        StringBinding resultado = Bindings.createStringBinding(() -> String.format("En %s: %.2f", desplegable.getValue(), eurosBind.get() * conversion.get()), eurosBind, conversion, desplegable.valueProperty());

        //creamos el label para el resultado y le asignamos el valor
        Label resultadoConversion = new Label();
        resultadoConversion.textProperty().bind(resultado);

        //creamos el contenedor, que es un vbox para ponerlo tó horizontal
        VBox contenedor = new VBox(20, eurosLabel, cantidadConvertir, desplegable, resultadoConversion);
        contenedor.setAlignment(Pos.CENTER);
        contenedor.getStyleClass().add("ventanaPrincipal");

        //creamos la escena, vinculamos hoja de estilos y la aplicamos a la ventana
        Scene scene = new Scene(contenedor, 800,500);
        scene.getStylesheets().add(Objects.requireNonNull(this.getClass().getResource("style.css")).toExternalForm());
        stage.setScene(scene);
        //cambiamos título y mostramos
        stage.setTitle("Conversor de monedas");
        stage.show();
    }

    public static void main (String[] args){
        launch(args);
    }
}