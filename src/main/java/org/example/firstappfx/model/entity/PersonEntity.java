package org.example.firstappfx.model.entity;

public class PersonEntity
{
    private String name;
    private Float maxBench;
    private Float maxDeadlift;
    private Float maxSquat;

    public PersonEntity(){}

    public PersonEntity(String name, Float maxBench, Float maxDeadlift, Float maxSquat) {
        this.name = name;
        this.maxBench = maxBench;
        this.maxDeadlift = maxDeadlift;
        this.maxSquat = maxSquat;
    }

    @Override
    public String toString() {
        return this.getName() + "," + this.getMaxBench() + "," + this.getMaxDeadlift() + "," + this.getMaxSquat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMaxBench() {
        return maxBench;
    }

    public void setMaxBench(Float maxBench) {
        this.maxBench = maxBench;
    }

    public Float getMaxDeadlift() {
        return maxDeadlift;
    }

    public void setMaxDeadlift(Float maxDeadlift) {
        this.maxDeadlift = maxDeadlift;
    }

    public Float getMaxSquat() {
        return maxSquat;
    }

    public void setMaxSquat(Float maxSquat) {
        this.maxSquat = maxSquat;
    }
}