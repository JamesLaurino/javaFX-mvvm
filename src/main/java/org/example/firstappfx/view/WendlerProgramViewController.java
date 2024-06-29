package org.example.firstappfx.view;

import javafx.beans.property.FloatProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.util.converter.NumberStringConverter;
import org.example.firstappfx.service.NavigationManager;
import org.example.firstappfx.service.WaveCalculator;
import org.example.firstappfx.viewmodel.WendlerProgramViewModel;

import java.util.List;

public class WendlerProgramViewController
{

    @FXML
    Label waveFiveFirstVal;

    @FXML
    Label waveFiveSecondVal;

    @FXML
    Label waveFiveThirdVal;

    @FXML
    Label waveThreeFirstVal;

    @FXML
    Label waveThreeSecondVal;

    @FXML
    Label  waveThreeThirdVal;

    @FXML
    Label waveOneFirstVal;

    @FXML
    Label waveOneSecondVal;

    @FXML
    Label waveOneThirdVal;

    private NavigationManager navigationManager;
    private WendlerProgramViewModel wendlerProgramViewModel;
    private WaveCalculator waveCalculator = new WaveCalculator();

    public void setNavigationManager(NavigationManager navigationManager) {
        this.navigationManager = navigationManager;
    }

    public void setViewModel(WendlerProgramViewModel wendlerProgramViewModel)
    {
        this.wendlerProgramViewModel = wendlerProgramViewModel;
        this.bindFieldsBenchWave();
    }

    private void bindFieldsBenchWave() {

        List<FloatProperty> wavePropertyList = waveCalculator.computeFiveWave(wendlerProgramViewModel.getBenchMax());
        List<FloatProperty> waveThirdList = waveCalculator.computeThirdWave(wendlerProgramViewModel.getBenchMax());
        List<FloatProperty> waveOneList = waveCalculator.computeOneWave(wendlerProgramViewModel.getBenchMax());

        /* 5s BENCH */
        waveFiveFirstVal.textProperty().bindBidirectional(wavePropertyList.get(0), new NumberStringConverter());
        waveFiveSecondVal.textProperty().bindBidirectional(wavePropertyList.get(1), new NumberStringConverter());
        waveFiveThirdVal.textProperty().bindBidirectional(wavePropertyList.get(2), new NumberStringConverter());

        /* 3s BENCH */
        waveThreeFirstVal.textProperty().bindBidirectional(waveThirdList.get(0), new NumberStringConverter());
        waveThreeSecondVal.textProperty().bindBidirectional(waveThirdList.get(1), new NumberStringConverter());
        waveThreeThirdVal.textProperty().bindBidirectional(waveThirdList.get(2), new NumberStringConverter());

        /* 1s BENCH */
        waveOneFirstVal.textProperty().bindBidirectional(waveOneList.get(0), new NumberStringConverter());
        waveOneSecondVal.textProperty().bindBidirectional(waveOneList.get(1), new NumberStringConverter());
        waveOneThirdVal.textProperty().bindBidirectional(waveOneList.get(2), new NumberStringConverter());
    }

    @FXML
    private void gotoMainProgram() {
        navigationManager.showMainView();
    }
}
