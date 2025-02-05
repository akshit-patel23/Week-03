package stringbuffertest.concatenatestringtest;

import stringbuffer.concatenation.StringConcat;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConcatenateStrings_test {
    @Test
    public void tester(){
        StringConcat obj=new StringConcat();
        String[] input=new String[]{"Akshit","Patel"};

        assertEquals("AkshitPatel",obj.concat(input).toString());

    }
}