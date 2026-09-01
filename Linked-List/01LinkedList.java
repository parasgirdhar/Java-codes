import java.util.*;

class Node{

   int data;
   Node next;

   public Node(int data){
       this.data=data;
       this.next = null;
   }
        

    public static void main(String []args){
          
         Node second = new Node(56);
         Node Third = new Node(34);
         Node fourth = new Node(12);
         Node fifth = new Node(90);
        
            second.next=Third;
            Third.next=fourth;
            fourth.next=fifth;
            fifth.next=null;

          

        Node current = second;

            Node first= current;

        while(current !=null){
            System.out.println(current.data);
            current = current.next;
        }

    }
}



// Now add element at first position in LL...


class Node{


    int data;
    Node next;

    public Node(int data){
          this.data=data;
          this.next=null;
    }

    public static void main(String []args){

     Node second = new Node(56);
     Node third = new Node(26);
     Node fourth = new Node(89);

 
     second.next=third;
      third.next=fourth;
      fourth.next=null;

     Node head = second;


        Node newnode = new Node(100);
      newnode.next=head;

         head = newnode ;


        while(head !=null){
            System.out.println(head.data);
                head=head.next;
        }


    }
}



// Adding String into first position of Linked list ...

class Node{

      String data;
      Node next;


         public Node(String data){
              this.data=data;
              this.next=null;
         }

    public static void main(String[] args) {
        

        Node a = new Node("im second node");
         Node b = new Node("im third node");
          Node c = new Node("im fourth node");
           Node d = new Node("im fifth node");


              a.next=b;
              b.next=c;
              c.next=d;
              d.next=null;



       Node head = a;
         
        Node newnode = new Node("Hello im head node");
       newnode.next=head;
          head = newnode;


        while(head !=null){
            System.out.println(head.data);
            head=head.next;
        }




    }
}