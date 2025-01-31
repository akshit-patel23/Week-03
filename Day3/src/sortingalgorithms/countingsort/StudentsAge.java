package sortingalgorithms.countingsort;



public class StudentsAge{
    int[] ages;

    public StudentsAge(int[] ages) {
        this.ages = ages;
    }

    public void countingSort() {
        int minAge = 10, maxAge = 18;
        int range = maxAge - minAge + 1;

        int[] count = new int[range];  // Frequency array
        int[] output = new int[ages.length]; // Sorted array

        // Step 1: Count frequency of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Step 2: Compute cumulative count
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Step 3: Place elements in correct position in output array
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            output[count[age - minAge] - 1] = age;
            count[age - minAge]--; // Decrement count
        }

        // Copy sorted elements back to original array
        System.arraycopy(output, 0, ages, 0, ages.length);
    }

    public void show() {
        for (int age : ages) {
            System.out.println(age);
        }
    }


}

