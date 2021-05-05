package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ControllerVentanaSumar {

    ControllerVentanaMostrar controller = null;


    @FXML
    public void Buttonventana1() {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ventana_mostrar.fxml"));
            Pane root = (AnchorPane) loader.load();
            Scene scene = new Scene(root, 650, 500);
            stage.setResizable(false);
            stage.setScene(scene);


            controller = loader.getController();


            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @FXML
    public void buttonSumarClicked() {
        if (controller != null) {
            controller.sumar1();

        }


    }

    @FXML
    public void buttonRestarClicked() {
        if (controller != null) {
            controller.restar1();

        }

    }
}

