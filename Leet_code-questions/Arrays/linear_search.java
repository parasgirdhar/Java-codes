class linear_search{

static int linearsearch(int arr[] , int target){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            return i;
        }
    }
    return -1; // -1 means invalid...
}
    public static void main(String[] args) {
        
int arr[]={4,5,6,7,2,4,55,88,99,22,34,56,78};
int target = 7;

System.out.print(linearsearch(arr,  target));

    }
}