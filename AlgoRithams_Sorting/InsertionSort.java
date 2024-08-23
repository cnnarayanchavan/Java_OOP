package AlgoRithams_Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        insertionSort(arr);
        
    }
    public static void insertionSort(int[] arr){
        //now here we are sorting th earray partially 
        for (int i = 0; i < arr.length-1; i++) {
            //innerloop
            for (int j = i+1; j>0; j--) {
                if (arr[j]<arr[j-1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
