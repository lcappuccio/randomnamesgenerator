package org.quelcertoleo;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileReaderTest {

    @Test
    void should_read_italian_names_file() throws IOException, URISyntaxException {
        List<String> namesFromFile = FileReader.getNamesFromFile("FirstNamesItaly.txt");

        assertEquals(170, namesFromFile.size());
        assertEquals("Marco", namesFromFile.get(0));
        assertEquals("Guglielmo", namesFromFile.get(namesFromFile.size()-1));
    }

}