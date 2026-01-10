import java.util.Scanner;

class Main{
    public static void main(String[] args){

    int reverse=0;
    int digit;
    Scanner sc=new Scanner(System.in);
    System.out.println("Eneter the value of n:");
    int n=sc.nextInt();

    while(n>0){

    digit=n%10;
    reverse=reverse*10+digit;
    n=n/10;
    }
   System.out.print(reverse);
    }
}


