package sortingalgorithms.heapsort;


public class JobApplicants {
    int[] salaries;

    public JobApplicants(int[] salaries) {
        this.salaries = salaries;
    }

    private void heapify(int n, int i) {
        int largest = i;  // Assume root is the largest
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }

        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }

        if (largest != i) { // If the largest is not root
            swap(i, largest);
            heapify(n, largest); // Recursively heapify the affected subtree
        }
    }

    public void heapSort() {
        int n = salaries.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(n, i);
        }

        // Step 2: Extract elements from heap
        for (int i = n - 1; i > 0; i--) {
            swap(0, i); // Move current root to end
            heapify(i, 0); // Heapify reduced heap
        }
    }

    private void swap(int i, int j) {
        int temp = salaries[i];
        salaries[i] = salaries[j];
        salaries[j] = temp;
    }

    public void show() {
        for (int salary : salaries) {
            System.out.println(salary);
        }
    }


}
