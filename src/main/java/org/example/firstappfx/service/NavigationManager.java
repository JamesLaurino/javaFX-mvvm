package org.example.firstappfx.service;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.firstappfx.model.entity.PersonEntity;
import org.example.firstappfx.view.MainViewController;
import org.example.firstappfx.view.SaveViewController;
import org.example.firstappfx.view.WendlerProgramViewController;
import org.example.firstappfx.view.UserFormViewController;
import org.example.firstappfx.viewmodel.MainViewModel;
import org.example.firstappfx.viewmodel.UserFormViewModel;
import org.example.firstappfx.viewmodel.SaveViewModel;
import org.example.firstappfx.viewmodel.WendlerProgramViewModel;

import java.io.IOException;

public class NavigationManager {

    private final Stage primaryStage;

    public NavigationManager(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public void showUserFormView() {
        try
        {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/UserFormView.fxml"));

            Parent root = loader.load();

            UserFormViewModel userFormViewModel = new UserFormViewModel();
            UserFormViewController controller = loader.getController();

            controller.setViewModel(userFormViewModel);
            controller.setNavigationManager(this);

            primaryStage.setTitle("MVVM I");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();

        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    public void showSaveView(PersonEntity personEntityUser)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(getClass()
                    .getResource("/saveView.fxml"));
            Parent root = loader.load();

            SaveViewController controller = loader.getController();
            SaveViewModel saveViewModel = new SaveViewModel(personEntityUser);

            controller.setViewModel(saveViewModel);
            controller.setNavigationManager(this);

            primaryStage.setScene(new Scene(root));
            primaryStage.setTitle("MVVM II");
            primaryStage.show();

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void showWendlerProgramView(PersonEntity personEntityUser) {
        try
        {
            FXMLLoader loader = new FXMLLoader(getClass()
                    .getResource("/wendlerProgramView.fxml"));
            Parent root = loader.load();

            WendlerProgramViewController controller = loader.getController();
            WendlerProgramViewModel wendlerProgramViewModel = new WendlerProgramViewModel(personEntityUser);

            controller.setViewModel(wendlerProgramViewModel);
            controller.setNavigationManager(this);

            primaryStage.setScene(new Scene(root));
            primaryStage.setTitle("MVVM II");
            primaryStage.show();

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void showMainView()
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(getClass()
                    .getResource("/mainView.fxml"));
            Parent root = loader.load();

            MainViewController controller = loader.getController();
            MainViewModel mainViewModel = new MainViewModel();

            controller.setViewModel(mainViewModel);
            controller.setNavigationManager(this);

            primaryStage.setScene(new Scene(root));
            primaryStage.setTitle("MVVM II");
            primaryStage.show();

        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
