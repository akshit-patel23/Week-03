
package filereader.linebyline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLinebyLine {
    public static void main(String[] args) {
        String filePath="C:/Users/Ashika/Desktop/Week-03/Day4/src/main/java/some.txt";
        try(BufferedReader br=new BufferedReader(new FileReader(filePath))){
            String line;
            while((line=br.readLine())!=null){

                System.out.println(line);
            }}
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
