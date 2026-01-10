// find the sum of series (+1 -2 +3 -4 +5 -6.......n)

import java.util.Scanner;

class Main{
    public static void main(String [] args){

        int result=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            if(i%2==0){
                result=result-i;
            }
            else{
                result=result+i;
            }
        }
        System.out.println(result);

    }
}
