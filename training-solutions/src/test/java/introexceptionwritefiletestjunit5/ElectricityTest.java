package introexceptionwritefiletestjunit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ElectricityTest {

    @TempDir
    File tempFold;

    Electricity electricity = new Electricity();

    @Test
    public void testWriteStreets() throws IOException {
        Path path = tempFold.toPath().resolve("TEMP-TEST_streets.txt");
        List<String> testList = Files.readAllLines(path);

        assertEquals(6, testList.size());
        assertEquals("Arany J. utca", testList.get(0));

    }

}