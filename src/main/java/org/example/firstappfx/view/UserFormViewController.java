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
import org.example.firstappfx.model.entity.PersonEntity;
import org.example.firstappfx.viewmodel.UserFormViewModel;

import java.net.URL;
import java.util.ResourceBundle;

import static org.example.firstappfx.service.data.PersonEntityDataService.personEntityListService;



public class UserFormViewController
{
    @FXML
    TextField firstNameField;

    @FXML
    TextField benchField;

    @FXML
    TextField squatField;

    @FXML
    TextField deadliftField;

//    @FXML
//    VBox vBox;

//    @FXML
//    Button toggleBtn;

    private NavigationManager navigationManager;
    private UserFormViewModel userFormViewModel;

    public void setNavigationManager(NavigationManager navigationManager) {
        this.navigationManager = navigationManager;
    }

    public void setViewModel(UserFormViewModel userFormViewModel)
    {
        this.userFormViewModel = userFormViewModel;
        this.bindFields();
    }

    @FXML
    private void goToSceneListViewController()  {
        PersonEntity personEntity = new PersonEntity(
                firstNameField.getText().toString(),
                Float.valueOf(benchField.getText().toString()),
                Float.valueOf(deadliftField.getText().toString()),
                Float.valueOf(squatField.getText().toString()));

        personEntityListService.remove(0);
        personEntityListService.add(personEntity);
        this.navigationManager.showWendlerProgramView(personEntity);
    }


    private void bindFields() {
        firstNameField.textProperty().bindBidirectional(userFormViewModel.firstNameProperty());
        benchField.textProperty().bindBidirectional(userFormViewModel.benchMaxProperty(), new NumberStringConverter());
        squatField.textProperty().bindBidirectional(userFormViewModel.squatMaxProperty(), new NumberStringConverter());
        deadliftField.textProperty().bindBidirectional(userFormViewModel.deadliftMaxProperty(), new NumberStringConverter());
    }

//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//        vBox.setTranslateX(-200);
//
//        toggleBtn.setOnAction(event -> {
//            if (vBox.getTranslateX() < 0) {
//                // Ouvrir le panel
//                TranslateTransition openNav = new TranslateTransition(new Duration(350), vBox);
//                openNav.setToX(0);
//                openNav.play();
//            } else {
//                // Fermer le panel
//                TranslateTransition closeNav = new TranslateTransition(new Duration(350), vBox);
//                closeNav.setToX(-200);
//                closeNav.play();
//            }
//        });
//    }

    public void goToSaveViewController()
    {
        PersonEntity personEntity = new PersonEntity(
                firstNameField.getText().toString(),
                Float.valueOf(benchField.getText().toString()),
                Float.valueOf(deadliftField.getText().toString()),
                Float.valueOf(squatField.getText().toString()));

        this.navigationManager.showSaveView(personEntity);
    }
}
