package challengeproblems.comparestringsandfilereader;



import java.io.FileNotFoundException;

import static challengeproblems.comparestringsandfilereader.Compare.comparing;
import static challengeproblems.comparestringsandfilereader.FileReadAndCount.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String[] str={"Deepak","Singh"};
        comparing(str);
        String filepath = "src/main/java/challengeproblems/comparestringsandfilereader/Sample.txt";
        fileWordCountByFileReader(filepath);

        fileWordCountByInputStream(filepath);
        display();


    }
}