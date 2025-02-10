package fibonaccicomputationtest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static recursivevsiterativefibonacci.IterativeCode.fiboIterative;
import static recursivevsiterativefibonacci.RecursiveCode.recursiveFibo;

public class FibonacciCompuationTest {
    @Test
    public void testFibonacciMethods() {
        int n = 10;
        long expected = 55;

        assertEquals("Iterative method failed", expected, fiboIterative(n));
        assertEquals("Recursive method failed", expected, recursiveFibo(n));
    }
}
