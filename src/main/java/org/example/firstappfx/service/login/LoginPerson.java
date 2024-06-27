package org.example.firstappfx.service.login;

import org.example.firstappfx.service.mock.ListPersonMock;
import org.example.firstappfx.service.mock.PersonMock;

public class LoginPerson
{
    private ListPersonMock listPersonMock= new ListPersonMock();

    public Boolean getLogin(String name)
    {
        PersonMock personMock = listPersonMock.getOneByName(name);
        return personMock != null;
    }

}
