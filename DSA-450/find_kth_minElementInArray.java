// sort array and find kth minimumelement of an array...

import java.util.Scanner;
import java.util.Arrays;
class Main{
    
    public static void main(String []args){
        
        int nums[]={3,4,1,5,2};
      
        int k;
        System.out.print("enter the value of k : ");
        Scanner sc= new Scanner(System.in);
        k=sc.nextInt();
    
        Arrays.sort(nums);
        int result=nums[k-1];
        
        System.out.println("Your output is :"+ result);
        
    }
}