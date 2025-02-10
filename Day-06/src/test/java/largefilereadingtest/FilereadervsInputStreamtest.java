package largefilereadingtest;

import largefilereading.FileReaderTime;
import largefilereading.InputStreamReaderTime;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FilereadervsInputStreamtest {
    @Test
    public void test() {
        FileReaderTime fread= new FileReaderTime();
        InputStreamReaderTime istream= new InputStreamReaderTime();
        assertEquals(true,fread.readtime("C:\\Users\\Ashika\\Desktop\\Week-03\\Day-06\\src\\test\\java\\largefilereadingtest\\Sample.txt")>istream.readtime("C:\\Users\\Ashika\\Desktop\\Week-03\\Day-06\\src\\test\\java\\largefilereadingtest\\Sample.txt"));
    }
}
