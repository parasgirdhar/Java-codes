
//  Example of Accessing private instance variable......

class pre{
   private int a=78;

int get(){
    return a;                // accessing private varibale into public function in same class
}


private void fun1(){
    System.out.println("this is private fun1");
}
                                                  // accessing private member function 
           void fun2(){
             fun1();
           }
}


class Main{
    public static void main(String []args){

     pre ref=new pre();
    System.out.println( ref.get());                     // calling member function....

     ref.fun2();
    }
}














