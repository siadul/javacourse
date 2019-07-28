package test;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;

public class Controller {
    public BorderPane panel;
    public Button btn;
    public Slider sliderv;
    public Slider sliderh;

    @FXML
    public void initialize() {
        sliderh.valueProperty().addListener(
                (observable, oldValue, newValue) -> {
                    double valX = newValue.doubleValue()/100
                            * (panel.getWidth() - btn.getWidth());
                    double valY = sliderv.getValue()/100
                            * (panel.getHeight() - btn.getHeight());
                    btn.setText((int)valX + ", " + (int)valY);
                    btn.setTranslateX(valX);
                }
        );
        sliderv.valueProperty().addListener(
                (observable, oldValue, newValue) -> {
                    double valX = sliderh.getValue()/100
                            * (panel.getWidth() - btn.getWidth());
                    double valY = newValue.doubleValue()/100
                            * (panel.getHeight() - btn.getHeight());
                    btn.setText((int) valX + ", " + (int) valY);
                    btn.setTranslateY(valY);
                }
        );

    }


}
