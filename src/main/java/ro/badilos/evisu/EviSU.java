
package ro.badilos.evisu;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import ro.badilos.controller.MainController;

import java.io.IOException;

/**
 * Main application class.
 */
public class EviSU extends Application {

    private static Stage mainStage;

    @Override
    public void start(Stage stage) throws Exception{
        stage.setTitle("EviSU");
        
        stage.setScene(createScene(loadMainPane()));
        mainStage = stage;
        stage.show();
    }

    /**
     * Loads the main fxml layout.
     * Sets up the vista switching VistaNavigator.
     * Loads the first vista into the fxml layout.
     *
     * @return the loaded pane.
     * @throws IOException if the pane could not be loaded.
     */
    private Pane loadMainPane() throws IOException {
        FXMLLoader loader = new FXMLLoader();

        //Pane mainPane = (Pane) loader.load(getClass().getResourceAsStream("../resources/Main.fxml"));
        Pane mainPane = (Pane) loader.load(getClass().getClassLoader().getResourceAsStream(VistaNavigator.MAIN));

        MainController mainController = loader.getController();

        VistaNavigator.setMainController(mainController);
        //VistaNavigator.loadVista("../resources/NewSU.fxml");
        VistaNavigator.loadVista(VistaNavigator.VISTA_1);

        return mainPane;
    }

    /**
     * Creates the main application scene.
     *
     * @param mainPane the main application layout.
     *
     * @return the created scene.
     */
    private Scene createScene(Pane mainPane) {
        Scene scene = new Scene(mainPane, Screen.getPrimary().getVisualBounds().getWidth() * 0.6,
                Screen.getPrimary().getVisualBounds().getHeight() * 0.6);

        //scene.getStylesheets().setAll(getClass().getResource("/view/vista.css").toExternalForm());

        return scene;
    }

    public static Stage getStage() {
        return mainStage;
    }

    @FXML
    public static void appClose() {
        Platform.exit();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
