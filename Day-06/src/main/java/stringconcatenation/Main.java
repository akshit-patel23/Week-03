package stringconcatenation;



import static stringconcatenation.StringBufferCode.*;
import static stringconcatenation.StringBuilderCode.*;
import static stringconcatenation.StringCode.*;

public class Main {
    public static void main(String[] args) {
        String stringInput="Akshit";
        System.out.println("Time Taken by String :");
        stringCode(stringInput);
        System.out.println(stringTime);
        System.out.println("Time Taken by StringBuffer :");
        stringBuffer(stringInput);
        System.out.println(bufferTime);
        System.out.println("Time Taken by StringBuilder :");
        stringBuilder(stringInput);
        System.out.println(builderTime);
    }
}
