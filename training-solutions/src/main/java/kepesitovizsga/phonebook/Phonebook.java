package kepesitovizsga.phonebook;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Phonebook {

    public void exportPhonebook(TreeMap<String, String> contacts, String output) {
        if (contacts == null || output == null) {
            throw new IllegalArgumentException("Contacts OR Output is null.");
        }
        try {
            Files.write(Path.of(output), entryFromLine(contacts));
        } catch (IOException ioe) {
            throw new IllegalStateException("Cant write file." + ioe);
        }
    }

    private List<String> entryFromLine(TreeMap<String, String> contacts) {
        List<String> entryFromLine = new ArrayList<>();
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            entryFromLine.add(entry.getKey().concat(": ").concat(entry.getValue()));
        }
        return entryFromLine;
    }
}
