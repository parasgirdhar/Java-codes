import java.util.*;

class Testing extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}

class Main{
    public static void main(String []args){
        
        Testing obj1 = new Testing();
        Testing obj2 = new Testing();
        Testing obj3 = new Testing();
        Testing obj4 = new Testing();
        
        obj1.start();
        obj2.start();
        obj3.start();
        obj4.start();
        
    }
}

// output =>   Thread-0
                 Thread-2
                     Thread-1
                          Thread-3