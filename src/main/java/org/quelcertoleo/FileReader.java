package org.quelcertoleo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.List;

public class FileReader {

    private FileReader() {}

    public static List<String> getNamesFromFile(final String fileName) throws IOException, URISyntaxException {
        URL fileUrl = ClassLoader.getSystemClassLoader().getResource(fileName);
        final File fileToRead = Path.of(fileUrl.toURI()).toFile();
        return FileUtils.readLines(fileToRead, StandardCharsets.UTF_8);
    }
}
