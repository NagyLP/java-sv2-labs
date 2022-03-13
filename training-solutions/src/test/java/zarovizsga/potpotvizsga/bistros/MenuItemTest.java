package zarovizsga.potvizsga.bistros;

import org.junit.jupiter.api.Test;
import zarovizsga.potpotvizsga.bistros.MenuItem;
import zarovizsga.potpotvizsga.bistros.MenuItemType;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MenuItemTest {


    @Test
    void createMenuItemTest() {
        MenuItem menuItem = new MenuItem("Chicken", 3450, MenuItemType.FOOD);

        assertEquals("Chicken", menuItem.getName());
        assertEquals(MenuItemType.FOOD, menuItem.getType());
    }


    @Test
    void testGetPrice() {
        MenuItem menuItem = new MenuItem("Chicken", 3450, MenuItemType.FOOD);

        assertEquals(4140, menuItem.getPrice());

        menuItem = new MenuItem("Coke", 500, MenuItemType.DRINK);

        assertEquals(635, menuItem.getPrice());
    }

}