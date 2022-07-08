public class CalculateLitres {

    static float calculateLitres() {
        // Taking data from other class
        float paintableMeters = PaintableMeters.paintableMeters();

        // Data taken from google
        int litreCoverage = 12;

        // Calculating litres needed to return it to Main
        float litresNeeded = paintableMeters / litreCoverage;

        return litresNeeded;
    }
}
