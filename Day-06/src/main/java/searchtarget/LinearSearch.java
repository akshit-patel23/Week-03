package searchtarget;

public class LinearSearch {
    public long search(int[] arr,int key){
        long starttime=System.nanoTime();
        long endtime;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                endtime=System.nanoTime();
               return (endtime-starttime);
            }
        }
        endtime=System.nanoTime();
        return (endtime-starttime);
    }
}
