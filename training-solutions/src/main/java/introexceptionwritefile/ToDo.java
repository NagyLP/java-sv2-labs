package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> todos = new ArrayList<>();

        boolean switchEXIT = false;
        while (switchEXIT == false) {
            System.out.println(" Kérem adja meg a következő teendőt! Műveletként értve, \"x\"+Enter a kilépés.");
            String todo = scanner.nextLine();
            if (todo.equals("x")) {
                switchEXIT = true;
            } else {
                todos.add(todo);
            }
        }

        try {
            Files.write(Paths.get("src/main/resources/todos.txt"), todos);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
