package org.example.firstappfx.viewmodel;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.StringProperty;
import org.example.firstappfx.model.dto.PersonDto;
import org.example.firstappfx.model.mapper.DtoToEntity;
import org.example.firstappfx.service.data.PersonEntityDataService;
import org.example.firstappfx.service.file.FileExtractor;
import org.example.firstappfx.model.entity.PersonEntity;

import static org.example.firstappfx.service.data.PersonEntityDataService.personEntityListService;


public class UserFormViewModel
{
    private FileExtractor fileExtractor;
    private PersonEntity personEntity;
    private PersonDto personDto;

    public UserFormViewModel() {

        this.fileExtractor = new FileExtractor();
        PersonEntity personEntityUser = this.fileExtractor.extractionAndParsed();

        if(personEntityListService.isEmpty())
            personEntityListService.add(personEntityUser);

        this.personEntity = PersonEntityDataService.getFirstRecord();
        this.personDto = new DtoToEntity().PersonEntityToPersonDto(this.personEntity);
    }

    public StringProperty firstNameProperty()
    {
        return personDto.firstNameProperty();
    }

    public FloatProperty benchMaxProperty()
    {
        return personDto.benchMaxProperty();
    }

    public FloatProperty squatMaxProperty()
    {
        return personDto.squatMaxProperty();
    }

    public FloatProperty deadliftMaxProperty()
    {
        return personDto.deadliftMaxProperty();
    }
}
