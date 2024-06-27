package org.example.firstappfx.service.mock;

import java.util.List;

public class ListPersonMock {

    private static List<PersonMock> personMockList = List.of(
            new PersonMock(1,"Thomas",100.0F,150.0F,120.0F),
            new PersonMock(2,"James",120F,200F,180F),
            new PersonMock(3,"Alain",140F,250F,200F)
    );

    public List<PersonMock> getAllMocks()
    {
        return ListPersonMock.personMockList;
    }

    public PersonMock getOneByName(String name)
    {
        return personMockList.stream().filter(personMock -> personMock.getName().equals(name)).findFirst().orElseThrow();
    }
}
