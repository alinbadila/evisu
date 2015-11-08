package ro.badilos.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Nomenclator {
    private final SimpleStringProperty capitol;
    private final SimpleStringProperty sectiune;
    private final SimpleStringProperty descriere;
    private final SimpleStringProperty cod;

    public Nomenclator(String nomCapitol, String nomSectiune, String nomDescriere, String nomCod) {
        capitol = new SimpleStringProperty(nomCapitol);
        sectiune = new SimpleStringProperty(nomSectiune);
        descriere = new SimpleStringProperty(nomDescriere);
        cod = new SimpleStringProperty(nomCod);
    }

    public Nomenclator(String nomSectiune, String nomDescriere, String nomCod) {
        capitol = new SimpleStringProperty("");
        sectiune = new SimpleStringProperty(nomSectiune);
        descriere = new SimpleStringProperty(nomDescriere);
        cod = new SimpleStringProperty(nomCod);
    }
    public Nomenclator() {
        capitol = new SimpleStringProperty("");
        sectiune = new SimpleStringProperty("");
        descriere = new SimpleStringProperty("");
        cod = new SimpleStringProperty("");
    }

    public String getCapitol() {
        return capitol.get();
    }

    public void setCapitol(String nomCapitol) {
        capitol.set(nomCapitol);
    }

    public String getSectiune() {
        return sectiune.get();
    }

    public void setSectiune(String nomSectiune) {
        sectiune.set(nomSectiune);
    }

    public String getDescriere() {
        return descriere.get();
    }

    public void setDescriere(String nomDescriere) {
        descriere.set(nomDescriere);
    }

    public String getCod() {
        return cod.get();
    }

    public void setCod(String nomCod) {
        cod.set(nomCod);
    }

    public void showTipuriSU() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("InfoSituatiaProdusa.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Situația de urgență produsă");
            stage.setScene(new Scene(root1));
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showDomeniu() {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("InfoDomeniu.fxml"));
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Domeniu");
            stage.setScene(new Scene(root1));
            stage.setResizable(false);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
