class Recursion{

public static void fetch(int i , int n , int sum){

if(i==n){                     // base condition for sum of n natural number...
     sum=sum+i;
     System.out.println(sum);  // taking output in if condition beacuse to print last number in a loop...

    return ;
}
else{
      
    sum=sum+i;                             // Logic for sum of natural numbers...
    //   System.out.println(sum);   
   fetch(i + 1, n, sum);     
}

}
public static void main(String []args){
// int i=1;
// int sum=0;
// int n=4;
fetch(1, 5, 0);
}
}