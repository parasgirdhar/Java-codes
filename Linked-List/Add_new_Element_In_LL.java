class Add_New_Node_At_beginning {

public static class Node {

int data;
Node next;

Node(int data){
      this.data=data;
      this.next=null;
}
}
      public static void main(String []args){

      Node x = new Node(65);
       Node f = new Node(6);
       Node newnode=new Node(99);
       
     x.next=f;

     Node head=x;

          newnode.next=head;         // here we link the address of new node with head...
          head=newnode;              //  here we set head=newnode.....

                  while(head != null){
                        System.out.println(head.data);
                        head=head.next;
                  }
         }

      }
