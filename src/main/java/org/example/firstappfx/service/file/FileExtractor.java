package org.example.firstappfx.service.file;

import org.example.firstappfx.service.mock.PersonMock;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.example.firstappfx.service.file.constant.fileConstant.FILE_PATH;

public class FileExtractor
{

    public FileExtractor() {}

    public PersonMock extractionAndParsed()
    {
        PersonMock personMock = new PersonMock();
        try {

            File myObj = new File(FILE_PATH);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                personMock = parsing(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred during the extraction of the file");
            e.printStackTrace();
        }
        return personMock;

    }

    private PersonMock parsing(String ligne)
    {
        String[] ligneParsed = ligne.split(",");
        String name = ligneParsed[0];
        String benchMax = ligneParsed[1];
        String deadMax = ligneParsed[2];
        String squatMax = ligneParsed[3];

        return new PersonMock(name, Float.valueOf(benchMax), Float.valueOf(deadMax), Float.valueOf(squatMax));

    }
}
