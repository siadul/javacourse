package gui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.HashSet;
import java.util.Set;

public class Bindings1Zadanie extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Zadanie1a
        // Stworzyć panel.
        // Dodać do niego pole tekstowe.
        // Dodać etykietę.
        // Przy każdym wpisywaniu nowego znaku
        // sprawdzać czy znak jest literą:
        // jeżeli tak to dodawać do etykiety
        // jeżeli wpisano znak '$' kończyć
        // działanie programu.

        // Zadanie1b
        // W etykiecie wypisywać wszystkie unikalne literki wpisane w polu tekstowym
        VBox vbox = new VBox();
        TextField textfield1 = new TextField();
        Label label1 = new Label();
        Set<Character> set = new HashSet<Character>();
        textfield1.textProperty().addListener((observable, oldValue, newValue) -> {
            if(oldValue.length() < newValue.length()) {
                char newchar = newValue.charAt(newValue.length() - 1);
                if(Character.isLetter(newchar)) {
//                    label1.setText(label1.getText() + newchar);
                    set.add(newchar);
                    label1.setText(set.toString());
                }
                if('$' == newchar) {
                    Platform.exit();
                }
            }
        });

        vbox.getChildren().addAll(textfield1, label1);
        Scene scene = new Scene(vbox, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle(this.getClass().getName());
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
