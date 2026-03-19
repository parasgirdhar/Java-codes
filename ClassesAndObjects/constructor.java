class Const{

   int x;
    int y;

void fun1(){
     
   System.out.println("the value of x is:"+ x);
   System.out.println("the value of y is:"+ y);
    
}

void fun2(){
    System.out.println("this is f2");
}

     Const(){
    x=5;
    y=10;
}
}

class Main{
    public static void main(String []args){

Const ref=new Const();
ref.fun1();

    }
}


