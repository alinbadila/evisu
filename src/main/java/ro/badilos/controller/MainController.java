/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.badilos.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import ro.badilos.evisu.*;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * EviSU controller class for the entire layout.
 */
public class MainController implements Initializable {

    /** Holder of a switchable vista. */
    @FXML
    private StackPane vistaHolder;

    @FXML
    private Button btnNewSU;

    @FXML
    private Button btnNewSMURD;

    /**
     * Replaces the vista displayed in the vista holder with a new vista.
     *
     * @param node the vista node to be swapped in.
     */
    public void setVista(Node node) {

        vistaHolder.getChildren().setAll(node);
    }

    @FXML
    private void newSUPane(ActionEvent event) {

        VistaNavigator.loadVista(VistaNavigator.VISTA_1);
        EviSU.getStage().setTitle("EviSU - intervenție nouă");
    }

    @FXML
    private void newSMURDPane(ActionEvent event) {

        VistaNavigator.loadVista(VistaNavigator.VISTA_2);
        EviSU.getStage().setTitle("EviSU - intervenție SMURD nouă");
    }

    @FXML
    private void onFileMenuClose(ActionEvent event) {
        EviSU.appClose();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        /**
         * seteaza pictograma butonului de creare raport nou
         */
        try {
            Image focIcon = new Image(getClass().getResourceAsStream("/pool/foc16px.png"));
            btnNewSU.setGraphic(new ImageView(focIcon));

            Image smurdIcon = new Image(getClass().getResourceAsStream("/pool/smurd16px.png"));
            btnNewSMURD.setGraphic(new ImageView(smurdIcon));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
