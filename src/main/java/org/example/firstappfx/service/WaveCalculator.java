package org.example.firstappfx.service;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;

import java.util.List;

public class WaveCalculator
{
    public List<FloatProperty> computeFiveWave(FloatProperty maxUser)
    {
        float maxUserFloat = maxUser.floatValue();
        maxUserFloat = maxUserFloat * 0.90F;
        float firstVal = maxUserFloat * 0.65F;
        float secondVal = maxUserFloat * 0.75F;
        float thirdVal = maxUserFloat * 0.85F;
        return List.of(new SimpleFloatProperty(firstVal),new SimpleFloatProperty(secondVal),new SimpleFloatProperty(thirdVal));
    }
    public List<FloatProperty> computeThirdWave(FloatProperty maxUser)
    {
        float maxUserFloat = maxUser.floatValue();
        maxUserFloat = maxUserFloat * 0.90F;
        float firstVal = maxUserFloat * 0.70F;
        float secondVal = maxUserFloat * 0.80F;
        float thirdVal = maxUserFloat * 0.90F;
        return List.of(new SimpleFloatProperty(firstVal),new SimpleFloatProperty(secondVal),new SimpleFloatProperty(thirdVal));
    }
    public List<FloatProperty> computeOneWave(FloatProperty maxUser)
    {
        float maxUserFloat = maxUser.floatValue();
        maxUserFloat = maxUserFloat * 0.90F;
        float firstVal = maxUserFloat * 0.75F;
        float secondVal = maxUserFloat * 0.85F;
        float thirdVal = maxUserFloat * 0.95F;
        return List.of(new SimpleFloatProperty(firstVal),new SimpleFloatProperty(secondVal),new SimpleFloatProperty(thirdVal));
    }

    public FloatProperty computeBBB(FloatProperty maxUser)
    {
        float maxUserFloat = maxUser.floatValue();
        maxUserFloat = maxUserFloat * 0.90F;
        maxUserFloat = maxUserFloat * 0.65F;
        return new  SimpleFloatProperty(maxUserFloat);
    }

}
