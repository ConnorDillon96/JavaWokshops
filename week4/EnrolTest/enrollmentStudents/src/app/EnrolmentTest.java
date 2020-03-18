package app;

import java.util.Scanner;


/**
 * EnrolmentTest
 */
public class EnrolmentTest {
    public static void main(String[] args) {
        StudentList sl = new StudentList(10);
        Scanner sc = new Scanner(System.in);



        while (true){
            System.out.println("0: Quit\n1: Add part-time student \n2: Add full-time student\n3: Display all\n");
            int input = sc.nextInt();

            if(input == 0){
                sc.close();
                break;
            }else if (input == 1){
                System.out.println("name ? ");
                String name = sc.next();
                System.out.println("number of modules : ");
                int number = sc.nextInt();
                sl.addPartTime(name, number);
            }else if(input == 2){
                System.out.println("name ? ");
                String name = sc.next();
                sl.addFullTime(name);
            }else if(input == 3) {
                System.out.println(sl.toString());
            }
            else{
                System.out.println("Invalid input");
            }
                
        }
        
    }

    
}