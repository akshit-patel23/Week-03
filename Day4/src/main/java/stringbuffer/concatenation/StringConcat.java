package stringbuffer.concatenation;

public class StringConcat {
    public static String concat(String[] arr){
        StringBuffer res;
        res = new StringBuffer();
        for (String s : arr) {
            res.append(s);
        }
        return res.toString();
    }

}
