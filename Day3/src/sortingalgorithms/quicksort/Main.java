package sortingalgorithms.quicksort;

public class Main {
    public static void main(String[] args) {
        int[] productPrices = {599, 299, 999, 199, 899};
        Products product = new Products(productPrices);

        System.out.println("Before Sorting:");
        product.show();

        product.sort();

        System.out.println("After Sorting:");
        product.show();
    }
}
