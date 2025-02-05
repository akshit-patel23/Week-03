
package inputstreamreader.readuserinput;



import java.io.*;
import java.util.Scanner;

public class ReadUserInput {
    public static void main(String[] args) throws IOException {
        String filePath="src/main/java/some.txt";
        FileWriter obj=new FileWriter(filePath);
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        obj.write(s);
        obj.close();
        sc.close();
        FileReader read=new FileReader(filePath);
        BufferedReader readfile=new BufferedReader(read);
        String readline;
        while ((readline=readfile.readLine())!=null){
            System.out.println(readline);
        }

    }}
