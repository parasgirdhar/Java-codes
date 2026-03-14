// fix error in these question..... 

int[] arr = {3, 5, 7, 9, 11};

for (int i = 0; i <= arr.length; i++) {
    System.out.println(arr[i]);
}


// Error is fixed by using class and main method....


class Main{
    
    public static void main(String []args){
        
        int arr[] = {3, 5, 7, 9, 11};

for (int i=0; i<= arr.length-1; i++) {
    System.out.println(arr[i]);
}
    }
}