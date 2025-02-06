package challengeproblemtest.comparestringtest;



import challengeproblems.comparestringsandfilereader.Compare;
import challengeproblems.comparestringsandfilereader.FileReadAndCount;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;

import static challengeproblems.comparestringsandfilereader.FileReadAndCount.*;

public class CompareStringTest {
    @Test
    public void testers() throws FileNotFoundException {
        Compare compare=new Compare();
        FileReadAndCount file=new FileReadAndCount();
        String[] str={"Akshit","Patel"};
        String resultComp=compare.comparing(str);
        String filepath = "src/main/java/challengeproblems/comparestringsandfilereader/Sample.txt";
        fileWordCountByFileReader(filepath);

        fileWordCountByInputStream(filepath);
        String res=file.display();
        Assert.assertEquals("StringBuilder is faster then StringBuffer",resultComp);
        Assert.assertEquals("InputStreamReader is faster then File reader",res);


    }

}
