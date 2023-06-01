package org.quelcertoleo;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FileReaderTest {

    @Test
    void should_throw_exception_on_non_existing_file() {
        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                FileReader.getNamesFromFile("I_Do_Not_Exist.txt"));

        assertEquals("File does not exist", exception.getMessage());
    }

    @Test
    void should_read_italian_names_file() throws IOException, URISyntaxException {
        List<String> namesFromFile = FileReader.getNamesFromFile("FirstNamesItaly.txt");

        assertEquals(170, namesFromFile.size());
        assertEquals("Marco", namesFromFile.get(0));
        assertEquals("Guglielmo", namesFromFile.get(namesFromFile.size()-1));
    }

}