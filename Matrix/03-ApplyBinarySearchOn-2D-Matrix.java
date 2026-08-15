import java.util.*;

class Main{
    public static void main(String []args){

int row = 3;
int column=4;

int arr [][]= new int [row][column];

arr[0]= new int[]{2,4,6,8};
arr[1]= new int[]{12,14,16,18};
arr[2]= new int[]{22,24,26,28};

int target = 16;
    
    boolean found = false;

    int low = 0;
    int high = (row*column)-1;

      while( low <= high){

                int mid = low+(high-low)/2;
           int r = mid/column;    // finding Index of row..
           int c = mid % column; // finding Index of column ..


               if(arr[r][c] == target){
                System.out.println("Index of row is " + r + " " + "Index of column is "+ c);
                found = true;
                break;
               }
             
               else if(arr[r][c] > target){
                   high = mid-1;
               }
               else{
                low = mid+1;
               }

      }
          if(!found){
         System.out.println("No Such Element is Present in list");
          }
    
    }
}