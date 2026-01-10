import java.util.Scanner;

class Main{
    public static void main(String[] args){
        int sum=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
         while(n>0){

         sum=sum+n%10;
         n=n/10;
         }
         System.out.println(sum);

    }
}
