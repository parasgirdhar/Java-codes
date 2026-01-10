import java.util.Scanner;
class Main{
    public static void main (String []args){

        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();

        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);

    }
}
