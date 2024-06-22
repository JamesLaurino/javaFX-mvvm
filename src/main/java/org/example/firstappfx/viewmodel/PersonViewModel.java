package org.example.firstappfx.viewmodel;

import javafx.beans.property.IntegerProperty;
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

    public IntegerProperty livePointProperty()
    {
        return person.livePointProperty();
    }

    public StringProperty lastNameProperty()
    {
        return person.lastNameProperty();
    }

}
