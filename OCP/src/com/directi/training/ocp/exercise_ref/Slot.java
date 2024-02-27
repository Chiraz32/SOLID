package com.directi.training.ocp.exercise_ref;

public abstract class Slot {

    public abstract void markSlotFree(int resourceId);

    public abstract void markSlotBusy(int resourceId);

    public abstract int findSlotFree();

}
