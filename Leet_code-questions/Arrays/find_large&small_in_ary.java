class mainclass{
    public static void main(String []args){

int arr[]={2,6,4,9,7,6};
int max=0;

for(int i=0;i<=arr.length-1;i++){
  if(arr[i] > max){
    max = arr[i];
  }  

}
System.out.print(max);


int min=arr[0];
for(int i=1;i<=arr.length-1;i++){
  if(arr[i]<min){
    min=arr[i];
  }
}
System.out.println();
System.out.println(min);

    }
}