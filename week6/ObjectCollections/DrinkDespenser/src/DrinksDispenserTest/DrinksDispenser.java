package DrinksDispenserTest;

/**
 * DrinksDispense
 */
public class DrinksDispenser {
    Item[] drinks;
    int index = 0;

    public DrinksDispenser(int itemListSize){
        this.drinks = new Item[itemListSize];
    }

    public void addItem(String name, int amount){
        Item temp = new Item(name, amount);
        drinks[index] = temp;
        index++;
    }

    public boolean dispenseItem(String name){
        for (Item item : drinks) {
            if(name.equals(item.getName())){
                item.dispense();
                return true;
            }
        }
        return false;
    }

    public void restockItem(String name, int amountToBeAdded){
        for (Item item : drinks) {
            if(item.getName().equals(name)){
                item.restock(amountToBeAdded);
                System.out.println("restocked");
                break;
            }else{

            }
               }
    }

    @Override
    public String toString() {
        String details = "";
        for (Item x :drinks) {
            if (x == null){

            }
            else{
            details += x + "\n";
            }
        }
        return details;
    }
}