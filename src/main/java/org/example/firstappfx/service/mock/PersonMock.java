package org.example.firstappfx.service.mock;

import org.example.firstappfx.model.Person;

import java.util.List;

public class PersonMock
{
    private int id;
    private String name;
    private Float maxBench;
    private Float maxDeadlift;
    private Float maxSquat;

    public PersonMock(int id, String name, Float maxBench, Float maxDeadlift, Float maxSquat) {
        this.id = id;
        this.name = name;
        this.maxBench = maxBench;
        this.maxDeadlift = maxDeadlift;
        this.maxSquat = maxSquat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
