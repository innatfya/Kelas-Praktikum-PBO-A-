package com.pertemuan8.javafx;

import javafx.application.Application;
import javafx.collections.*;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {
    private final ObservableList<Person> data = FXCollections.observableArrayList();

    @Override
    public void start(Stage stage) {
        // Form
        TextField nameField = new TextField();
            nameField.setPromptText("Nama");
        TextField ageField = new TextField();
            ageField.setPromptText("Umur");
        TextField npmField = new TextField();
            npmField.setPromptText("NPM");

        Button addBtn = new Button("Tambah");
        addBtn.setOnAction(e -> {
            String name = nameField.getText().trim();
            String ageText = ageField.getText().trim();
            String npm = npmField.getText().trim();
            if (name.isEmpty() || ageText.isEmpty() || npm.isEmpty()) {
                showAlert("Isi Nama, Umur, dan NPM dulu.");
                return; }
            try {
                int age = Integer.parseInt(ageText);
                data.add(new Person(name, age, npm)); 
                nameField.clear();
                ageField.clear();
                npmField.clear(); }
            catch (NumberFormatException ex) {
                showAlert("Umur harus angka."); }
        });

        HBox form = new HBox(8, nameField, ageField, npmField, addBtn);
        form.setPadding(new Insets(10));
        form.setAlignment(Pos.CENTER_LEFT);

        // Table
        TableView<Person> table = new TableView<>(data);

        TableColumn<Person, String> colName = new TableColumn<>("Nama");
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colName.setPrefWidth(200);

        TableColumn<Person, Integer> colAge = new TableColumn<>("Umur");
        colAge.setCellValueFactory(new PropertyValueFactory<>("age"));
        colAge.setPrefWidth(80);

        TableColumn<Person, String> colNPM = new TableColumn<>("NPM");
        colNPM.setCellValueFactory(new PropertyValueFactory<>("npm"));
        colNPM.setPrefWidth(150);

        table.getColumns().addAll(colName, colAge, colNPM);
        table.setPrefHeight(300);

        VBox root = new VBox(10, form, table);
        root.setPadding(new Insets(10));

        stage.setScene(new Scene(root, 480, 380)); 
        stage.setTitle("JavaFX - Input ke TableView (Simple)");
        stage.show(); }

    private void showAlert(String text) {
        Alert a = new Alert(Alert.AlertType.INFORMATION, text, ButtonType.OK);
        a.showAndWait(); }

    public static void main(String[] args) {
        launch();
    }
}