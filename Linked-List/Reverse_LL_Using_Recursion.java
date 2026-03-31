public class Reverse_LL_Using_Recursion {

    public static void display(Node head){

if(head == null){
    return;
}

else{
    
    display(head.next);             // function called here......
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
     
    display(a);

    }
}
