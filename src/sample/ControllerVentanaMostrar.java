package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ControllerVentanaMostrar {

    private ControllerVentanaSumar ControllerVentana1;

    @FXML
    private Button CerrarVentana;
    @FXML
    private Button CerrarApp;

    @FXML
    Label labelContador;

    @FXML
    CheckBox checkboxForzarParada;



    public void initialize(){


    }

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

    @FXML
    private void onButtonForzarParada(){
        if(checkboxForzarParada.isSelected())
            ControllerVentana1.setButtonDisable();
        }



    public void enviarventanaSumar(ControllerVentanaSumar Controllerventanasumar) {
        ControllerVentana1 = Controllerventanasumar;
    }
}



