package org.example.firstappfx;

import javafx.application.Application;


import javafx.stage.Stage;
import org.example.firstappfx.service.NavigationManager;

import java.io.IOException;

public class MainApplication extends Application
{
    @Override
    public void start(Stage primaryStage) throws IOException
    {
        NavigationManager navigationManager = new NavigationManager(primaryStage);
        navigationManager.showMainView();
    }

    public static void main(String[] args)
    {
        launch();
    }
}


