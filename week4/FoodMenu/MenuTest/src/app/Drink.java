package app;
/**
 * Drink
 */
public class Drink extends MenuItem {
    int mills;

    public Drink(String name, int mills, int price){
        super(name, price);
        this.mills = mills;
    }

    @Override
    public String toString() {
        return "name : " + name + " mills : " + mills + " price : " + price;
    }
}