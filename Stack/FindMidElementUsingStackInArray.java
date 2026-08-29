// Normal type ....

import java.util.Stack;

class FindMidElementUsingStackInArray{
    public static void main(String []args){

   int arr []= new int[5];
     
        Stack <Integer> ref = new Stack<>();

          arr[0]=34;
            arr[1]=24;
             arr[2]=64;
              arr[3]=74;
               arr[4]=94;
              

          for(int i=0;i<arr.length;i++){
            ref.push(arr[i]);
          }
  
     int mid = arr.length/2;

     for(int i=arr.length-1;i>mid;i--){
        ref.pop();  
     }

        int result = ref.pop();

System.out.println(result);


    }
}



// Method type ........

import java.util.*;

class Main{

       public int FindMid(int arr[] , int mid){
           Stack <Integer> ref = new Stack <>();

            arr[0]=45;
            arr[1]=75;
            arr[2]=12;
            arr[3]=84;
            arr[4]=90;

              for(int i=0;i<arr.length;i++){
                ref.push(arr[i]);
              }   


              mid = arr.length/2;

              for(int i=arr.length-1;i>mid;i--){
                ref.pop();
              }

               int result = ref.pop();
         
                  return result;
       }
    public static void main(String []args){
       int arr [] = new int [5];
       int mid =0;

              Main obj = new Main();
             int fetched = obj.FindMid(arr,mid);

         System.out.println(fetched);

    }
}