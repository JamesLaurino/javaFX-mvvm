package org.example.firstappfx.service.file;

import org.example.firstappfx.model.entity.PersonEntity;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.example.firstappfx.service.file.constant.fileConstant.FILE_PATH;

public class FileExtractor
{

    public FileExtractor() {}

    public PersonEntity extractionAndParsed()
    {
        PersonEntity personEntity = new PersonEntity();
        try {

            File myObj = new File(FILE_PATH);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                personEntity = parsing(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred during the extraction of the file");
            e.printStackTrace();
        }
        return personEntity;

    }

    private PersonEntity parsing(String ligne)
    {
        String[] ligneParsed = ligne.split(",");
        String name = ligneParsed[0];
        String benchMax = ligneParsed[1];
        String deadMax = ligneParsed[2];
        String squatMax = ligneParsed[3];

        return new PersonEntity(name, Float.valueOf(benchMax), Float.valueOf(deadMax), Float.valueOf(squatMax));

    }
}
