package org.example.firstappfx.service.mock;

import java.util.ArrayList;
import java.util.List;

public class ListPersonMock {

    /* GET FROM DB THE ITEM*/
    public static List<PersonMock> personMockList = new ArrayList<>();

    public List<PersonMock> getAllMocks()
    {
        return ListPersonMock.personMockList;
    }

    public static PersonMock getOneByName(String name)
    {
        return personMockList.stream().filter(personMock -> personMock.getName().equals(name)).findFirst().orElseThrow();
    }

    public static PersonMock getFirstRecord()
    {
        return personMockList.get(0);
    }
}
