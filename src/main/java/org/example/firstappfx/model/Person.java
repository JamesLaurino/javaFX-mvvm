package org.example.firstappfx.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person
{
    private StringProperty firstName;
    private StringProperty lastName;
    private IntegerProperty livePoint;

    public Person() {
        this.firstName = new SimpleStringProperty("James");
        this.lastName = new SimpleStringProperty("Laurino");
        this.livePoint = new SimpleIntegerProperty(15);
    }

    public int getLivePoint() {
        return livePoint.get();
    }

    public IntegerProperty livePointProperty() {
        return livePoint;
    }

    public void setLivePoint(int livePoint) {
        this.livePoint.set(livePoint);
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

    public String getLastName() {
        return lastName.get();
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }
}
