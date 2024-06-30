package org.example.firstappfx.service.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static org.example.firstappfx.service.file.constant.fileConstant.FILE_PATH;

public class FileAdder
{
    public FileAdder() {}

    public void writeToFile(String data) {

        boolean isWritten = false;

        try (FileWriter fileWriter = new FileWriter(FILE_PATH);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            bufferedWriter.write(data);

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file");
            e.printStackTrace();
        }

    }
}
