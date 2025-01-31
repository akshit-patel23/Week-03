package sortingalgorithms.countingsort;

public class Main {
    public static void main(String[] args) {
        int[] studentAges = {12, 15, 10, 18, 14, 16, 12, 17, 13, 11};
        StudentsAge sorter = new StudentsAge(studentAges);

        System.out.println("Before Sorting:");
        sorter.show();

        sorter.countingSort(); // Sorting ages

        System.out.println("After Sorting:");
        sorter.show();
    }
}
