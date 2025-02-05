package stringbuilder.reversestring;


public class ReverseString {
    public static String reverseStr(String input){
        StringBuilder sb=new StringBuilder(input);
        return sb.reverse().toString();

    }

}
