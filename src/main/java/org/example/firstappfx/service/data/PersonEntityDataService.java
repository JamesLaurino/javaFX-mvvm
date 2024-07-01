package org.example.firstappfx.service.data;

import org.example.firstappfx.model.entity.PersonEntity;

import java.util.ArrayList;
import java.util.List;

public class PersonEntityDataService {

    /* GET FROM DB THE ITEM */
    public static List<PersonEntity> personEntityListService = new ArrayList<>();

    public List<PersonEntity> getAllMocks()
    {
        return PersonEntityDataService.personEntityListService;
    }

    public static PersonEntity getOneByName(String name)
    {
        return personEntityListService.stream().filter(personMock -> personMock.getName().equals(name))
                .findFirst().orElseThrow();
    }

    public static PersonEntity getFirstRecord()
    {
        return personEntityListService.get(0);
    }
}
