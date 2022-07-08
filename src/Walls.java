import java.util.Locale;
import java.util.Scanner;

public class Walls {



    static float myWalls() {

        float squareMeters = 0;

        //This line is using the 3 things to define a new scanner variable
        Scanner myScanner = new Scanner(System.in);

        System.out.println("How many walls do you want to paint?");
        int wallNum = myScanner.nextInt();

        for (int i = 1; i <= wallNum; i++) {
            System.out.println("How high, in meters, is your wall " + i + "?");
            //instead of telling height specifically what it is storing we use the scanner to make it flexible.
            float height = myScanner.nextFloat();

            System.out.println("How wide, in meters, is your wall " + i + "?");
            //instead of telling wide specifically what it is storing we use the scanner to make it flexible.
            float wide = myScanner.nextFloat();

            squareMeters = squareMeters + (height * wide);
        }

        return squareMeters;
    }
}
