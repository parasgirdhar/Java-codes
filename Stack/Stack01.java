import java.util.*;

class Stack01{
   
int arr [];
 int size ;
 int top ;



 Stack01(int size){

this.size = size;
 this.arr  = new int [size];

 top = -1;

 }

 void push(int element){
    if(top == size-1){
      System.out.println("Stack is overflow");
    }else{
         top++;
         arr[top] = element;
        
    }
 }



   void pop(){
     if(top >= 0){
          top--;
     }else{
        System.out.println("Underflow");
     }
   }


            int peek(){
                if(top < 0){
                    System.out.println("Stack is empty");
                    return -1;
                }else{
                     return arr[top];
                }
               
            }


    boolean isEmpty(){
            if( top == -1 ) {
            return  true;
            }   
                 else{
                       return false;
                    }
}


 public static void main(String []args){

Stack01 ref = new Stack01(5);


     ref.push(1);
      ref.push(2);
       ref.push(3);
      
ref.push(4);
ref.push(5);
ref.push(11); // It gives stack is overflow ...
      


   System.out.println(ref.peek());

   System.out.println(ref.isEmpty());

ref.pop();  // It removed element from stack ...



    }
}

