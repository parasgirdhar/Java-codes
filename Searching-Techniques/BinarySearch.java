import java.util.*;      // Binary Search.......

class Main{
  public static void main(String []args){

int arr[]={11,23,34,43,57,68,76,81,99};   // It works only on sorted array....

int start=0;
int end = arr.length-1;
int key=100;

Boolean found = false;

while(start<=end){
  int mid=(start + end) / 2;

  if(arr[mid]==key){
    System.out.println("Key found at"+  + mid);
    found = true;
    break;
  }

else if(arr[mid]>key){
    end = mid-1;
}

 else if(arr[mid]<key){
  start=mid+1;
 }

}
if(!found){
  System.out.println("No Element is Found");
}
  }
}