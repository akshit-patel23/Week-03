
package hashmapshashfunctions.longestconsecutivesequence;

import java.util.HashMap;

public class LongestConsecutive {
    int size;
    int[] base;
    public int find(int k){
        int count=1;
        int number=base[k];
        for(int i=k;i<size-1;i++){
            if ((number+count)==base[i+1]){
                count++;
            }
        }
        return count;

    }
    HashMap<Integer,Integer> consecutivemap=new HashMap<>();
    public void consecutive(int arr[]){
        base=arr;
        size= arr.length;
        for(int j=0;j<size;j++){
            consecutivemap.put(j, find(j));

        }

    }

    public void maxConsecutive(){
        int max=Integer.MIN_VALUE;
        for (Integer value : consecutivemap.values()) {
            // Compare each value with max and update max if needed
            if (value > max) {
                max = value;
            }
        }
        System.out.println("The longest consecutive sequence length :- "+max);
    }
}


