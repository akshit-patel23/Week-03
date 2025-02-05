package stringbuffer.performance;

public class Main {
    public static void main(String[] args) {
        StringBuildervsBuffer sbsv= new StringBuildervsBuffer();
        System.out.println("String Buffer time:"+sbsv.StringBuffer());
        System.out.println("String Builder time:"+sbsv.StringBuilder());

    }
}
