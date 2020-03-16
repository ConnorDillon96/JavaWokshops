import java.util.Scanner;
public class DateOfBirthTest{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Day you were born : ");
        String day = sc.nextLine();
        System.out.println("The month you were born : ");
        String month = sc.nextLine();
        System.out.println("The year you were born : ");
        String year = sc.nextLine();
        System.out.println("Your date of birth is \t" + day+"/"+month+"/"+year);
    }
}