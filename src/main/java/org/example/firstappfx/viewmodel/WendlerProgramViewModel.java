package org.example.firstappfx.viewmodel;

import javafx.beans.property.FloatProperty;
import org.example.firstappfx.model.Person;
import org.example.firstappfx.model.mapper.MockToEntity;
import org.example.firstappfx.service.mock.ListPersonMock;
import org.example.firstappfx.service.mock.PersonMock;

public class WendlerProgramViewModel
{
    private PersonMock personMock;
    private Person person;

    public WendlerProgramViewModel() {
        this.personMock = ListPersonMock.getFirstRecord();
        this.person = new MockToEntity().PersonMockToPerson(this.personMock);
    }

    public FloatProperty getBenchMax()
    {
        return this.person.benchMaxProperty();
    }

    public FloatProperty getSquatMax()
    {
        return this.person.squatMaxProperty();
    }
    public FloatProperty getdeadliftMax()
    {
        return this.person.deadliftMaxProperty();
    }

}
