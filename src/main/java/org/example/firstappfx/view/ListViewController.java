package org.example.firstappfx.view;

import javafx.fxml.FXML;
import org.example.firstappfx.service.NavigationManager;

public class ListViewController
{

    private NavigationManager navigationManager;

    public void setNavigationManager(NavigationManager navigationManager) {
        this.navigationManager = navigationManager;
    }

    @FXML
    private void gotoFirstView() {
        navigationManager.showPersonView();
    }
}
