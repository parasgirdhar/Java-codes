public class Recursive_LL_With_Length {
    
    public static void display(Node head  , int counter){

if(head == null){
      System.out.println("Total length is : "+ + counter);
    return;
}

else{
    display(head.next, counter+1);             // function called here......
    System.out.println(head.data);   // It print elements while returning .....
}

}

public static class  Node{

int data;
Node next;

     Node(int data){

this.data=data;
this.next=null;
}

}

    public static void main(String []args){

 Node a=new Node(74);
   Node b=new Node(98);
    Node c=new Node(12);
     Node d=new Node(52);
      Node e=new Node(34);

     a.next=b;
     b.next=c;
     c.next=d;
     d.next=e;
     
    display(a, 0);

    }
}


