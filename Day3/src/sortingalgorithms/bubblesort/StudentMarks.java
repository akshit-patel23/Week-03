package sortingalgorithms.bubblesort;

public class StudentMarks {
    int [] marks;
    StudentMarks(int [] arr){
       this.marks=arr;
    }
    public static void bubblesort(int [] arr){
        int n=arr.length;
        boolean swapped;
        for (int i=0;i<n-1;i++){
            swapped=false;
            for (int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    public void show(){
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
