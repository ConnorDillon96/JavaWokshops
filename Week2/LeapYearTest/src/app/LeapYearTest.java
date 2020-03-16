package app;

import java.util.Scanner;


/**
 * LeapYearTest
 */
public class LeapYearTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String RUNNING;
        Boolean result;
        do{
            System.out.println("Year\t:\t");
            int year = sc.nextInt();
            if  (year % 100 == 0){
                if (year % 400 == 0){
                    result = true;
                    System.out.println("Leap year : " +  result);
                }else{
                    result=false;
                    System.out.println("Leap year : " + result);
                }
            }else if(year % 4 == 0){
                result = true;
                System.out.println("Leap year : " + result);
            }else{
                result = false;
                System.out.println("Leap year : " + result);
            }

            System.out.println("Continue Y/N : ");
            sc.nextLine();
            RUNNING = sc.next().toUpperCase();
        
        }while (RUNNING.equals("Y"));
        
    }

    
}