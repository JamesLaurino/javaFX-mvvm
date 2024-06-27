package org.example.firstappfx.model.mapper;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import org.example.firstappfx.model.Person;
import org.example.firstappfx.service.mock.PersonMock;

public class MockToEntity
{
    public Person PersonMockToPerson(PersonMock personMock)
    {
        StringProperty personNameDto = new SimpleStringProperty(personMock.getName());
        FloatProperty personBenchDto = new SimpleFloatProperty(personMock.getMaxBench());
        FloatProperty personSquatDto = new SimpleFloatProperty(personMock.getMaxSquat());
        FloatProperty personDeadliftDto = new SimpleFloatProperty(personMock.getMaxDeadlift());
        return new Person(personNameDto,personSquatDto,personBenchDto,personDeadliftDto);
    }
}
