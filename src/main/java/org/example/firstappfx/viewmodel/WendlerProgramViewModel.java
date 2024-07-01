package org.example.firstappfx.viewmodel;

import javafx.beans.property.FloatProperty;
import org.example.firstappfx.model.dto.PersonDto;
import org.example.firstappfx.model.mapper.DtoToEntity;
import org.example.firstappfx.service.file.FileAdder;
import org.example.firstappfx.model.entity.PersonEntity;

public class WendlerProgramViewModel
{
    private PersonEntity personEntity;
    private PersonDto personDto;
    private FileAdder fileAdder;

    public WendlerProgramViewModel(PersonEntity personEntityUser) {
        this.fileAdder = new FileAdder();
        this.fileAdder.writeToFile(personEntityUser.toString());
        this.personEntity = personEntityUser;
        this.personDto = new DtoToEntity().PersonEntityToPersonDto(this.personEntity);
    }

    public FloatProperty getBenchMax()
    {
        return this.personDto.benchMaxProperty();
    }
    public FloatProperty getSquatMax()
    {
        return this.personDto.squatMaxProperty();
    }
    public FloatProperty getdeadliftMax()
    {
        return this.personDto.deadliftMaxProperty();
    }

}
