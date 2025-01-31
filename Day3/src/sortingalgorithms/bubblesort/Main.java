package sortingalgorithms.bubblesort;

public class Main {
    public static void main(String[] args) {
        int [] arr={67,43,56,22,98};

        StudentMarks s= new StudentMarks(arr);
        System.out.println("Marks Before Sorting -----------");
        s.show();
        System.out.println("Marks After Sorting -----------");
        s.bubblesort(arr);
        s.show();
    }
}
