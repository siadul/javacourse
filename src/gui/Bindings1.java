package gui;

import javafx.application.Application;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Bindings1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label1 = new Label();
        TextField pole1 = new TextField("Przykładowy tekst");
        pole1.textProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                System.out.println("Nie wolno zmieniać pola!");
                ObservableValue value =
                        (ObservableValue) observable;
                System.out.println("Aktualna wartość: " +
                        value.getValue()
                );
            }
        });
        pole1.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                System.out.println("Changed Listener!");
                System.out.println("Stara wartość: " + oldValue);
                System.out.println("Nowa wartość: " + newValue);
                label1.setText(newValue);
            }
        });
        pole1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("on Action!");
                label1.setText("");
                pole1.setText("");
            }
        });

        VBox root = new VBox();
        root.getChildren().add(pole1);
        root.getChildren().add(label1);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Bindings1");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
