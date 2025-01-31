package stackandqueue.circulartourproblem;

public class Main {
    public static void main(String[] args) {
        CircularTour circularTour = new CircularTour();

        // Example petrol pumps: {petrol available, distance to next pump}
        int[][] petrolPumps = {
                {12, 6},  // Pump 0
                {6, 5},  // Pump 1
                {7, 3},  // Pump 2
                {4, 5}   // Pump 3
        };

        int startIndex = circularTour.result(petrolPumps);

        if (startIndex == -1) {
            System.out.println("No valid starting point for completing the circular tour.");
        } else {
            System.out.println("Start the tour at petrol pump index: " + startIndex);
        }
    }
}
