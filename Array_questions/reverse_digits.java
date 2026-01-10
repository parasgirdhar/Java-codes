import java.util.Scanner;

class Main{
    public static void main(String[] args){

    int reverse=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Eneter the value of n:");
    int n=sc.nextInt();

    while(n>0){
    reverse=n%10;
    n=n/10;
   System.out.print(reverse);
    }

    }
}

