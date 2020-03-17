package app;
/**
 * Food
 */
public class Food extends MenuItem {
    boolean vegetarian;
    
    public Food(String name, int price, Boolean vegetarian){
        super(name, price);
        this.vegetarian = vegetarian;
        vegetarian = false;
    }

    /**
     * @param vegetarian the vegetarian to set
     */
    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public boolean checkveg(){
        if (this.vegetarian== true){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Name: " + name  + " Vegetarian : " + vegetarian + " Price" + price;
    }

}
