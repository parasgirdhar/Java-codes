class Main{
    public static void main(String []args){
        
        int arr[]={4,5,3,56,7,2,6,9};
        
        int lar=0;
        int small = arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                lar=arr[i];
            }
        }
        System.out.println("Larger elem is :"+ lar);
        
        for(int j=0;j<arr.length;j++){
            if(small>arr[j]){
                small=arr[j];
            }
        }
        System.out.println("Small elem is :" + small);
        
    }
}