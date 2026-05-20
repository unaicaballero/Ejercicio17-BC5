package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Ejercicio 17 - Cambiar texto de etiqueta");

        // Etiqueta cuyo texto cambiara al pulsar el boton
        Label etiqueta = new Label("Texto inicial");

        // Boton que modifica el texto de la etiqueta
        Button boton = new Button("Cambiar texto");

        // setText() actualiza el texto visible en la interfaz
        boton.setOnAction(event -> etiqueta.setText("¡Texto cambiado con éxito!"));

        VBox vbox = new VBox(etiqueta, boton);
        vbox.setSpacing(15);
        vbox.setStyle("-fx-padding: 20;");

        Scene scene = new Scene(vbox, 300, 120);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}