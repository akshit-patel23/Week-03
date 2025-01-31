package sortingalgorithms.mergesort;

public class Main {
    public static void main(String[] args) {
        int[] bookPrices = {500, 200, 400, 100, 300};
        Books books = new Books(bookPrices);

        System.out.println("Before Sorting:");
        books.show();

        books.sort();
        System.out.println("After Sorting:");
        books.show();
    }
}
