package hashmapshashfunctions.longestconsecutivesequence;

public class Main {
    public static void main(String[] args) {
        LongestConsecutive longest=new LongestConsecutive();

        int arr[]={1,2,3,4,8,9,5};
        longest.consecutive(arr);
        longest.maxConsecutive();
    }
}