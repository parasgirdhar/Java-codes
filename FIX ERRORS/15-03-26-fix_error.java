
// Fix error of these question return output 15......

int[] arr = {1, 2, 3, 4, 5};

int sum = 0;

for (int i = 0; i < arr.length; i++) {
    sum = arr[i];
}

System.out.println(sum);


// Error fixed by using class, , main member , and logic:- sum=sum+arr[i];..

class Main{
    public static void main(String []args){

int arr []= {1, 2, 3, 4, 5};

int sum = 0;


for (int i = 0; i < arr.length; i++) {
        sum= sum+ arr[i];
}

System.out.println(sum);
        
    }
}
