package org.example.firstappfx.view;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
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
    public void goToUserFormProgram()
    {
        navigationManager.showUserFormView();
    }

    @FXML
    public void goToMainMenu(MouseEvent event)
    {
        navigationManager.showMainView();
    }
}
