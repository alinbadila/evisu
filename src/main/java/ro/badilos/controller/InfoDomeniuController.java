package ro.badilos.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Alin on 15/10/15.
 */
public class InfoDomeniuController implements Initializable {
    @FXML
    private Button btnOk;

    @FXML
    public void onBtnOkClicked() {
        Stage stage = (Stage) btnOk.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
