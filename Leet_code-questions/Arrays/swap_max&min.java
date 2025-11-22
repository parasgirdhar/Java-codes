// print smallest and largest element of an array and swap that max and min... 

class mainclass{
    public static void main(String[] args) {
        
int nums[]={1,2,3,4,5};

int largest=Integer.MIN_VALUE;
int smallest=Integer.MAX_VALUE;
int largestindex=0;
int smallestindex=0;

for(int i=0;i<nums.length;i++){
    if(nums[i]>largest){
        largest=nums[i];
        largestindex=i;
    }

     if(nums[i]<smallest){
        smallest=nums[i];
        smallestindex=i;
    }
}
int temp=nums[largestindex];
nums[largestindex]=nums[smallestindex];
nums[smallestindex]=temp;

System.out.println("smallest is :" + smallest);
System.out.println("largest is :" + largest);

for(int i=0;i<nums.length;i++){
    System.out.print(nums[i] +" ");
}


    }
}