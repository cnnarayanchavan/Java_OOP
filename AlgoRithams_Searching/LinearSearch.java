package AlgoRithams_Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {1,23,4,45,5};
        int target = 5
        ;
        linearSearch(arr,target);   
    }
    public static void linearSearch(int [] array, int targetElement){
        for(int i = 0; i < array.length; i++){
            if(array[i] == targetElement){
                System.out.println("Element fount at index: "+i);
            }   
        }
    }
}
