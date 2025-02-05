package linearsearchtest.specificwordtest;

import linearsearch.specificword.SpecificWord;
import org.junit.Assert;
import org.junit.Test;


public class SpecificWord_Test {
    @Test
    public void tester(){
        SpecificWord obj=new SpecificWord();

        String inputsen="My name is akshit patel";
        String[] arr=inputsen.split("\\s+");

        String input="name";
        boolean result =obj.search (arr,input);


        Assert.assertEquals(true,result);

    }
}
