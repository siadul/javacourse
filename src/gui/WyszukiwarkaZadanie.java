package gui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

//import javafx.scene.control.TextArea;

public class WyszukiwarkaZadanie extends Application {
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

        Label iloscLabel = new Label("");
        siatkaPionowaVBox.getChildren().add(iloscLabel);

        szukajButton.setOnAction(actionEvent -> {
            wynikTextArea.setText(
                    szukaj(sekwencjaTextArea.getText(),
                        szukanaTextField.getText())
            );
            iloscLabel.setText("Znaleziono fraz: " +
                    licz(sekwencjaTextArea.getText(),
                    szukanaTextField.getText()));
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

    public static int licz(String sekwencja,
                                String szukana) {
        int count = 0;
        int lastIndex = 0;

        do {
            lastIndex = sekwencja.indexOf(szukana, lastIndex);
            if (lastIndex == -1) {
                return count;
            }

            count++;
            lastIndex += szukana.length();
        } while(true);
    }

    public static void main(String[] args) {
        launch(args);

        // Zadanie
        // 1. Wyświetlić liczbę znalezionych fraz
        // 2. Skorzystać z panelu typu GridPane zamiast
        // VBox i Hbox do uporządkowania elementów
    }
}
