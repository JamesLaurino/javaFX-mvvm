package org.example.firstappfx.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.util.converter.NumberStringConverter;
import org.example.firstappfx.service.NavigationManager;
import org.example.firstappfx.viewmodel.WendlerProgramViewModel;

public class WendlerProgramViewController
{

    @FXML
    Label waveFiveFirstVal;

    @FXML
    Label waveFiveSecondVal;

    @FXML
    Label waveFiveThirdVal;

    private NavigationManager navigationManager;
    private WendlerProgramViewModel wendlerProgramViewModel;

    public void setNavigationManager(NavigationManager navigationManager) {
        this.navigationManager = navigationManager;
    }

    public void setViewModel(WendlerProgramViewModel wendlerProgramViewModel)
    {
        this.wendlerProgramViewModel = wendlerProgramViewModel;
        this.bindFields();
    }

    private void bindFields() {
        waveFiveFirstVal.textProperty().bindBidirectional(wendlerProgramViewModel.getBenchMax(), new NumberStringConverter());
        waveFiveSecondVal.textProperty().bindBidirectional(wendlerProgramViewModel.getBenchMax(), new NumberStringConverter());
        waveFiveThirdVal.textProperty().bindBidirectional(wendlerProgramViewModel.getBenchMax(), new NumberStringConverter());
    }

    @FXML
    private void gotoMainProgram() {
        navigationManager.showMainView();
    }
}
