package sortingalgorithms.heapsort;

public class Main {
    public static void main(String[] args) {
        int[] salaryDemands = {50000, 30000, 70000, 40000, 60000};
        JobApplicants jobApp = new JobApplicants(salaryDemands);

        System.out.println("Before Sorting:");
        jobApp.show();

        jobApp.heapSort(); // Sorting salary demands

        System.out.println("After Sorting:");
        jobApp.show();
    }
}
