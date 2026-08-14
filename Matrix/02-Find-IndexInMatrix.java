import java.util.*;

class Main{
    public static void main(String []args){

Scanner sc= new Scanner(System.in);

System.out.println("Enter the number of rows");
int rows = sc.nextInt();

System.out.println("Enter the number of columns");
int columns = sc.nextInt();

int arr[][]= new int[rows][columns];

System.out.println("Enter the value of x");
int x = sc.nextInt();


for(int i=0;i<rows;i++){
    for(int j=0;j<columns;j++){
       arr[i][j]=sc.nextInt();
    }
    }

for(int i=0;i<rows;i++){
    for(int j=0;j<columns;j++){
        if(arr[i][j]==x){
            System.out.println("row is "+ i +" "+"Column is "+ j);
        }
    }
}

    }
}