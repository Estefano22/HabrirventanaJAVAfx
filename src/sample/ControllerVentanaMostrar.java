package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ControllerVentanaMostrar {


    @FXML
    private Button CerrarVentana;
    @FXML
    private Button CerrarApp;

    @FXML
    Label labelContador;

    int contador = 0;

    @FXML
    private void onButtonCerrarVentanaClicked() {
        Stage stage = (Stage) CerrarVentana.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void onButtonCerrarAppClicked() {
        System.exit(0);
    }


    public void sumar1() {

        contador ++;
        labelContador.setText(String.valueOf(contador));

    }

    public void restar1() {

        contador --;
        labelContador.setText(String.valueOf(contador));

    }


}
