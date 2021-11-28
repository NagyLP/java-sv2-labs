package introexceptionreadfiletestjunit5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Recipe {

    private final List<String> ingredients = new ArrayList<>();

    public void addIngredients(Path path) {
        for (int i = 2; i < fileInRead(path).size(); i++) {
            String[] tmp = fileInRead(path).get(i).split(" ");
            ingredients.add(tmp[2]);
        }
    }

    private List<String> fileInRead(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Bipp, can't read the file.", ioe);
        }
    }

    public List<String> getIngredients() {
        return ingredients;
    }

//    public static void main(String[] args) {
//        Recipe ooo = new Recipe();
//        ooo.addIngredients(Paths.get("src/test/resources/recipe.txt"));
//        System.out.print(ooo.getIngredients());
//    }
}
