class construc{
    int a;
    String b;

 construc(){  
   a=0;
   b=null;
   
}

 void show(){
   System.out.println(a+ " " + b); 
 }
}

class Main{
    public static void main(String []args){
        construc ref = new construc();
        ref.show();
    }
}                               //  output =>     0 null


// Default constructor =>


    class construc{
    int a;
    String b;

 void show(){
   System.out.println(a+ " " + b); 
 }
}

class Main{
    public static void main(String []args){
        construc ref = new construc();
        ref.show();
    }                                        
}                                                        //  output =>     0 null