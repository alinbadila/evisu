package ro.badilos.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;


/**
 * Controller class for the second vista.
 */
public class NewSMURDController {

    /**
     * Event handler fired when the user requests a previous vista.
     *
     * @param event the event that triggered the handler.
     */
    @FXML
    void previousPane(ActionEvent event) {

        ro.badilos.evisu.VistaNavigator.loadVista(ro.badilos.evisu.VistaNavigator.VISTA_1);
    }

}