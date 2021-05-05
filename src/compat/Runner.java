package compat;
import java.util.*;
public class Runner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("First name?");
        String name1 = scan.nextLine();
        System.out.println();


        System.out.println("Second name?");
        String name2 = scan.nextLine();
        System.out.println();
    

        Compatibility com = new Compatibility();

            String avg1 = com.compatCalc(name1, name2);
            String avg2 = com.compatCalc(name2, name1);

            double avg = Integer.parseInt(avg1) + Integer.parseInt(avg2);
            System.out.println(avg/2 + "% Compatibility");
            System.out.println();
            System.out.println();

                scan.close();
    }

}