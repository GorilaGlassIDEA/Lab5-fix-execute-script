package org.example.interfaces;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Я взял простую реализацию чтьения из файла, просто напиши свою в {@link ReadFileBufferedReader}
 */

public class ReadFileFiles implements Readable {

    private String path;


    public ReadFileFiles() {
    }

    @Override
    public String read(String path) throws IOException {
        return Files.readString(Path.of(path));
    }
}
