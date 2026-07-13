class Main{
    public static int[] CountZeroOne(int arr[]){
      
               int zero=0;
        int one = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zero++;
            }else{
                one++;
            }
        }
        return new int []{zero , one };
    }
    
    public static void main(String []args){

        
        int arr[]={0,1,1,1,0,1,0,1,1,0,0,0,1,0,0,0,0,0,1};
       
        int res[] = CountZeroOne(arr);
        System.out.println("the count of zero is :" + + res[0]);
          System.out.println("the count of one is :" + + res[1]);
    }
}