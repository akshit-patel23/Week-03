package stringbuffertest.performancetest;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import stringbuffer.performance.StringBuildervsBuffer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerformanceTest {
    @Test
    public void tester() {
        StringBuildervsBuffer obj = new StringBuildervsBuffer();


        long bufferTime = obj.StringBuffer();
        long builderTime = obj.StringBuilder();


        assertEquals(true, bufferTime > builderTime);
    }
}