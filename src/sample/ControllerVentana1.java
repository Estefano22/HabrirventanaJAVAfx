package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ControllerVentana1 {

    int i = 0;

    @FXML
    private Button CerrarVentana;
    @FXML
    private Button CerrarApp;

    @FXML
    Label Contador;

    @FXML
    private void onButtonCerrarVentanaClicked() {
        Stage stage = (Stage) CerrarVentana.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void onButtonCerrarAppClicked() {
        System.exit(0);
    }


    public void ponerNumero(int numero) {
        System.out.println(numero);

    }




}
