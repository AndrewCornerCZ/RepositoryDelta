package storage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;

public class IO {
    private IO(){}

    public static void writeFile(String fileName, String content) throws IOException {
        Path file = Paths.get(fileName);
        Files.write(file, Collections.singleton(content), StandardCharsets.UTF_8);
    }

    public static String readFile(String fileName) throws IOException {
        Path filepath = Path.of(fileName);
        return Files.readString(filepath);
    }

    public static boolean isFileExists(String fileName) throws IOException {
        Path filepath = Paths.get(fileName);
        return Files.exists(filepath);
    }

}
