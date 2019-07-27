package gui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
//import javafx.scene.control.TextArea;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Wyszukiwarka extends Application {
    @Override
    public void start(Stage primaryStage) {
        VBox siatkaPionowaVBox = new VBox(10);
        siatkaPionowaVBox.setPadding(new Insets(5, 10, 15, 20));
        TextArea sekwencjaTextArea = new TextArea();
        sekwencjaTextArea.setWrapText(true);
        Label sekwencjaLabel = new Label();
        sekwencjaLabel.setText("Sekwencja");
        siatkaPionowaVBox.getChildren().add(sekwencjaLabel);
        siatkaPionowaVBox.getChildren().add(sekwencjaTextArea);
        HBox szukanaHBox = new HBox(10);
        Label szukanaLabel = new Label("Szukaj: ");
        TextField szukanaTextField = new TextField();
        szukanaTextField.setMinWidth(200);
        szukanaHBox.getChildren().add(szukanaLabel);
        szukanaHBox.getChildren().add(szukanaTextField);
        siatkaPionowaVBox.getChildren().add(szukanaHBox);
        Label wynikLabel = new Label("Wynik:");
        siatkaPionowaVBox.getChildren().add(wynikLabel);
        TextArea wynikTextArea = new TextArea();
        wynikTextArea.setEditable(false);
        wynikTextArea.setWrapText(true);
        siatkaPionowaVBox.getChildren().add(wynikTextArea);
        HBox buttonsHBox = new HBox(5);
        Button szukajButton = new Button("Szukaj");
        szukajButton.setOnAction(actionEvent -> {
            wynikTextArea.setText(
                    szukaj(sekwencjaTextArea.getText(),
                        szukanaTextField.getText())
            );
        });
        Button zakonczButton = new Button("Zakończ");
        zakonczButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Platform.exit(); // kończymy działanie
                // aplikacji JavaFX
            }
        });

        buttonsHBox.getChildren().addAll(szukajButton,
                zakonczButton);
        siatkaPionowaVBox.getChildren().add(buttonsHBox);

        Scene scene = new Scene(siatkaPionowaVBox, 300, 250);
        primaryStage.setTitle("Wyszukiwanie tekstu");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static String szukaj(String sekwencja,
                                String szukana) {
        String rezultat = sekwencja.replaceAll(szukana,
                '[' + szukana + ']');
        return rezultat;
    }
//ala ma [kot]a, ala ma [kot]aala ma [kot]a, ala ma [kot]a

    public static void main(String[] args) {
        launch(args);

        // Uwaga te kontenery do których dodajemy kontroli,
        // kształty i inne kontenery nazywamy Panelami

        // GridPane vs StackPane vs HBox/Vbox

        // Zadanie
        // 1. Skorzystać z panelu typu GridPane zamiast
        // VBox i Hbox do uporządkowania elementów
        // 2. Wyświetlić liczbę znalezionych fraz
    }
}
