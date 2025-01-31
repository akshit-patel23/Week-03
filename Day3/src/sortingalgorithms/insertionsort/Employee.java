package sortingalgorithms.insertionsort;

public class Employee {
    int []EmployeeID;

    public Employee(int[] EmployeeID){
        this.EmployeeID=EmployeeID;
    }

    public void insertionSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j =i-1;

            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public void show(){
        for (int i = 0; i < EmployeeID.length; i++) {
            System.out.println(EmployeeID[i]);
        }
    }


}
