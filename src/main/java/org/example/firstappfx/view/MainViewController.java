package org.example.firstappfx.view;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.util.Duration;
import org.example.firstappfx.model.entity.PersonEntity;
import org.example.firstappfx.service.NavigationManager;
import org.example.firstappfx.viewmodel.MainViewModel;

import java.net.URL;
import java.util.ResourceBundle;

import static org.example.firstappfx.service.data.PersonEntityDataService.personEntityListService;

public class MainViewController implements Initializable
{

    @FXML
    VBox vBox;

    @FXML
    Button toggleBtn;

    private NavigationManager navigationManager;
    private MainViewModel mainViewModel;

    public void setNavigationManager(NavigationManager navigationManager) {
        this.navigationManager = navigationManager;
    }

    public void goToWendlerProgram(MouseEvent event)
    {
        PersonEntity personEntity = personEntityListService.get(0);
        this.navigationManager.showWendlerProgramView(personEntity);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        vBox.setTranslateX(-200);

        toggleBtn.setOnAction(event -> {
            if (vBox.getTranslateX() < 0) {
                // Ouvrir le panel
                TranslateTransition openNav = new TranslateTransition(new Duration(350), vBox);
                openNav.setToX(0);
                openNav.play();
            } else {
                // Fermer le panel
                TranslateTransition closeNav = new TranslateTransition(new Duration(350), vBox);
                closeNav.setToX(-200);
                closeNav.play();
            }
        });
    }

    public void setViewModel(MainViewModel mainViewModel)
    {
        this.mainViewModel = mainViewModel;
    }
}
