package ro.badilos.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import ro.badilos.model.Nomenclator;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class InfoSituatiaProdusaController implements Initializable {



    @FXML
    private Button btnOk;

    @FXML
    private TableView<Nomenclator> tvSituatiaProdusa;

    @FXML
    private TableColumn tcSituatiaGenerala;

    @FXML
    private TableColumn tcSituatiaSpecifica;

    @FXML
    private TableColumn tcCod;

    @FXML
    public void onBtnOkClicked() {
        Stage stage = (Stage) btnOk.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Connection con = null;
        Statement stat = null;
        ObservableList<Nomenclator> data;

        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:src/main/database/Nomenclator.db");
            System.out.println ("Database connection established");
            stat = con.createStatement();
            data = FXCollections.observableArrayList();

            ResultSet rs = con.createStatement().executeQuery("SELECT * FROM SU");

            while (rs.next())
                data.add(new Nomenclator(rs.getString("tip"), rs.getString("detaliu"), rs.getString("cod")));
            tcSituatiaGenerala.setCellValueFactory(new PropertyValueFactory("sectiune"));
            tcSituatiaSpecifica.setCellValueFactory(new PropertyValueFactory("descriere"));
            tcCod.setCellValueFactory(new PropertyValueFactory("cod"));

            tvSituatiaProdusa.setItems(data);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stat.close();
                con.close();
                System.out.println ("Database connection closed");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
