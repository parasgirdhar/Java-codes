


//  Example of Accessing public instance variable......

class pre{
    int a=56;
    int b=43;
    int c=a+b;
}


// Example of Accessing public member function........

class InsatnceMember{

    void fun1(){
        System.out.println("this is fun1 public member function");
    }

}


class Main{
    public static void main(String []args){

  pre ref=new pre();                 // making object of class pre .....
  System.out.println(ref.a);        // printing the value of c 
  

  InsatnceMember obj=new InsatnceMember();           // object of class instance member...
  obj.fun1();                                        // calling member function

    }
}




