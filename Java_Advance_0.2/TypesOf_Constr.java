

 /* Class in Java (Definition)

A class is a blueprint or template used to create objects.
It defines properties (variables) and behaviors (methods).   



class Car {
    String color;
    int speed;

    void drive(){
        System.out.println("Car is running");
    }
}




Object in Java (Definition)

An object is an instance of a class.
It represents a real-world entity and contains actual values.

🔹 Example:
Car c1 = new Car();   

*/



/* <<<<<<<<<<<<<<<<<<<<<< .... All Types of Constructors  ...... >>>>>>>>>>>>>>>>>>>>>> */


class A{
   
      int access;
        String fetch;

        int user;
        boolean client;
        double data;

     A(int a , String s){   // here we give parameters to constructor A.....
        access=a;   // a nu appa access vich pa ta ...
        fetch=s;    // s nu appa fetch vich pa ta...

     }


     A(int z , boolean f , double t){         //here we are create another constructor in same class...
          user = z;
          client = f;
          data = t;
     }

          void Testing(){
           System.out.println(user);
           System.out.println(client);
           System.out.println(data);
          }


     void get(){
          System.out.println("this is a :"+ access);
          System.out.println("this is s : "+ fetch);
     }

    public static void main(String []args){
          A ref = new A(3,"paras");  // passing arguments to parameters.....
          ref.get();             // calling get function  ....
           
           
         A ref2 = new A(5,true,102.67);
         ref2.Testing();
    }
}    

/* ............ appa ek class vich ek too jyada constructor ve bna skty haa .............. */


// here below is copy constructor..................


class alpha{

int a;
int c;

String r;

alpha(){
    a = 45;
    c=23;
    r="Content";

    System.out.println(r+"copied successfully" +a +c);
}

alpha(alpha ref){
    a=ref.a;
    c=ref.c;
    r=ref.r;

   System.out.println(r+"copied successfully" +a +c);

}


public static void main(String []args){

alpha obj = new alpha();
alpha obj2 = new alpha(obj);

}

}



// here below is same copy constructor but in standard and good way .....


class Alpha {

    int a;
    int c;
    String r;

    // Default constructor
    Alpha() {
        a = 45;
        c = 23;
        r = "Content";
    }

    // Copy constructor
    Alpha(Alpha ref) {
        this.a = ref.a;
        this.c = ref.c;
        this.r = ref.r;
    }

    // Method to display data
    void display() {
        System.out.println(r + " copied successfully " + a + " " + c);
    }

    public static void main(String[] args) {

        Alpha obj1 = new Alpha();      // original object
        Alpha obj2 = new Alpha(obj1); // copy object

        obj1.display();
        obj2.display();
    }
}



/* ............................. Private constructor ............................... */

/*  class NP{

  int x;
  int y;


  private NP(){
    x=3;
    y=4;
    System.out.println("take access is possible");
  }
}

  class BP{
    public static void main(String []args){

     NP ref = new NP();

    }
  }  */

 // It give error kyoki appa ek private member nu dusri class vich access krn de koshish kr rhy ha ..


 /* 
            NP.java:17: error: NP() has private access in NP
                          NP ref = new NP();
              ^
                               1 error
     */




  /* ...... <<<<<<<<<< To solve this we use static method inside (same) local class .... >>>>>>>>>>>>*/ 
  

  class local{

int x;
private local(){    // set private constructor .....
x=3;
System.out.println(x + "is accessed");
}

   public static local fun1(){  // this static method access private constructor .....
    return new local(); // with (new) local we are creating object which automatically call constructor of call local 
   }

}

class Main{
    public static void main(String []args){
  
    // local ref = local.fun1();  // we can also use thia
    local.fun1();  // static method is called with className . methodName();

    }
}
