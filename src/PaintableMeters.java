public class PaintableMeters {

    static float paintableMeters() {
        //Getting information from other classes
        float squareMeters = Walls.myWalls();
        float doorSquareMeters = Doors.myDoors();
        float winSquareMeters = Windows.myWindows();
        float socketSquareMeters = Sockets.mySockets();

        // Calculating the data I want to provide in this class.
        float paintableMetres = squareMeters - doorSquareMeters - winSquareMeters - socketSquareMeters;

        return paintableMetres;
    }
}