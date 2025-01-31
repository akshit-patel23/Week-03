package sortingalgorithms.mergesort;

public class Books {
    int[] prices;

    public Books(int[] prices) {
        this.prices = prices;
    }

    public void merge(int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        System.arraycopy(prices, left, leftArr, 0, n1);
        System.arraycopy(prices, mid + 1, rightArr, 0, n2);

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                prices[k++] = leftArr[i++];
            } else {
                prices[k++] = rightArr[j++];
            }
        }
        while (i < n1) {
            prices[k++] = leftArr[i++];
        }
        while (j < n2) {
            prices[k++] = rightArr[j++];
        }
    }

    public void mergesort(int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergesort(left, mid);
            mergesort(mid + 1, right);
            merge(left, mid, right);
        }
    }


    public void sort() {
        mergesort(0, prices.length - 1);
    }

    public void show() {
        for (int i : prices) {
            System.out.println(i);
        }
    }


}
