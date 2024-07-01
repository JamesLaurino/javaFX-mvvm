package org.example.firstappfx.model.dto;

import javafx.beans.property.*;

public class PersonDto
{
    private StringProperty firstName;
    private FloatProperty squatMax;
    private FloatProperty benchMax;
    private FloatProperty deadliftMax;

    public PersonDto(StringProperty firstName, FloatProperty squatMax, FloatProperty benchMax, FloatProperty deadliftMax) {
        this.firstName = firstName;
        this.squatMax = squatMax;
        this.benchMax = benchMax;
        this.deadliftMax = deadliftMax;
    }

    public PersonDto() {
        this.firstName = new SimpleStringProperty("James");
        this.squatMax = new SimpleFloatProperty(120);
        this.benchMax = new SimpleFloatProperty(100);
        this.deadliftMax = new SimpleFloatProperty(150);
    }

    public String getFirstName() {
        return firstName.get();
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public float getSquatMax() {
        return squatMax.get();
    }

    public FloatProperty squatMaxProperty() {
        return squatMax;
    }

    public void setSquatMax(float squatMax) {
        this.squatMax.set(squatMax);
    }

    public float getBenchMax() {
        return benchMax.get();
    }

    public FloatProperty benchMaxProperty() {
        return benchMax;
    }

    public void setBenchMax(float benchMax) {
        this.benchMax.set(benchMax);
    }

    public float getDeadliftMax() {
        return deadliftMax.get();
    }

    public FloatProperty deadliftMaxProperty() {
        return deadliftMax;
    }

    public void setDeadliftMax(float deadliftMax) {
        this.deadliftMax.set(deadliftMax);
    }
}