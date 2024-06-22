package org.example.firstappfx.view;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.util.Duration;
import javafx.util.converter.NumberStringConverter;
import org.example.firstappfx.service.NavigationManager;
import org.example.firstappfx.viewmodel.PersonViewModel;

import java.net.URL;
import java.util.ResourceBundle;


public class PersonViewController implements Initializable
{
    @FXML
    TextField firstNameField;

    @FXML
    TextField lastNameField;

    @FXML
    TextField livePointField;

    @FXML
    VBox vBox;

    @FXML
    Button toggleBtn;

    private NavigationManager navigationManager;
    private PersonViewModel viewModel;

    public void setNavigationManager(NavigationManager navigationManager) {
        this.navigationManager = navigationManager;
    }

    public void setViewModel(PersonViewModel viewModel)
    {
        this.viewModel = viewModel;
        this.bindFields();
    }

    @FXML
    private void goToSceneListViewController()  {
        this.navigationManager.showListView();
    }

    private void bindFields() {
        firstNameField.textProperty().bindBidirectional(viewModel.firstNameProperty());
        lastNameField.textProperty().bindBidirectional(viewModel.lastNameProperty());
        livePointField.textProperty().bindBidirectional(viewModel.livePointProperty(), new NumberStringConverter());
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
}
