package Objects.ItemTest;

import java.util.Scanner;

/**
 * ItemTest
 */
public class ItemTest {

    public static void main(String[] args) {
        Item drink1 = new Item("coke", 100);
        Scanner sc = new Scanner(System.in);
        int input = -1;


        while (input !=0){
            System.out.println("0: Quit\n1: Restock \n2: Dispense \n3: Amount in stock");
            input = sc.nextInt();
            if (input == 1){
                System.out.println("How many to restock?");
                int reStock = sc.nextInt();
                drink1.restock(reStock);

            }else if (input == 2){
                drink1.dispense();
                System.out.println("Dispensed");

            }else if (input == 0){
                System.out.println("Goodbye");
            }else if(input == 3){
                System.out.println(drink1.getAmountInStock());
            }
            else{
                System.out.println("Invalid input");
            }
        }
        sc.close();
    }
}