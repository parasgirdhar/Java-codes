// A Default constructor does not have any Parameter....

class demo{
    int a ;                           
    String b;
    boolean c;

    demo(){                      // This is normal constructor..........
        a=45;
        b="paras girdhar";
        c=true;
    }

    void get(){
        System.out.println(a +" " + b + " " + c);
    }

}

class Main{
    public static void main(String []args){
        demo ref = new demo();
        ref.get();                
    }
}                                 // output =>   45 paras girdhar true




// If we use default constructor in these situation it always give us null value.....

class demo{
    int a;
    String b;
    boolean c;

    void get(){
        System.out.println(a +" " + b + " " + c);
    }
}

class Main{
    public static void main(String []args){
        demo ref = new demo();
        ref.get();
    }
}                                           //  output =>    0 null false