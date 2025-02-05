package stringbuilder.removeduplicates;

public class Main {
    public static void main(String[] args) {
        RemoveDuplicates rm=new RemoveDuplicates();

        String input = "hgggjkkk";
        String result = rm.removeDuplicates(input);
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);
    }
}
