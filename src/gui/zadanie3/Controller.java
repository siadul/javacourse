package gui.zadanie3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;

public class Controller {
    public Slider sliderH;
    public Slider sliderV;
    public Button btn1;
    public BorderPane borderPane;

    @FXML
    public void initialize() {
        sliderH.valueProperty().addListener((observable, oldValue, newValue) -> {
            double val = newValue.doubleValue() * borderPane.getWidth()/100 - btn1.getWidth();
            val = val > 0 ? val : 0;
            btn1.setText(val + ", " + sliderV.getValue());
            btn1.setTranslateX(val > 0 ? val : 0);
        });
        sliderV.valueProperty().addListener((observable, oldValue, newValue) -> {
            double val = newValue.doubleValue() * borderPane.getHeight()/100 - btn1.getHeight();
            val = val > 0 ? val : 0;
            btn1.setText(val + ", " + newValue);
            btn1.setTranslateY(val);
        });
    }


}
