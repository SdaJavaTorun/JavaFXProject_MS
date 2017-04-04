package sample.model;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;


public class PersonOverviewController {
    @FXML
        private TableView<Person> personTable;
    @FXML
        private TableColumn<Person, String> firstaNameColumn;
    @FXML
        private TableColumn<Person, String> lastNameColumn;
    @FXML
        private Label firstNameLabel;
    @FXML
        private Label lastNameLabel;
    @FXML
        private Label streetLabel;
    @FXML
        private Label postalCodeLabel;
    @FXML
        private Label cityLabel;
    @FXML
        private Label birthdayLabel;

    //referencja do klasy głównej
    private Main main;
    public PersonOverviewController(){

    }
    @FXML
     private void initialize(){
        firstaNameColumn.setCellValueFactory(data -> data.getValue().firstNameProperty());
        lastNameColumn.setCellValueFactory(data -> data.getValue().lastNameProperty());
    }
    public void setMain(Main main){
        this.main = main;
        personTable.setItems(main.getPersonData());
    }
}
