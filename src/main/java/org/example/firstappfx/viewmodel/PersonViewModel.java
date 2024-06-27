package org.example.firstappfx.viewmodel;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.StringProperty;
import org.example.firstappfx.model.Person;


public class PersonViewModel
{
    private Person person;

    public PersonViewModel(Person person) {
        this.person = person;
    }

    public StringProperty firstNameProperty()
    {
        return person.firstNameProperty();
    }

    public FloatProperty benchMaxProperty()
    {
        return person.benchMaxProperty();
    }

    public FloatProperty squatMaxProperty()
    {
        return person.squatMaxProperty();
    }

    public FloatProperty deadliftMaxProperty()
    {
        return person.deadliftMaxProperty();
    }
}
