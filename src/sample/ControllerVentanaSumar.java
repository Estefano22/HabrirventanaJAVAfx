package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class ControllerVentanaSumar {

    @FXML
    Button buttonSumar , buttonRestar1;

    ControllerVentanaMostrar controllerVentana2 = null;


    @FXML
    public void Buttonventana1() {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ventana_mostrar.fxml"));
            Pane root = (AnchorPane) loader.load();
            Scene scene = new Scene(root, 650, 500);
            stage.setResizable(false);
            stage.setScene(scene);
            controllerVentana2 = loader.getController();
            controllerVentana2.enviarventanaSumar(this);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    public void buttonSumarClicked() {
        if (controllerVentana2 != null) {
            controllerVentana2.sumar1();

        }

    }

    @FXML
    public void buttonRestarClicked() {
        if (controllerVentana2 != null) {
            controllerVentana2.restar1();

        }

    }

    public void setButtonDisable(){
        buttonSumar.setDisable(true);
        buttonRestar1.setDisable(true);
    }

}

