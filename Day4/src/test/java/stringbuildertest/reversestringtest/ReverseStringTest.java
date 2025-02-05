package stringbuildertest.reversestringtest;
import stringbuilder.reversestring.ReverseString;
import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {
    @Test
    public void tester(){
        ReverseString obj=new ReverseString();

       String rev= obj.reverseStr("Akshit");


        Assert.assertEquals("tihskA",rev);

    }
}
