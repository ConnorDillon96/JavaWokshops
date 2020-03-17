package app;

/**
 * MenuItemTest
 */
public class MenuItemTest {

    public static void main(String[] args) {
        Drink d1 = new Drink("coke", 2, 5);
        Food fish = new Food("samon", 22, false);
        Food steak = new Food("steak", 50, false);

        System.out.println(d1);
        System.out.println(fish);
        System.out.println(steak);
        steak.setVegetarian(true);
        System.out.println(steak);
    }
}