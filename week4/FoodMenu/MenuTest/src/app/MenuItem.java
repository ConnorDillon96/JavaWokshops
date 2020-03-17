package app;
/**
 * MenuItem
 */
public class MenuItem {
    String name;
    int price;
    
    public MenuItem(String name, int price){
        this.name = name; 
        this.price = price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name: " + name + "Price: " + price;
    }
    
}