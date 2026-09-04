import java.util.*;

class Node{

      int data;
      Node next;

         public Node(int data){
              this.data=data;
              this.next=null;
         }

    public static Node InsertAtHead(Node head , int val){
         
          Node newnode = new Node(val);
         
             newnode.next = head;
             head = newnode;
             return head;
    }
 
        public static Node InsertAtTail(Node tail , int val){
                   
            Node temp = new Node(val);
            tail.next = temp;
            tail=tail.next;
             return tail;
        }

     public static void print(Node head){
              Node temp = head;
              while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
              }
       System.out.println();
     }


     public static Node NodeToInsert(Node head , int index , int val){
            
 
                  Node temp = head;
                    int counter = 1;                     
                  while(counter < index-1){
                    
                     temp = temp.next;
                     counter++;   
                  }
                  Node nodetoinsert = new Node(val);
                      nodetoinsert.next = temp.next;
                      temp.next = nodetoinsert;
    
              return nodetoinsert;
     }

    public static void main(String[] args) {
       
        
       Node first = new Node(3);
           
       Node head = first;
       Node tail = first;
       Node nodetoinsert = first;
      
     
        head = InsertAtHead(head , 6);
        print(head);


          tail =  InsertAtTail(tail , 89);
                 print(head);


             nodetoinsert = NodeToInsert(head, 3, 100);
             print(head);

    }
}