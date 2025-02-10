package stringconcatenation;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static stringconcatenation.StringBufferCode.*;
import static stringconcatenation.StringBuilderCode.*;
import static stringconcatenation.StringCode.*;

public class StringConcatenationTest {
    @Test
    public void testConcatenationTimes() {
        String stringInput = "Akshit";

        stringCode(stringInput);
        stringBuffer(stringInput);
        stringBuilder(stringInput);

        assertTrue("String should take the longest time", stringTime > bufferTime && stringTime > builderTime);
        assertTrue("StringBuilder should be the fastest", builderTime < bufferTime);
    }
}
