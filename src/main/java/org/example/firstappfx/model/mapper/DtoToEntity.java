package org.example.firstappfx.model.mapper;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import org.example.firstappfx.model.dto.PersonDto;
import org.example.firstappfx.model.entity.PersonEntity;

public class DtoToEntity
{
    public PersonDto PersonEntityToPersonDto(PersonEntity personEntity)
    {
        StringProperty personNameDto = new SimpleStringProperty(personEntity.getName());
        FloatProperty personBenchDto = new SimpleFloatProperty(personEntity.getMaxBench());
        FloatProperty personSquatDto = new SimpleFloatProperty(personEntity.getMaxSquat());
        FloatProperty personDeadliftDto = new SimpleFloatProperty(personEntity.getMaxDeadlift());
        return new PersonDto(personNameDto,personSquatDto,personBenchDto,personDeadliftDto);
    }
}
