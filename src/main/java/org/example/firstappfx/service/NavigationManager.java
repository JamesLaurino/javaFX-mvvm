package org.example.firstappfx.service;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.firstappfx.model.Person;
import org.example.firstappfx.view.ListViewController;
import org.example.firstappfx.view.PersonViewController;
import org.example.firstappfx.viewmodel.PersonViewModel;

import java.io.IOException;

public class NavigationManager {

    private final Stage primaryStage;

    public NavigationManager(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void showPersonView() {
        try
        {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/org/example/firstappfx/personView.fxml"));

            Parent root = loader.load();

            Person person = new Person();
            PersonViewModel personViewModel = new PersonViewModel(person);
            PersonViewController controller = loader.getController();

            controller.setViewModel(personViewModel);
            controller.setNavigationManager(this);

            primaryStage.setTitle("MVVM!");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();

        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    public void showListView() {
        try
        {
            FXMLLoader loader = new FXMLLoader(getClass()
                    .getResource("/org/example/firstappfx/listView.fxml"));
            Parent root = loader.load();

            ListViewController controller = loader.getController();
            controller.setNavigationManager(this);

            primaryStage.setScene(new Scene(root));
            primaryStage.setTitle("MVVM 2!");
            primaryStage.show();

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
