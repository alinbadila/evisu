package ro.badilos.controller;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import ro.badilos.model.Nomenclator;

import java.net.URL;
import java.util.ResourceBundle;
/**
 * Controller class for the first vista.
 */
public class NewSUController implements Initializable{

    @FXML
    private ComboBox<String> comboCosFum;
    public static ObservableList<String> listaDaNu = FXCollections.observableArrayList("da", "nu");

    @FXML
    private ComboBox<String> comboLocalitate;
    public static ObservableList<String> listaLocalitatiJudetSibiu = FXCollections.observableArrayList("Sibiu", "Mediaș",
            "Agnita", "Avrig", "Cisnădie", "Copșa Mică", "Dumbrăveni", "Miercurea Sibiului", "Ocna Sibiului", "Săliște",
            "Tălmaciu", "Aciliu", "Agârbiciu", "Alămor", "Albi", "Alma", "Alma Vii", "Alțâna", "Amnaș", "Apoldu de Jos",
            "Apoldu de Sus", "Apos", "Armeni", "Arpașu de Jos", "Ațel", "Axente Sever", "Bazna", "Benești", "Biertan",
            "Bârghiș", "Blăjel", "Boarta", "Bogatu Român", "Boian", "Boița", "Brădeni", "Brateiu", "Broșteni", "Bruiu",
            "Buia", "Bungard", "Buzd", "Cașolț", "Chesler", "Chirpăr", "Cârța", "Cârțișoara", "Cisnădioara", "Colun",
            "Copșa Mare", "Cornățel", "Cristian", "Curciu", "Daia", "Dealu Frumos", "Dârlos", "Dupuș", "Florești",
            "Fofeldea", "Galeș", "Gherdeal", "Ghijasa de Jos", "Ghijasa de Sus", "Giacăș", "Gura Râului", "Gusu",
            "Hamba", "Hașag", "Hoghilag", "Hosman", "Iacobeni", "Ighișu Vechi", "Ilimbav", "Jina", "Laslea", "Lazaret",
            "Loamneș", "Lotrioara", "Ludoș", "Mălâncrav", "Mândra", "Marpod", "Merghindeal", "Metiș", "Micăsasa",
            "Mighindoala", "Mihăileni", "Moardăș", "Mohu", "Moșna", "Motiș", "Movile", "Nemșa", "Netuș", "Nocrich",
            "Noiștat", "Nou", "Noul Român", "Noul Săsesc", "Nucet", "Orlat", "Pădureni", "Paltin", "Păuca", "Păucea",
            "Pelișor", "Petiș", "Poiana Sibiului", "Poienița", "Poplaca", "Poplaca II", "Porumbacu de Jos", "Porumbacu de Sus",
            "Presaca", "Prod", "Racovița", "Rășinari", "Răvășel", "Retiș", "Richiș", "Râu Sadului", "Roandola", "Rod",
            "Romanești", "Roșia", "Rusciori", "Ruși", "Sadinca", "Sadu", "Salcău", "Sărata", "Săsăuș", "Scorei",
            "Sebeșu de Jos", "Sebeșul de Sus", "Șeica Mare", "Șeica Mică", "Șelimbăr", "Sibiel", "Sângătin", "Slimnic",
            "Șmig", "Șoala", "Șomartin", "Șoroștin", "Stejărișu", "Ștenea", "Șura Mare", "Șura Mică", "Țapu", "Țeline",
            "Țichindeal", "Tilișca", "Târnava", "Tocile", "Turnu Roșu", "Valchid", "Valea Lungă", "Valea Viilor", "Văleni",
            "Vărd", "Vecerd", "Velț", "Veseud", "Veștem", "Vurpăr", "Zlagna");



    /**
     * Metodă accesată când se execută click pe butonul ”?” pentru afișarea tuturor tipurilor de
     * situații de urgență.
     *
     */
    @FXML
    public void onBtnTipuriSUClicked () {
        Nomenclator tipuriSU = new Nomenclator();
        tipuriSU.showTipuriSU();
    }

    @FXML
    public void onBtnDomeniuClicked() {
        Nomenclator domeniuSU = new Nomenclator();
        domeniuSU.showDomeniu();
    }

    public void initialize(URL location, ResourceBundle resources) {
        comboCosFum.setItems(listaDaNu);
        comboLocalitate.setItems(listaLocalitatiJudetSibiu);
    }
}
