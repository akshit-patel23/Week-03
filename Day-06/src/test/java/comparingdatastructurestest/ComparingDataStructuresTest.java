package comparingdatastructuretest;

import org.junit.Test;
import java.util.HashSet;
import java.util.TreeSet;
import static org.junit.Assert.assertEquals;
import static datastructuresforsearching.ArrayCode.search;

public class ComparingDataStructuresTest {
    int[] arr = {89, 23, 45, 12, 67, 34, 99, 5, 78, 43, 56, 90, 32, 11, 77, 24, 68, 39, 18, 50,
            82, 95, 62, 14, 71, 88, 6, 27, 44, 58, 72, 19, 81, 30, 91, 15, 26, 83, 64, 33,
            40, 98, 54, 9, 37, 70, 21, 100, 59, 13, 31, 55, 79, 97, 66, 7, 48, 41, 75, 17,
            28, 96, 85, 1, 49, 10, 74, 92, 3, 60, 35, 84, 4, 42, 80, 16, 25, 2, 57, 29,
            87, 61, 52, 46, 22, 63, 76, 8, 36, 47, 20, 53, 93, 51, 38, 94, 86, 73, 65, 69};

    int target = 76;

    @Test
    public void testSearchMethods() {
        assertEquals(true, search(arr, target));
        assertEquals(true, HashSetCode.hashCode(arr).contains(target));
        assertEquals(true, TreeSetCode.treeCode(arr).contains(target));
    }
}
