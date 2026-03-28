// printing numbers from 5 , 4, 3, 2, 1

class Recursion{

public  void Call(int n){

    if(n == 0){
        return ;
    }

    else{
        System.out.println(n);
       Call(n-1);
    }
}

public static void main(String []args){


int n=5;
        Recursion ref=new Recursion();
        ref.Call(n);

}


}








