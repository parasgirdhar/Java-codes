import java.util.*;

class Main{
    public static void main(String []args){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows");
    int rows = sc.nextInt();
        
        System.out.println("Enter the number of Columns");
    int columns = sc.nextInt();

      int arr [][]  = new int [rows][columns];

          for(int i=0; i < rows; i++){
                for(int j=0; j < columns ; j++){
                   arr[i][j]= sc.nextInt();
                }
                     }
                      System.out.println(); // for making some space..
                      
               for(int i=0; i < rows; i++){
                for(int j=0; j < columns ; j++){
                    System.out.print(arr[i][j] +  " ");
                }
                System.out.println();
               }
    }
}


