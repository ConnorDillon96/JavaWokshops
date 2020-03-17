package Objects.ItemTest;

/**
 * Item
 */
public class Item {
    String name;
    int amountInStock;

    public Item(String name, int amountInStock){
        this.name = name;
        this.amountInStock = amountInStock;
    }

    public Boolean dispense(){
        boolean dispensed;
        if (this.amountInStock > 0){
            dispensed = true;
            this.amountInStock -= 1;
        }else{
            dispensed = false;
        }
        return dispensed;
    }

    public void restock(int reStockNumber){
        this.amountInStock += reStockNumber;
    }

    /**
     * @return the amountInStock
     */
    public int getAmountInStock() {
        return amountInStock;
    }

    @Override
    public String toString() {
        return ("Name \t:\t" + this.name + "Amount \t:\t" + this.amountInStock);
    }
}