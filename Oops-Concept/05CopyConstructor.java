// A copy constructor is a constructor that creates a new object by copying the values from another object of the same class.

// Unlike C++, Java does not provide a built-in copy constructor mechanism, but you can define one yourself.

// why do we need copy constructor =>  

   // 1 . Create a duplicate of an object.

   // 2. we dont need to do direct changes in main object..


class demo{
    int a; int b; String c;
    demo(){
        a=12;
        b=67;
        c="learn coding";
        System.out.println(a + " " + b + " " + c);
    }
    demo(demo ref){
        a=ref.a;
        b=ref.b;
        c=ref.c;
         System.out.println(a + " " + b + " " + c);
    }
    
}
class Main{
    public static void main(String []args){
        demo ref = new demo();
        demo ref2 = new demo(ref);
        demo ref3= new demo(ref2);
        demo ref4=new demo(ref3);
    }
}


// output =>    12 67 learn coding 
//              12 67 learn coding 
//              12 67 learn coding 