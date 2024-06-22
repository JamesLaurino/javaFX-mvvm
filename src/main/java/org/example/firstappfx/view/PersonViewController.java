package org.example.firstappfx.view;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.converter.NumberStringConverter;
import org.example.firstappfx.service.NavigationManager;
import org.example.firstappfx.viewmodel.PersonViewModel;


public class PersonViewController
{
    @FXML
    TextField firstNameField;

    @FXML
    TextField lastNameField;

    @FXML
    TextField livePointField;

    private Stage stage;

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
}
