import java.util.Scanner;

public class Sockets {



    static float mySockets() {

        float socketsSquareMeters = 0;

        //This line is using the 3 things to define a new scanner variable
        Scanner myScanner = new Scanner(System.in);

        System.out.println("How many sockets do you have in your walls?");
        int socketNum = myScanner.nextInt();

        for (int i = 1; i <= socketNum; i++) {
            System.out.println("How high, in meters, is your socket " + i + "?");
            //instead of telling height specifically what it is storing we use the scanner to make it flexible.
            float height = myScanner.nextFloat();

            System.out.println("How wide, in meters, is your socket " + i + "?");
            //instead of telling wide specifically what it is storing we use the scanner to make it flexible.
            float wide = myScanner.nextFloat();

            socketsSquareMeters = socketsSquareMeters + (height * wide);
        }

        return socketsSquareMeters;
    }
}