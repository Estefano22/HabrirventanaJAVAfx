package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Controller {
    ControllerVentana1 Controller1 = null;

    int i = 0;

    @FXML
    public void Buttonventana1() {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Ventana1.fxml"));
            Pane root = (AnchorPane) loader.load();
            Scene scene = new Scene(root, 650, 500);
            stage.setResizable(false);
            stage.setScene(scene);

            ControllerVentana1 controller = loader.getController();
            controller.ponerNumero(1);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }

        try{
            i++;
            Controller1.Contador.setText(""+i);
        } catch (Exception e){}



    }


}
