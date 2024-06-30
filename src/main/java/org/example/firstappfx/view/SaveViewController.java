package org.example.firstappfx.view;

import javafx.fxml.FXML;
import org.example.firstappfx.service.NavigationManager;
import org.example.firstappfx.viewmodel.SaveViewModel;

public class SaveViewController {

    private NavigationManager navigationManager;

    public void setViewModel(SaveViewModel saveViewModel) {
    }

    public void setNavigationManager(NavigationManager navigationManager) {
        this.navigationManager = navigationManager;
    }

    @FXML
    public void gotoMainProgram()
    {
        navigationManager.showMainView();
    }
}
