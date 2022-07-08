import java.util.Scanner;

public class Windows {



    static float myWindows() {

        float windowsSquareMeters = 0;

        //This line is using the 3 things to define a new scanner variable
        Scanner myScanner = new Scanner(System.in);

        System.out.println("How many windows do you have in your walls?");
        int winNum = myScanner.nextInt();

        for (int i = 1; i <= winNum; i++) {
            System.out.println("How high, in meters, is your window " + i + "?");
            //instead of telling height specifically what it is storing we use the scanner to make it flexible.
            float height = myScanner.nextFloat();

            System.out.println("How wide, in meters, is your window " + i + "?");
            //instead of telling wide specifically what it is storing we use the scanner to make it flexible.
            float wide = myScanner.nextFloat();

            windowsSquareMeters = windowsSquareMeters + (height * wide);
        }

        return windowsSquareMeters;
    }
}