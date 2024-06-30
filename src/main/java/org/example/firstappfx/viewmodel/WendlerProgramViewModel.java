package org.example.firstappfx.viewmodel;

import javafx.beans.property.FloatProperty;
import org.example.firstappfx.model.Person;
import org.example.firstappfx.model.mapper.MockToEntity;
import org.example.firstappfx.service.file.FileAdder;
import org.example.firstappfx.service.file.FileExtractor;
import org.example.firstappfx.service.mock.PersonMock;

import java.io.FileWriter;

public class WendlerProgramViewModel
{
    private PersonMock personMock;
    private Person person;
    private FileAdder fileAdder;

    public WendlerProgramViewModel(PersonMock personMockUser) {
        this.fileAdder = new FileAdder();
        this.fileAdder.writeToFile(personMockUser.toString());
        this.personMock = personMockUser;
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
