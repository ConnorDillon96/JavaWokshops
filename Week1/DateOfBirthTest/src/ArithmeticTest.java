import java.util.Scanner;

/**
 * ArithmeticTest
 */
public class ArithmeticTest {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("number 1 : ");
        int no1 = sc.nextInt();
        System.out.println("number 2 : ");
        int no2 = sc.nextInt(); 

        System.out.println("Addition : " + no1 + no2);
        System.out.println("Subtraction : " + (no1 - no2));
        System.out.println("Whole point division : " + (no1 / no2) + "remainder " + (no1%no2));
        System.out.println("Floating point divison : " + (float) no1/no2);
    }
} 