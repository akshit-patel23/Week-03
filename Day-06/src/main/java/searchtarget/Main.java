package searchtarget;

public class Main {
    public static void main(String[] args) {
     int[] datasets = new int[1000000];
     for(int i=0;i<10000;i++){
         datasets[i]=i+1;
     }
     int key=9899;
        LinearSearch lsearch=new LinearSearch();
        System.out.println("Search time for Linear Search");
        System.out.println(lsearch.search(datasets,key));

         BinarySearch bin=new BinarySearch();
        System.out.println("Search time for Binary Search");
         System.out.println(bin.search(datasets,key));



    }
}
