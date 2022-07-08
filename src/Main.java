import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);

        float litresNeeded = CalculateLitres.calculateLitres();
        float paintableMetres = PaintableMeters.paintableMeters();

        System.out.println("Your wall has " + paintableMetres + " paintable square meters");
        System.out.println("you will need " + litresNeeded + " litres of paint to cover the wall");

        float bigCan = 5;
        float midCan = 2.5f;
        float smallCan = 1;

        if (litresNeeded > bigCan) {
            int bigCanNeeded = (int) (litresNeeded / bigCan + 1);
            System.out.println("You will need " + bigCanNeeded + " big 5 litre cans of paint.");

        } else if (litresNeeded > midCan) {
            int midCanNeeded = (int) (litresNeeded / midCan + 1);
            System.out.println("You will need " + midCanNeeded + " mid 2.5 litre cans of paint.");
        } else {
            int smallCanNeeded = (int) (litresNeeded / smallCan + 1);
            System.out.println("You will need " + smallCanNeeded + " small 1 litre cans of paint.");
        }
    }
}