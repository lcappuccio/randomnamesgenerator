package org.quelcertoleo;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.List;

public class FileReader {

    private FileReader() {}

    public static List<String> getNamesFromFile(final String fileName) throws IOException, URISyntaxException {
        final URL fileUrl = ClassLoader.getSystemClassLoader().getResource(fileName);
        if (fileUrl == null) {
            throw new IllegalArgumentException("File does not exist");
        }
        final URI fileUri = fileUrl.toURI();
        final File fileToRead = Path.of(fileUri).toFile();
        return FileUtils.readLines(fileToRead, StandardCharsets.UTF_8);
    }
}
