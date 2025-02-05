package stringbuildertest.removeduplicatestest;



import stringbuilder.removeduplicates.RemoveDuplicates;
import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesTest{
    @Test
    public void tester(){
        RemoveDuplicates obj=new RemoveDuplicates();


        String result=obj.removeDuplicates("Banana");

        Assert.assertEquals("Ban",result);

    }
}
