package sortingalgorithms.insertionsort;

public class Main {
    public static void main(String[] args) {
        int []arr={234,568,890,453,123};

        Employee e= new Employee(arr);
        System.out.println("Before Insertion Sort----------");
        e.show();
        System.out.println("After Insertion Sort----------");
        e.insertionSort(arr);
        e.show();
    }
}
