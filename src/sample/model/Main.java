package sample.model;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;
    private ObservableList<Person> personData = FXCollections.observableArrayList();

    public Main(){
        personData.addAll(new Person("Katarzyna","Nowak"));
        personData.addAll(new Person("Tomasz","Kowalski"));
        personData.addAll(new Person("Adam","Lewandowski"));
        personData.addAll(new Person("Monika","Lato"));
        personData.addAll(new Person("Klaudia","Ziemniak"));
    }

    public ObservableList<Person> getPersonData(){
        return personData;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Książka adresowa");
        initRootLayout();
        showPersonOverview();
    }

    private void initRootLayout() {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(Main.class.getResource("view/RootLayout.fxml"));
            rootLayout = fxmlLoader.load();
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private void showPersonOverview() {
        try{FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(Main.class.getResource("view/PersonOverview.fxml"));
            AnchorPane personOverview  = fxmlLoader.load();
            rootLayout.setCenter(personOverview);

            PersonOverviewController controller = fxmlLoader.getController();
            controller.setMain(this);
         } catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
