// private constructor is used when we want to private some data ...

// It is accessed only inside the class not outside......

class demo{
    int a;
    String b;
    boolean c;
    
    private demo(){
        a=23;
        b="coder";
        c=true;
        System.out.println(a +" " + b +" " + c);
    }
     public static void main(String []args){
            demo ref = new demo();
        }
}

   //     output =>    23 coder true

   // In these private constructor we do not make another class use constructor in same class....