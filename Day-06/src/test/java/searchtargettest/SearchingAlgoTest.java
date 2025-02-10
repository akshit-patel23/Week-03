package searchtargettest;

import org.junit.Test;
import searchtarget.BinarySearch;
import searchtarget.LinearSearch;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SearchingAlgoTest {
    int[] datasets;

    public SearchingAlgoTest() {
        datasets = new int[1000]; // Fixed the array size to 1000
        for (int i = 0; i < 1000; i++) {
            datasets[i] = i + 1;
        }
    }

    BinarySearch bin = new BinarySearch();
    LinearSearch ls = new LinearSearch();

    @Test
    public void testSearchPerformance() {
        assertEquals(true,bin.search(datasets, 67) < ls.search(datasets, 67));
    }
}
