package opgave01.gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import opgave01.controller.Controller;
import opgave01.models.Person;
import opgave01.models.Role;
import opgave01.storage.EaaaFileStorage;

import java.util.List;

public class Gui extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        GridPane pane = new GridPane();
        this.initContent(pane);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() {

    }

    Controller controller = new Controller(new EaaaFileStorage());
    private final ListView<Person> lvwPeople = new ListView<>();
    private final ComboBox<Role> comboBox = new ComboBox<>();
    private final TextField txfName = new TextField();
    private final ComboBox<Role> comboBoxCreatePerson = new ComboBox<>();

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblPeople = new Label("Personer");
        pane.add(lblPeople, 0, 0);
        pane.add(lvwPeople, 0, 1, 2, 5);
        lvwPeople.setPrefHeight(200);
        lvwPeople.getItems().setAll(controller.getPeople());

        Label lblFilter = new Label("Filter");
        pane.add(lblFilter, 0, 7);
        comboBox.getItems().add(Role.TEACHER);
        comboBox.getItems().add(Role.STUDENT);
        pane.add(comboBox, 1, 7);

        Button btnUseFilter = new Button("Brug filter");
        pane.add(btnUseFilter, 0, 8);
        btnUseFilter.setOnAction(event -> useFilterAction());
        Button btnRemoveFilter = new Button("Fjern filter");
        pane.add(btnRemoveFilter, 1, 8);
        btnRemoveFilter.setOnAction(event -> removeFilterAction());

        Label lblCreatePerson = new Label("Tilføj person");
        pane.add(lblCreatePerson, 2, 0, 2, 1);
        Label lblName = new Label("Navn");
        pane.add(lblName, 2,1);
        pane.add(txfName, 3, 1);

        Label lblRole = new Label("Rolle");
        pane.add(lblRole, 2, 2);
        pane.add(comboBoxCreatePerson, 3, 2);
        comboBoxCreatePerson.getItems().add(Role.TEACHER);
        comboBoxCreatePerson.getItems().add(Role.STUDENT);

        Button btnCreatePerson = new Button("Tilføj");
        pane.add(btnCreatePerson, 2, 3);
        btnCreatePerson.setOnAction(event -> createPersonAction());
    }

    private void createPersonAction() {
        Person person = controller.createPerson(txfName.getText().trim(), comboBoxCreatePerson.getSelectionModel().getSelectedItem());
        controller.addPerson(person);
        lvwPeople.getItems().setAll(controller.getPeople());
    }

    private void useFilterAction() {
        List<Person> filteredPeople = controller.filter(comboBox.getSelectionModel().getSelectedItem());
        lvwPeople.getItems().setAll(filteredPeople);
    }

    private void removeFilterAction() {
        lvwPeople.getItems().setAll(controller.getPeople());
    }
}
