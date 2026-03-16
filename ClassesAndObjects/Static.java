class pre{

static int a=6;              // accessing static variable....
                                 
 static void fun1(){

System.out.println("this is fun1");        // accessing static member function.....
}

}

class Main{
    public static void main(String[]args ){

System.out.println(pre.a);               // * main note * static fun or variable is accessed 
                                         //  by class name . fun name();  
pre.fun1();                               


    }
}