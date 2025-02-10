package searchtarget;

public class BinarySearch {
    public long search(int[] arr,int key){
        long starttime,endtime;
        starttime=System.nanoTime();
        int start=0;
        int end=arr.length-1;


        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                endtime=System.nanoTime();
                return (endtime-starttime);
            }
            else if (arr[mid]<key) {
                start=mid+1;
            }
            else if (arr[mid]>key){
                end=mid-1;
            }
        }
        endtime=System.nanoTime();
        return (endtime-starttime);
    }
}
