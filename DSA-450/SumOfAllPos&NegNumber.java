
// sum of all positive and negative number is an array..........


class Main{
    
    public static int[] res(int arr []){
        int sum = 0;
        int minus = 0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                sum = sum+arr[i];
            }else{
                minus= minus+arr[i];
            }
        }
       
         int ans [] = {sum , minus};
         return ans;
    } 
    
    public static void main(String []args){
        
        int arr[]={3,-5,-8,1,9,-2};
        
       int ans [] = res(arr);
        System.out.println("sum is :" + + ans[0]);
        System.out.println("minus is : " + + ans[1]);
    }
}