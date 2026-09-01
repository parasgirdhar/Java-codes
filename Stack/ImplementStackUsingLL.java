import java.util.*;

class Node{

int data ;
Node next;

     public Node(int data){
        this.data = data;
        this.next = null;
     }

    }
         public class ImplementStackUsingLL{

             Node top = null;  // making top as null  ....
    

         public boolean isEmpty(){
             if(top == null){
                return true;
             }
               return false;       
}


public int peek(){

     if(top == null){ 
           return -1;
     }
     else{
           return  top.data;
     }
}

public void push(int data){
       Node newnode = new Node(data);
       newnode.next = top;
       top = newnode;
}

public void pop(){
       if(top == null){
        System.out.println("Stack is Empty");
       }  
       else{
        int data = top.data;
        top = top.next;
       }
}


public void display(){
          Node current = top;
          while(current != null){
            System.out.println(current.data);
            current = current.next;
          }
}


    public static void main(String []args){
         
       ImplementStackUsingLL stack = new ImplementStackUsingLL();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack:");

        stack.display();

        System.out.println("Top element: " + stack.peek());

        stack.pop();

        System.out.println("After pop:");

        stack.display();

        System.out.println("Is stack empty? " + stack.isEmpty());

    }
}