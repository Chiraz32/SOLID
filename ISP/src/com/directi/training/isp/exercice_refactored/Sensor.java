package com.directi.training.isp.exercice_refactored;

import java.util.Random;

public class Sensor
{
    public void register(IProximity prximity)
    {
        while (true) {
            if (isPersonClose()) {
                prximity.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose()
    {
        return new Random().nextBoolean();
    }
}
