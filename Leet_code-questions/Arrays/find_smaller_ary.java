// find smaller value in an array....

class smaller{
public static void main(String[]args){

int nums[]={3,5,6,8,9,-45,26,7,80,65};
int size=10;

int smallest=Integer.MAX_VALUE;  //assumed as infinity...

for(int i=0;i<size;i++){
if(nums[i]<smallest){
   smallest=nums[i];
}
}
System.out.print(smallest);


   }
}