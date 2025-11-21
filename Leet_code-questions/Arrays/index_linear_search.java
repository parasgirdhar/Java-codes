public class index_linear_search {
    public static void main(String[] args) {
        
int arr[]={4,5,67,87,23,12,98,54,33,22,88};
int target=12;
int index=-1;

for(int i=0;i<arr.length;i++){
    if(arr[i]==target){
        index = i;
    }
}
if(index!=-1){
    System.out.print("index value is : "+ index);
}
else{
    System.out.print("index not found");
}

    }
}
