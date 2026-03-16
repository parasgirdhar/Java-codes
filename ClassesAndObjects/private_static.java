class pre{
   private  static int a=67;     // this is private static variable....

int access(){
return a;                        // access by instance member fun.....
}

 private static  void get(){
   System.out.println("this is private static fun");    // this is private static function...
}

         void user(){         // this is instance member it is accessing the private static fun...
        get();
      }
}


class Main{
    public static void main(String []args){

   pre ref=new pre();               // create object for instance member....
   System.out.println(ref.access());                  // calling instance member......

    ref.user();                      // calling user function ....

    }
}