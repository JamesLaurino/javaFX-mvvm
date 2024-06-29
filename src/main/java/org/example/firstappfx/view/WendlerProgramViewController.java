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

            /* BENCH */
    @FXML
    Label waveFiveFirstVal, waveFiveSecondVal, waveFiveThirdVal;

    @FXML
    Label waveThreeFirstVal, waveThreeSecondVal, waveThreeThirdVal;

    @FXML
    Label waveOneFirstVal, waveOneSecondVal, waveOneThirdVal;

            /* SQUAT */
    @FXML
    Label metaData, boringButBigBench, boringButBigSquat, boringButBigDead;

    @FXML
    Label waveFiveFirstValSquat, waveFiveSecondValSquat, waveFiveThirdValSquat;

    @FXML
    Label waveThreeFirstValSquat, waveThreeSecondValSquat, waveThreeThirdValSquat;

    @FXML
    Label waveOneThirdValSquat, waveOneSecondValSquat, waveOneFirstValSquat;

            /* DEADLIFT */
    @FXML
    Label waveThreeFirstValDead, waveThreeSecondValDead, waveThreeThirdValDead;

    @FXML
    Label waveOneFirstValDead, waveOneSecondValDead, waveOneThirdValDead;

    @FXML
    Label waveFiveFirstValDeadlift, waveFiveSecondValDeadlift, waveFiveThirdValDeadlift;


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
        this.bindMetaDataField();
        this.bindFieldsSquatWave();
        this.bindFieldsDeadLiftWave();
    }
    private void bindMetaDataField()
    {
        metaData.textProperty().bindBidirectional(wendlerProgramViewModel.getBenchMax(), new NumberStringConverter());
        boringButBigBench.textProperty().bindBidirectional(waveCalculator.computeBBB(wendlerProgramViewModel.getBenchMax()), new NumberStringConverter());
        boringButBigSquat.textProperty().bindBidirectional(waveCalculator.computeBBB(wendlerProgramViewModel.getSquatMax()), new NumberStringConverter());
        boringButBigDead.textProperty().bindBidirectional(waveCalculator.computeBBB(wendlerProgramViewModel.getdeadliftMax()), new NumberStringConverter());
    }

    private void bindFieldsDeadLiftWave()
    {
        List<FloatProperty> wavePropertyList = waveCalculator.computeFiveWave(wendlerProgramViewModel.getdeadliftMax());
        List<FloatProperty> wavePropertyListThirdVal = waveCalculator.computeThirdWave(wendlerProgramViewModel.getdeadliftMax());
        List<FloatProperty> wavePropertyListOneVal = waveCalculator.computeOneWave(wendlerProgramViewModel.getdeadliftMax());

        /* 5s DEADLIFT */
        waveFiveFirstValDeadlift.textProperty().bindBidirectional(wavePropertyList.get(0), new NumberStringConverter());
        waveFiveSecondValDeadlift.textProperty().bindBidirectional(wavePropertyList.get(1), new NumberStringConverter());
        waveFiveThirdValDeadlift.textProperty().bindBidirectional(wavePropertyList.get(2), new NumberStringConverter());

        /* 3s DEADLIFT*/
        waveThreeFirstValDead.textProperty().bindBidirectional(wavePropertyListThirdVal.get(0), new NumberStringConverter());
        waveThreeSecondValDead.textProperty().bindBidirectional(wavePropertyListThirdVal.get(1), new NumberStringConverter());
        waveThreeThirdValDead.textProperty().bindBidirectional(wavePropertyListThirdVal.get(2), new NumberStringConverter());

        /* 1s DEADLIFT */
        waveOneFirstValDead.textProperty().bindBidirectional(wavePropertyListOneVal.get(0), new NumberStringConverter());
        waveOneSecondValDead.textProperty().bindBidirectional(wavePropertyListOneVal.get(1), new NumberStringConverter());
        waveOneThirdValDead.textProperty().bindBidirectional(wavePropertyListOneVal.get(2), new NumberStringConverter());
    }

    private void bindFieldsSquatWave()
    {
        List<FloatProperty> wavePropertyList = waveCalculator.computeFiveWave(wendlerProgramViewModel.getSquatMax());
        List<FloatProperty> waveThreePropertyList = waveCalculator.computeThirdWave(wendlerProgramViewModel.getSquatMax());
        List<FloatProperty> waveThreePropertyListOne = waveCalculator.computeOneWave(wendlerProgramViewModel.getSquatMax());

        /* 5s SQUAT */
        waveFiveFirstValSquat.textProperty().bindBidirectional(wavePropertyList.get(0), new NumberStringConverter());
        waveFiveSecondValSquat.textProperty().bindBidirectional(wavePropertyList.get(1), new NumberStringConverter());
        waveFiveThirdValSquat.textProperty().bindBidirectional(wavePropertyList.get(2), new NumberStringConverter());

        /* 3s SQUAT */
        waveThreeFirstValSquat.textProperty().bindBidirectional(waveThreePropertyList.get(0), new NumberStringConverter());
        waveThreeSecondValSquat.textProperty().bindBidirectional(waveThreePropertyList.get(1), new NumberStringConverter());
        waveThreeThirdValSquat.textProperty().bindBidirectional(waveThreePropertyList.get(2), new NumberStringConverter());

        /* 1s SQUAT */
        waveOneThirdValSquat.textProperty().bindBidirectional(waveThreePropertyListOne.get(0), new NumberStringConverter());
        waveOneSecondValSquat.textProperty().bindBidirectional(waveThreePropertyListOne.get(1), new NumberStringConverter());
        waveOneFirstValSquat.textProperty().bindBidirectional(waveThreePropertyListOne.get(2), new NumberStringConverter());

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
