package AlgoRithams_Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int ele = 5;
        int result = binarySearch(arr,ele);
        System.out.println("Element found at index: "+result);
    }
    static int binarySearch(int[] arr, int ele){
        int start = 0;
        int end = arr.length-1;
        
        while(start <= end){
            int mid = (start + end )/2;
            
            //first condition
            if(ele > arr[mid]){
                start = mid + 1;
            }
            else if(ele < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
