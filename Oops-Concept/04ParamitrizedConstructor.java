// A Constructor through which we can pass one or more parameter that is parametrized constructor...

class demo{
    int a;
    int b;
        String c;
    demo(int x , int y){
      a=x;
      b=y;
    }

    void show(){
        System.out.println("a is :"+ a + "b is :"+ b);
    }
}

class Main{
    public static void main(String []args){
        demo ref = new demo(100, 45);
        ref.show();
    }
}                                              // output =>   a is : 100 b is : 45



            // Now try with different parameter and more than one constructor....

class demo{
    int a;
    int b;
        String c;
    demo(int x , int y){
      a=x;
      b=y;
    }

    demo(int z , String m){
       b=z;
       c=m;
       System.out.println("age is : " + b  + " name is : " + c);
    }

    void show(){
        System.out.println("a is : "+ a + "b is :"+ b);
    }
}

class Main{
    public static void main(String []args){
        demo ref = new demo(100, 45);
        demo re = new demo(22 , "paras girdhar");
        ref.show();
    }                                                 // output => age is : 22 name is : paras girdhar
                                                        a is : 100b is :45
}