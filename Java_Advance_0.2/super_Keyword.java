
class green{
    int a =10;
}

class blue extends green{
 
    int a=4;
      void get(){
        System.out.println(a);
      }

}

class Main{

    public static void main(String []args){

    blue ref = new blue();
    ref.get();

                          // output => 4 ehy 4 print kr rhy kyoki compiler differentiate nhi kr pa rhya super ty sub variable dy vich....compiler ny 4 taa print krta kyoki jis class da object bny + jis class vich function hai ohne ossy variable nu priority dee deti ty print krta....
    }
}


/*  hun ehda solution ehy aa ke compiler nu differentiate pta chly super ty sub variable de vich .. */


class p{
int a = 10;
}

class m extends p{
    int a = 2;
    void get(){
       System.out.println(super.a); // here super keyword tells compiler that this a is from super class...
        System.out.println(a);
    }
}

class Main{
public static void main(String []args){
    m ref = new m();
    ref.get();
}
 }                  /*      output => 10, 2      */  



 // imp => Main purpose of super keyword is to access parent class members , variables ......



 // now use super in methods.....

 
class p{

void show(){
    System.out.println("this is super");
} 

}

class r extends p{
    void show(){       
        System.out.println("this is sub ");
        super.show();
    }
}


class Main{
    public static void main(String []args){
        r ref = new r();
        ref.show();
    }
}                             // output =>    this is sub    this is super



// in case of constructor super is assigned by ourself so pehla jehde class auugi ohda method run kr dugaa fir odo baad jehde augii ohda kr dugiii....


class p{

    p(){
        System.out.println("this is super const...");
    }
}


class b extends p{
       
    b(){
        System.out.println("this is sub constr....");
    }
}


class Main{
    public static void main(String []args){

   b ref = new b();


    }
}           // output =>    this is super const...  this is sub constr....



// imp => In parametrized constructor it is compulsary to add super keyword if want to acess variables of same name ....


class p{

    p(int a){
        System.out.println("this is super const..."+ a);
    }
}

class b extends p{
     
    b(int c){
         super(23);      // it pass 23 to its super class(upper calss)....
        System.out.println("this is sub constr...."+ c);
    }
}

class m extends b{
  
    m(int h){
        super(43);       // it pass 43 to its super class(upper calss)....
        System.out.println("here m is accessed....."+ h );
    }
}

class Main{
    public static void main(String []args){

   m ref = new m(5);   // it pass 5 to class h ....

    }
}