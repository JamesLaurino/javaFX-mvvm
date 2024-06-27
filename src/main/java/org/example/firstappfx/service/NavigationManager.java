package org.example.firstappfx.service;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.firstappfx.view.WendlerProgramViewController;
import org.example.firstappfx.view.MainViewController;
import org.example.firstappfx.viewmodel.MainViewModel;
import org.example.firstappfx.viewmodel.WendlerProgramViewModel;

import java.io.IOException;

public class NavigationManager {

    private final Stage primaryStage;

    public NavigationManager(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void showMainView() {
        try
        {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/mainView.fxml"));

            Parent root = loader.load();

            MainViewModel mainViewModel = new MainViewModel();
            MainViewController controller = loader.getController();

            controller.setViewModel(mainViewModel);
            controller.setNavigationManager(this);

            primaryStage.setTitle("MVVM!");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();

        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    public void showWendlerProgramView() {
        try
        {
            FXMLLoader loader = new FXMLLoader(getClass()
                    .getResource("/wendlerProgramView.fxml"));
            Parent root = loader.load();

            WendlerProgramViewController controller = loader.getController();
            WendlerProgramViewModel wendlerProgramViewModel = new WendlerProgramViewModel();

            controller.setViewModel(wendlerProgramViewModel);
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
