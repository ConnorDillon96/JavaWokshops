package AccountListTest.src;

/**
 * Account
 */
public class Account {
    float number;
    String name;
    double balance;

    Account(float number, String name, Double balance){
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return this.number + "\t" +this.name + "\t\t\t" + this.balance + "\n";
    }






    
}