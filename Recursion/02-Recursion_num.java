//printing numbers from 1 to 5.....

class Recursion{

public static void recur(int s){

if(s==6){                // This is our base case of recursion.....
    return ;
}

else{
    System.out.println(s);
    recur(s+1);
}

}
    public static void main(String []args){
     int s=1;
     recur(s);   

    }
}