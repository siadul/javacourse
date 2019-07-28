package gui.zadanie3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Zadanie3 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent Klawisz = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Klawisz");
        primaryStage.setScene(new Scene(Klawisz, 700, 700));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
