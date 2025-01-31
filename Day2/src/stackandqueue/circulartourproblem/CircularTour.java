package stackandqueue.circulartourproblem;

public class CircularTour {
    public int result(int[][] arr) {
        int totalSurplus = 0;
        int currentSurplus = 0;
        int startIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            int petrol = arr[i][0];
            int distance = arr[i][1];
            int balance = petrol - distance;

            totalSurplus += balance;
            currentSurplus += balance;

            // If at any point, current surplus becomes negative, reset starting point
            if (currentSurplus < 0) {
                startIndex = i + 1;
                currentSurplus = 0;  // Reset current surplus
            }
        }
        return (totalSurplus >= 0) ? startIndex : -1;
    }
}
