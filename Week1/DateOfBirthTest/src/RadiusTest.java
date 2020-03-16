import java.util.Scanner;

import javax.crypto.Mac;
/**
 * RadiusTest
 */
public class RadiusTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Radius : ");
        float raidus = sc.nextFloat();
        System.out.println("Circumference: " + 2*(Math.PI) * (raidus));
        System.out.println("Area: " + Math.pow(Math.PI * raidus, 2));
        System.out.println("Volume: " + (4*22*raidus*raidus*raidus)/(3*7));
        sc.close();

    }
}