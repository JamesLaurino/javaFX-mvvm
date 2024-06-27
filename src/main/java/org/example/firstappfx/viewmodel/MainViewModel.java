package org.example.firstappfx.viewmodel;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.StringProperty;
import org.example.firstappfx.model.Person;
import org.example.firstappfx.model.mapper.MockToEntity;
import org.example.firstappfx.service.mock.ListPersonMock;
import org.example.firstappfx.service.mock.PersonMock;


public class MainViewModel
{
    private PersonMock personMock;
    private Person person;

    public MainViewModel() {
        this.personMock = ListPersonMock.getFirstRecord();
        this.person = new MockToEntity().PersonMockToPerson(this.personMock);
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
