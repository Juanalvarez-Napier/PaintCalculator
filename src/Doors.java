import java.util.Scanner;

public class Doors {



    static float myDoors() {

        float doorSquareMeters = 0;

        //This line is using the 3 things to define a new scanner variable
        Scanner myScanner = new Scanner(System.in);

        System.out.println("How many doors do you have in your walls?");
        int doorNum = myScanner.nextInt();

        for (int i = 1; i <= doorNum; i++) {
            System.out.println("How high, in meters, is your door " + i + "?");
            //instead of telling height specifically what it is storing we use the scanner to make it flexible.
            float height = myScanner.nextFloat();

            System.out.println("How wide, in meters, is your door " + i + "?");
            //instead of telling wide specifically what it is storing we use the scanner to make it flexible.
            float wide = myScanner.nextFloat();

            doorSquareMeters = doorSquareMeters + (height * wide);
        }

        return doorSquareMeters;
    }
}