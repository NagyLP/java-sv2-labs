package introexceptionreadfiletestjunit5;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RecipeTest {

    Recipe recipe = new Recipe();

    @Test
    public void test_AddIngredients() {
        recipe.addIngredients(Paths.get("src/test/resources/recipe.txt"));

        assertEquals(10, recipe.getIngredients().size());
        assertEquals("liszt", recipe.getIngredients().get(0));
    }

    @Test
    public void test_AddIngredients_NoExFile() {
        IllegalStateException noFile = assertThrows(IllegalStateException.class,
                () -> recipe.addIngredients(Paths.get("...")));
        assertEquals("Bipp, can't read the file.", noFile.getMessage());

    }
}