import java.util.*;

class Main{
    public static void main(String []args){
        
        int arr[]={3,6,2,8,1,9};       // apply on any sorted or unsorted array.....
        int target = 8;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Item found at index : " + + i);
            }
        }
        
    }
}